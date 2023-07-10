package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;

public class ListSingleUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get single user with valid parameter id {}")
    public void getSingleUserWithValidParameterId(int id) {
        reqresAPI.getSingleUser(id);
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when()
                .get(ReqresAPI.GET_SINGLE);
    }

    @And("Response body page should be display firstName {string} and lastName {string}")
    public void responseBodyPageShouldBeEmailAndFirstName(String first_name, String last_name) {
        SerenityRest.then()
                .body(ReqresResponses.fName, equalTo(first_name))
                .body(ReqresResponses.lName, equalTo(last_name));
    }

    @Given("Get single user with invalid parameter id {}")
    public void getSingleUserWithInvalidParameterId(int id) {
        reqresAPI.getSingleUser(id);
    }

    @When("Send request get single user with invalid parameter")
    public void sendRequestGetSingleUserWithInvalidParameter() {
        SerenityRest.when()
                .get(ReqresAPI.GET_SINGLE);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int code) {
        SerenityRest.then()
                .statusCode(code);
    }

    @Given("Get single user with invalid parameter {string}")
    public void getSingleUserWithInvalidParameter(String id) {
        reqresAPI.getSingleUserInvalidParam(id);
    }

    @And("Validate get single user JSON schema")
    public void validateGetSingleUserJSONSchema() {
        File json = new File(Constants.List_Schema + "/SingleUserSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}

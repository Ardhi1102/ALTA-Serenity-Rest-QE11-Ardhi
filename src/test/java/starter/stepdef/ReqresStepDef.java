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

import static org.hamcrest.Matchers.equalTo;

public class ReqresStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Get list user with valid parameter {int}")
    public void getListUserWithValidParameter(int page) {
        reqresAPI.getListUsers(page);
    }

    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when().get(reqresAPI.GET_LIST_USERS);
    }


    @And("Response body should be {int}")
    public void responseBodyShouldBe(int page) {
        SerenityRest.and().body(ReqresResponses.PAGE, equalTo(page));
    }

    @When("Send request post creaete user")
    public void sendRequestPostCreaeteUser() {
        SerenityRest.when()
                .post(ReqresAPI.POST_CREATE_USERS);
    }

    @Then("Status code should be {int} created")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then()
                .statusCode(created);
    }

    @Given("Put update user with valid id {} and json")
    public void putUpdateUserWithValidIdAndJson(int id) {
        File json = new File(Constants.Req_body + "/UpdateUser.json");
        reqresAPI.putUpdateUser(id, json);

    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when()
                .put(ReqresAPI.PUT_UPDATE_USER);
    }

    @Given("Delete user with valid id {int}")
    public void deleteUserWithValidId(int id) {
        reqresAPI.deleteUser(id);
    }

    @Then("Status code should be {int} No Content")
    public void statusCodeShouldBeNoContent(int noContent) {
        SerenityRest.then()
                .statusCode(noContent);
    }

    @And("Validate get list user JSON schema")
    public void validateGetListUserJSONSchema() {
        File json = new File(Constants.List_Schema + "/ListUserSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post create user with valid json")
    public void postCreateUserWithValidJson() {
        File json = new File(Constants.Req_body + "/User.json");
        reqresAPI.postCreateUser(json);
    }
}

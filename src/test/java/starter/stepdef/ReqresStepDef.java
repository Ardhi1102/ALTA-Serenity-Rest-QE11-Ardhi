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

//public class ReqresStepDef {
//    @Steps
//    ReqresAPI reqresAPI;
//    @Given("Get list user with valid parameter {int}")
//    public void getListUserWithValidParameter(int page) {
//        reqresAPI.getListUsers(page);
//    }
//
//    @When("Send request get list users")
//    public void sendRequestGetListUsers() {
//        SerenityRest.when().get(reqresAPI.GET_LIST_USERS);
//    }
//
//    @Then("Status code should be {int} OK")
//    public void statusCodeShouldBeOK(int code) {
//        SerenityRest.then().statusCode(code);
//    }
//
//    @And("Response body should be {int}")
//    public void responseBodyShouldBe(int page) {
//        SerenityRest.and().body(ReqresResponses.PAGE, equalTo(page));
//    }

    //post create new user
//    @Given("Post create user with valid json")
//    public void postCreateUserWithValidJson() {
//        File json = new File(Constants.Req_body + "/User.json");
//        reqresAPI.postCreateUser(json);
//    }
//
//    @When("Send request post creaete user")
//    public void sendRequestPostCreaeteUser() {
//        SerenityRest.when()
//                .post(ReqresAPI.POST_CREATE_USERS);
//    }
//
//    @Then("Status code should be {int} created")
//    public void statusCodeShouldBeCreated(int created) {
//        SerenityRest.then()
//                .statusCode(created);
//    }
//
//    @And("Response body name was {string} and job was {string}")
//    public void responseBodyNameWasAndJobWas(String name, String job) {
//        SerenityRest.and()
//                .body(ReqresResponses.NAME, equalTo(name))
//                .body(ReqresResponses.JOB, equalTo(job));
//    }

//    @Given("Put update user with valid id {} and json")
//    public void putUpdateUserWithValidIdAndJson(int id) {
//        File json = new File(Constants.Req_body + "/UpdateUser.json");
//        reqresAPI.putUpdateUser(id, json);
//
//    }

//    @When("Send request put update user")
//    public void sendRequestPutUpdateUser() {
//        SerenityRest.when()
//                .put(ReqresAPI.PUT_UPDATE_USER);
//    }

//    @Given("Delete user with valid id {int}")
//    public void deleteUserWithValidId(int id) {
//        reqresAPI.deleteUser(id);
//    }
//
//    @When("Send request delete user")
//    public void sendRequestDeleteUser() {
//        SerenityRest.when()
//                .delete(ReqresAPI.DELETE_USER);
//    }
//
//    @Then("Status code should be {int} No Content")
//    public void statusCodeShouldBeNoContent(int noContent) {
//        SerenityRest.then()
//                .statusCode(noContent);
//    }
//
//    @And("Validate get list user JSON schema")
//    public void validateGetListUserJSONSchema() {
//        File json = new File(Constants.JSON_Schema + "/ListUserSchema.json");
//        SerenityRest.and()
//                .assertThat()
//                .body(JsonSchemaValidator.matchesJsonSchema(json));
//    }
//
//    @And("Print if status code {int} OK")
//    public void printIfStatusCodeOK(int arg0) {
//    }
//
//    @And("Get log all")
//    public void getLogAll() {
//    }
//
//    @And("Get log body")
//    public void getLogBody() {
//    }
//}

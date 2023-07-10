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

public class UserLoginStepDef {
    @Steps
    ReqresAPI reqresAPI;

    //Valid Login
    @Given("Post login with valid json")
    public void postLoginSuccess() {
        File json = new File(Constants.Login_User + "/LoginUserSuccess.json");
        reqresAPI.postLoginSuccessful(json);
    }

    @When("Send request post login with valid json")
    public void sendRequestPostLoginSuccess() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }


    @And("Response body page should be display token {string}")
    public void responseBodyPageShouldContainToken(String token) {
        SerenityRest.and()
                .body("token", equalTo(token));
    }

    //Login with empty password
    @Given("Post login with valid email and empty password")
    public void postLoginWithEmptyPassword() {
        File json = new File(Constants.Login_User + "/LoginUserWithEmptyPassword.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login with valid email and empty password")
    public void sendRequestPostLoginWithEmptyPassword() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    @Then("Status code should be {int} bad request")
    public void statusCodeShouldBeBadRequest(int code) {
        SerenityRest.then()
                .statusCode(code);
    }

    @And("Response body page should be display message {string}")
    public void responseBodyPageShouldContainMessage(String error) {
        SerenityRest.and()
                .body(ReqresResponses.ERROR, equalTo(error));
    }

    //Login with empty email
    @Given("Post login with empty email and valid password")
    public void postLoginWithEmptyEmailAndValidPassword() {
        File json = new File(Constants.Login_User + "/LoginUserWithEmptyEmail.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login with empty email and valid password")
    public void sendRequestPostLoginWithEmptyEmailAndValidPassword() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    //Login with invalid password
    @Given("Post login with invalid email and valid password")
    public void postLoginWithInvalidEmailAndValidPassword() {
        File json = new File(Constants.Login_User + "/LoginUserWithInvalidEmail.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login with invalid email and valid password")
    public void sendRequestPostLoginWithInvalidEmailAndValidPassword() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    //Login with invalid password
    @Given("Post login with valid email and invalid password")
    public void postLoginWithValidEmailAndInvalidPassword() {
        File json = new File(Constants.Login_User + "/LoginUserWithInvalidPassword.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login with valid email and invalid password")
    public void sendRequestPostLoginWithValidEmailAndInvalidPassword() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    @Given("Post login with empty email and empty password")
    public void postLoginWithEmptyEmailAndEmptyPassword() {
        File json = new File(Constants.Login_User + "/LoginUserWithEmptyEmailAndPassword.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login with empty email and empty password")
    public void sendRequestPostLoginWithEmptyEmailAndEmptyPassword() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    @Given("Post login without email field")
    public void postLoginWithoutEmailField() {
        File json = new File(Constants.Login_User + "/LoginUserWithoutEmailField.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login without email field")
    public void sendRequestPostLoginWithoutEmailField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    @Given("Post login without password field")
    public void postLoginWithoutPasswordField() {
        File json = new File(Constants.Login_User + "/LoginUserWithoutPasswordField.json");
        reqresAPI.postLoginUnsuccessful(json);
    }

    @When("Send request post login without password field")
    public void sendRequestPostLoginWithoutPasswordField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_LOGIN);
    }

    @And("Validate post login success JSON schema")
    public void validatePostLoginSuccessJSONSchema() {
                File json = new File(Constants.Login_Schema + "/LoginUserSuccessSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate post login error JSON schema")
    public void validatePostLoginErrorJSONSchema() {
        File json = new File(Constants.Login_Schema + "/LoginUserErrorSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}

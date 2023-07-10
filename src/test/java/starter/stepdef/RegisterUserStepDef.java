package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import javax.naming.directory.SearchResult;
import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class RegisterUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Register user with valid json")
    public void registerUserWithValidJson() {
        File json = new File(Constants.Register_User + "/RegisterSuccess.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register with valid json")
    public void sendRequestPostRegisterWithValidJson() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    @And("Response body page should be display id {} and token {string}")
    public void responseBodyPageShouldBeDisplayIdAndToken(int id, String token) {
        SerenityRest.and()
                .body(ReqresResponses.ID, equalTo(id))
                .body(ReqresResponses.TOKEN, equalTo(token));
    }

    //register valid email empty password
    @Given("Register user with valid valid email and empty password")
    public void registerUserWithValidValidEmailAndEmptyPassword() {
        File json = new File(Constants.Register_User + "/RegisterEmptyPassword.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register with valid email and empty password")
    public void sendRequestPostRegisterWithValidEmailAndEmptyPassword() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    @Given("Register user with empty email and valid password")
    public void registerUserWithEmptyEmailAndValidPassword() {
        File json = new File(Constants.Register_User + "/RegisterEmptyEmail.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register with empty email and valid password")
    public void sendRequestPostRegisterWithEmptyEmailAndValidPassword() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    //Register valid email invalid password
    @Given("Register user with valid email and invalid password")
    public void registerUserWithValidEmailAndInvalidPassword() {
        File json = new File(Constants.Register_User + "/RegisterValidEmailInvalidPassword.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register with valid email and invalid password")
    public void sendRequestPostRegisterWithValidEmailAndInvalidPassword() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    //Register invalid email valid password
    @Given("Register user with invalid email and valid password")
    public void registerUserWithInvalidEmailAndValidPassword() {
        File json = new File(Constants.Register_User + "/RegisterInvalidEmailvalidPassword.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register with invalid email and valid password")
    public void sendRequestPostRegisterWithInvalidEmailAndValidPassword() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    @Given("Post register without email field")
    public void postRegisterWithoutEmailField() {
        File json = new File(Constants.Register_User + "/RegisterWithoutEmailField.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register without email field")
    public void sendRequestPostRegisterWithoutEmailField() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    @Given("Post register without password field")
    public void postRegisterWithoutPasswordField() {
        File json = new File(Constants.Register_User + "/RegisterWithoutPasswordField.json");
        reqresAPI.registerUser(json);
    }

    @When("Send request post register without password field")
    public void sendRequestPostRegisterWithoutPasswordField() {
        SerenityRest.when()
                .post(ReqresAPI.REGISTER_USER);
    }

    @And("Validate post register success JSON schema")
    public void validatePostRegisterSuccessJSONSchema() {
        File json = new File(Constants.Register_Schema + "/RegisterUserSuccessSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @And("Validate post register error JSON schema")
    public void validatePostRegisterErrorJSONSchema() {
        File json = new File(Constants.Register_Schema + "/RegisterUserErrorSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}

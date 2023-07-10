package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class CreateNewUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

    //Empty job
    @Given("Post create new user with empty job field")
    public void postCreateNewUserWithEmptyJobField() {
        File json = new File(Constants.Create_User + "/CreateNewUserEmptyJob.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send request post create new user with empty job field")
    public void sendRequestPostCreateNewUserWithEmptyJobField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_CREATE_USERS);
    }

    @Given("Post create new user with empty name field")
    public void postCreateNewUserWithEmptyNameField() {
        File json = new File(Constants.Create_User + "/CreateNewUserEmptyName.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send request post create new user with empty name field")
    public void sendRequestPostCreateNewUserWithEmptyNameField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_CREATE_USERS);
    }

    @Given("Post create new user with empty name and job field")
    public void postCreateNewUserWithEmptyNameAndJobField() {
        File json = new File(Constants.Create_User + "/CreateNewUserEmptyNameAndJob.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send request post create new user with empty name and job field")
    public void sendRequestPostCreateNewUserWithEmptyNameAndJobField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_CREATE_USERS);
    }

    @Given("Post create without name field")
    public void postCreateWithoutNameField() {
        File json = new File(Constants.Create_User + "/CreateNewUserWithoutNameField.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send request post create without name field")
    public void sendRequestPostCreateWithoutNameField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_CREATE_USERS);
    }

    @Given("Post create without job field")
    public void postCreateWithoutJobField() {
        File json = new File(Constants.Create_User + "/CreateNewUserWithoutJobField.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send request post create without job field")
    public void sendRequestPostCreateWithoutJobField() {
        SerenityRest.when()
                .post(ReqresAPI.POST_CREATE_USERS);
    }
}

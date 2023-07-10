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

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class UpdateUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Put update user with empty name and valid job on id {}")
    public void putUpdateUserWithEmptyNameAndValidJobOnId(int id) {
        File json = new File(Constants.Update_User + "/UpdateUserEmptyName.json");
        reqresAPI.putUpdateUser(id, json);
    }

    @When("Send request put update user with empty name and valid job")
    public void sendRequestPutUpdateUserWithEmptyNameAndValidJob() {
        SerenityRest.when()
                .put(ReqresAPI.PUT_UPDATE_USER);
    }

    @Given("Put update user with valid name and empty job on id {}")
    public void putUpdateUserWithValidNameAndEmptyJobOnId(int id) {
        File json = new File(Constants.Update_User + "/UpdateUserEmptyJob.json");
        reqresAPI.putUpdateUser(id, json);
    }

    @Given("Put update user without name field on id {}")
    public void putUpdateUserWithoutNameFieldOnId(int id) {
        File json = new File(Constants.Update_User + "/UpdateUserWithoutNameField.json");
        reqresAPI.putUpdateUser(id, json);
    }

    @When("Send request put update user without name field")
    public void sendRequestPutUpdateUserWithoutNameField() {
        SerenityRest.when()
                .put(ReqresAPI.PUT_UPDATE_USER);
    }

    @Given("Put update user without job field on id {}")
    public void putUpdateUserWithoutJobFieldOnId(int id) {
        File json = new File(Constants.Update_User + "/UpdateUserWithoutJobField.json");
        reqresAPI.putUpdateUser(id, json);
    }

    @When("Send request put update user without job field")
    public void sendRequestPutUpdateUserWithoutJobField() {
        SerenityRest.when()
                .put(ReqresAPI.PUT_UPDATE_USER);
    }

    @Given("Patch update user with valid json on id {}")
    public void patchUpdateUserWithValidJsonOnId(int id) {
        File json = new File(Constants.Update_User+"/UpdateUserSuccess.json");
        reqresAPI.patchUpdateUser(id,json);
    }

    @When("Send request Patch update user with valid json on id")
    public void sendRequestPatchUpdateUserWithValidJsonOnId() {
        SerenityRest.when()
                .patch(ReqresAPI.PATCH_UPDATE_USER);
    }

    @And("Response body name was {string} and job was {string}")
    public void responseBodyNameWasAndJobWas(String name, String job) {
        SerenityRest.and()
                .body(ReqresResponses.NAME, equalTo(name))
                .body(ReqresResponses.JOB, equalTo(job));
    }

    @And("Validate update user JSON schema")
    public void validateUpdateUserJSONSchema() {
        File json = new File(Constants.Update_Schema + "/UpdateUserSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Put update user with invalid parameter id {string}")
    public void putUpdateUserWithInvalidParameterId(String id) {
        File json = new File(Constants.Update_User+"/UpdateUserSuccess.json");
        reqresAPI.putUpdateUserInvalidParameter(id, json);
    }

    @When("Send request put update user with invalid parameter id")
    public void sendRequestPutUpdateUserWithInvalidParameterId() {
        SerenityRest.when()
                .patch(ReqresAPI.PUT_UPDATE_USER);
    }

    @Given("Patch update user with invalid parameter id {string}")
    public void patchUpdateUserWithInvalidParameterId(String id) {
        File json = new File(Constants.Update_User+"/UpdateUserSuccess.json");
        reqresAPI.patchUpdateUserInvalidParameter(id, json);
    }

    @When("Send request patch update user with invalid parameter id")
    public void sendRequestPatchUpdateUserWithInvalidParameterId() {
        SerenityRest.when()
                .patch(ReqresAPI.PATCH_UPDATE_USER);
    }
}

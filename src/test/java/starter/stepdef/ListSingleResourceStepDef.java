package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class ListSingleResourceStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Get list single resource with valid parameter id {}")
    public void getListResourceValidParameter(int id) {
        reqresAPI.getListSingleResource(id);
    }

    @When("Send list single resource with valid parameter id")
    public void sendListResourceValidParameter() {
        SerenityRest.when()
                .get(ReqresAPI.LIST_SINGLE_RESOURCE);
    }

    @And("Validate get list single resource JSON schema")
    public void validateGetListResourceJSONSchema() {
        File json = new File(Constants.List_Schema + "/ListSingleResourceSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list single resource with invalid parameter id {}")
    public void getListResourceWithInvalidParameterId(int id) {
        reqresAPI.getListSingleResource(id);
    }

    @When("Send list single resource with invalid parameter id")
    public void sendListResourceWithInvalidParameterId() {
        SerenityRest.when()
                .get(ReqresAPI.LIST_SINGLE_RESOURCE);
    }
}

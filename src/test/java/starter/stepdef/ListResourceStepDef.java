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

public class ListResourceStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Get list resource")
    public void getListResource() {
        reqresAPI.getListResource();
    }

    @When("Send list resource")
    public void sendListResource() {
        SerenityRest.when()
                .get(ReqresAPI.LIST_RESOURCE);
    }

    @And("Validate Get list resource JSON schema")
    public void validateGetListResourceJSONSchema() {
        File json = new File(Constants.List_Schema + "/ListResourceSchema.json");
        SerenityRest.and()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}

package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;

public class ListUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int code) {
        SerenityRest.then().statusCode(code);
    }

    @Given("Get list user with invalid parameter page {string}")
    public void getListUserWithInvalidParameterPage(String page) {
        reqresAPI.getListUsersInvalidParam(page);
    }

    @When("Send request get list user with invalid parameter page")
    public void sendRequestGetListUserWithInvalidParameterPage() {
        SerenityRest.when()
                .get(ReqresAPI.GET_LIST_USERS);
    }

    @Given("Get list user with more than available page {}")
    public void getListUserWithMoreThanAvailablePage(String page) {
        reqresAPI.getListUsersInvalidParam(page);
    }

    @When("Send request get list user with more than available page")
    public void sendRequestGetListUserWithMoreThanAvailablePage() {
        SerenityRest.when()
                .get(ReqresAPI.GET_LIST_USERS);
    }
}

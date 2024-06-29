package com.oilrig.features.steps.api.steps;

import com.oilrig.modules.api.actions.CreativeEventActions;
import com.oilrig.modules.api.actions.CreativeMediaActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CreativeEventSteps {

    @Steps
    CreativeEventActions creativeEventActions;

    @Given("^user set parameter to create Creative Events with$")
    public void setParameterToCreateCreativeEvent(DataTable creativeEventParameters) {
        List<Map<String, String>> creativeEventDetailsMap = creativeEventParameters.asMaps(String.class, String.class);
        creativeEventActions.setParameterToCreateCreativeEvent(creativeEventDetailsMap);
    }

    @When("^user post a POST request to create Creative Event$")
    public void postAPOSTRequestToCreateCreativeEvent() {
        creativeEventActions.postAPOSTRequestToCreateCreativeEvent();
    }

    @Then("^validate that response of create Creative Event API should have status code as (\\d+)$")
    public void verifyCreateCreativeMediaResponseCode(int statusCode) {
        assertThat("Verify status code for create Creative Media : ", creativeEventActions.getStatusCodeOfResponse(),
                equalTo(statusCode));
    }


    @Then("^validate the response is as per parameters given for Creative events$")
    public void verifyResponseIsAsPerParametersPassed() {
        creativeEventActions.verifyResponseAsPerParametersGiven();
    }
}

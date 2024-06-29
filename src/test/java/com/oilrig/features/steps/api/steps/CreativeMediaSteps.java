package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.CreativeMediaActions;

import java.util.List;
import java.util.Map;

public class CreativeMediaSteps {
    @Steps
    CreativeMediaActions creativeMediaActions;

    @Given("^user set parameter to create Creative Media with$")
    public void setParameterToCreateCreativeMedia(DataTable creativeMediaParameters) {
        List<Map<String, String>> creativeMediaDetailsMap = creativeMediaParameters.asMaps(String.class, String.class);
        creativeMediaActions.setParameterToCreateCreativeMedia(creativeMediaDetailsMap);
    }


    @When("^user post a POST request to create Creative Media$")
    public void postAPOSTRequestToCreateCreativeMedia() {
        creativeMediaActions.postAPOSTRequestToCreateCreativeMedia();
    }

    @Then("^validate that response of create Creative Media API should have status code as (\\d+)$")
    public void verifyCreateCreativeMediaResponseCode(int statusCode) {
        assertThat("Verify status code for create Creative Media : ", creativeMediaActions.getStatusCodeOfResponse(),
                equalTo(statusCode));
    }

    @Then("^validate the response is as per parameters given for Creative Media$")
    public void verifyResponseIsAsPerParametersPassed() {
        creativeMediaActions.verifyResponseAsPerPassedParams();
    }
}
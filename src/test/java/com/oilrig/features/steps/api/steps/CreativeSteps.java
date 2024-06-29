package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.CreativeActions;

import java.util.List;
import java.util.Map;

public class CreativeSteps {
	@Steps
	CreativeActions creativeActions;

	@Given("^user set parameter to create Creative with following details$")
	public void setParameterToCreateCreative(DataTable creativeParameters) {
		List<Map<String, String>> creativeDetailsMap = creativeParameters.asMaps(String.class, String.class);
		creativeActions.setParameterToCreateCreative(creativeDetailsMap);
	}


	@When("^user post a POST request to create Creative$")
	public void postAPOSTRequestToCreateCreative() {
		creativeActions.postAPOSTRequestToCreateCreative();
	}

	@Then("^validate that response of create Creative API should have status code as (\\d+)$")
	public void verifyCreateCreativeResponseCode(int statusCode) {
		assertThat("Verify status code for create Creative : ", creativeActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

	@Then("^validate the response as per parameters given for creative$")
	public void verifytheResponseAsPerDataProvidedForCreative() {
		creativeActions.verifyResponseAsPerParametersGiven();
	}

}
package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.TargetingActions;

import java.util.List;
import java.util.Map;

public class TargetingSteps {
	@Steps
	TargetingActions targetingActions;

	@Given("^user set parameter to create targeting with city as follows$")
	public void setParameterToCreateTargeting(DataTable targetingItemParams) {
		List<Map<String, String>> targetingDetailsMap = targetingItemParams.asMaps(String.class, String.class);
		targetingActions.setParameterToCreateTargeting(targetingDetailsMap);
	}


	@When("^user post a POST request to create targeting$")
	public void postAPOSTRequestToCreateTargeting() {
		targetingActions.postAPOSTRequestToCreateTargeting();
	}

	@Then("^validate that response of create targeting API should have status code as (\\d+)$")
	public void verifyCreateTargetingResponseCode(int statusCode) {
		assertThat("Verify status code for create Targeting : ", targetingActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

	@Then("^validate the response is as per parameters given for targeting$")
	public void verifyResponseIsAsPerParametesGiven() {
		targetingActions.verifyResponseisAsPerGivenParameters();
	}

}
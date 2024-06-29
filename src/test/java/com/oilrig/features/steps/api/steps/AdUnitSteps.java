package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.AdUnitActions;

import java.util.List;
import java.util.Map;

public class AdUnitSteps {
	@Steps
	AdUnitActions adUnitActions;

	@Given("^user set parameter to create ad unit with following details$")
	public void setParameterToCreateAdUnit(DataTable adUnitDetailsParams) {
		List<Map<String, String>> adUnitDetailsMap = adUnitDetailsParams.asMaps(String.class, String.class);
		adUnitActions.setParameterToCreateAdUnit(adUnitDetailsMap);
	}


	@When("^user post a POST request to create ad unit$")
	public void postAPOSTRequestToCreateAdUnit() {
		adUnitActions.postAPOSTRequestToCreateAdUnit();
	}

	@Then("^validate that response of create ad unit API should have status code as (\\d+)$")
	public void verifyCreateAdUnitResponseCode(int statusCode) {
		assertThat("Verify status code for create Ad Unit : ", adUnitActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

	@Then("^user validate that response is as per parameters given$")
	public void verifyCreateAdUnitResponseCode() {
		adUnitActions.verifyResponseAsperParametersPassed();
	}

}
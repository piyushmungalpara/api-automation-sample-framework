package com.oilrig.features.steps.api.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.AdTagActions;

public class AdTagSteps {
	@Steps
	AdTagActions adTagActions;

	@Given("^user set parameter to create AdTag$")
	public void setParameterToCreateAdTag() {
		adTagActions.setParameterToCreateAdTag();
	}

	@When("^user post a PUT request to create AdTag$")
	public void postAPOSTRequestToCreateAdTag() {
		adTagActions.postAPUTRequestToCreateAdTag();
	}

	@Then("^validate that response of create AdTag API should have status code as (\\d+)$")
	public void verifyCreateAdTagResponseCode(int statusCode) {
		assertThat("Verify status code for create Ad TAG : ", adTagActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

}
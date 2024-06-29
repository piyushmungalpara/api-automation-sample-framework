package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.AdvertiserActions;

import java.util.List;
import java.util.Map;

public class AdvertiserSteps {
	@Steps
	AdvertiserActions advertiserActions;

	@Given("^user set parameter to create an advetiser with name as and state as$")
	public void setParameterToCreateAdvertiser(DataTable AdvertiserDetailsTable) {
		List<Map<String, String>> advertiserDetailsMap = AdvertiserDetailsTable.asMaps(String.class, String.class);
		advertiserActions.setParameterToCreateAdvertiser(advertiserDetailsMap);
	}


	@When("^user post a POST request to create an advetiser$")
	public void postAPOSTRequestToCreateAdvertiser() {
		advertiserActions.postAPOSTRequestToCreateAdvertiser();
	}

	@Then("^validate that response of create advertiser API should have status code as (\\d+)$")
	public void verifyCreateAdvertiserResponseCode(int statusCode) {
		assertThat("Verify status code for create Advertiser : ", advertiserActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

	@Then("^validate the response is as per the parameters given for advertiser$")
	public void verifyCreateAdvertiserResponseAsPerParameters() {
		advertiserActions.verifyResponseAsPerParametersPassed();
	}
}
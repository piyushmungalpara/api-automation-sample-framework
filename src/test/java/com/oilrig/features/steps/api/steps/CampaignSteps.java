package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.CampaignActions;

import java.util.List;
import java.util.Map;

public class CampaignSteps {
	@Steps
	CampaignActions campaignActions;


	@Given("^user set parameter to create campaign with following details$")
	public void setParameterToCreateCampaign(DataTable CampaignDetailsTable) {
		List<Map<String, String>> campaignDetailsMap = CampaignDetailsTable.asMaps(String.class, String.class);
		campaignActions.setParameterToCreateCampaign(campaignDetailsMap);
	}


	@When("^user post a POST request to create campaign$")
	public void postAPOSTRequestToCreateCampaign() {
		campaignActions.postAPOSTRequestToCreateCampaign();
	}

	@Then("^validate that response of create campaign API should have status code as (\\d+)$")
	public void verifyCreateCampaignResponseCode(int statusCode) {
		assertThat("Verify status code for create Campaign : ", campaignActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

	@Then("^validate the response is as per the parameters given for campaign$")
	public void verifyParametersOfCampaignAsPerParametersGiven() {
		campaignActions.verifyParametersFromResponse();
	}

}
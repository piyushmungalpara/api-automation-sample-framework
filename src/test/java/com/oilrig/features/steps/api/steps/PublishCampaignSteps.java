package com.oilrig.features.steps.api.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.PublishCampaignActions;

public class PublishCampaignSteps {
	@Steps
	PublishCampaignActions publishCampaignActions;

	@When("^user post a POST request to publish the Campaign$")
	public void postAPOSTRequestToPublishCampaign() {
		publishCampaignActions.postAPOSTRequestToPublishCampaign();
	}

	@Then("^validate that response of publish campaign API should have status code as (\\d+)$")
	public void verifyCreateAdTagResponseCode(int statusCode) {
		assertThat("Verify status code for PublishCampaign : ", publishCampaignActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

}
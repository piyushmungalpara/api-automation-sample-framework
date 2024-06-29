package com.oilrig.features.steps.api.steps;

import com.oilrig.modules.api.actions.CampaignActions;
import com.oilrig.modules.api.actions.CampaignHomeActions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class CampaignHomeSteps {
    @Steps
    CampaignHomeActions campaignActions;


    @Given("^user fetch all campaigns details$")
    public void getAllCampaignsDetails() {
        campaignActions.postAGETRequestToGetCampaignsDetails();
    }

    @Then("^validate that campaign is created with proper values and state as \"([^\"]*)\"$")
    public void validateCreatedCampaign(String state) {
        campaignActions.verifyCreatedCampaign(state);
    }

}

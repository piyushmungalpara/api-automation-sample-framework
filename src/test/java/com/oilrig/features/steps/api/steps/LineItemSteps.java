package com.oilrig.features.steps.api.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.LineItemActions;

import java.util.List;
import java.util.Map;

public class LineItemSteps {
	@Steps
	LineItemActions lineItemActions;

	@Given("^user set parameter to create line item with following details$")
	public void setParameterToCreateLineItem(DataTable creativeLineItemParams) {
		List<Map<String, String>> creativeDetailsMap = creativeLineItemParams.asMaps(String.class, String.class);
		lineItemActions.setParameterToCreateLineItem(creativeDetailsMap);
	}

	@When("^user post a POST request to create line item$")
	public void  postAPOSTRequestToCreateLineItem() {
		lineItemActions.postAPOSTRequestToCreateLineItem();
	}

	@Then("^validate that response of create line item API should have status code as (\\d+)$")
	public void verifyCreateLineItemResponseCode(int statusCode) {
		assertThat("Verify status code for create LineItem : ", lineItemActions.getStatusCodeOfResponse(),
				equalTo(statusCode));
	}

	@Then("^validate the response is as per the parameters given for line item$")
	public void verifyResponseIsAsPerParametersGiven() {
		lineItemActions.verifyResponseAsPerParametersGiven();
	}

}
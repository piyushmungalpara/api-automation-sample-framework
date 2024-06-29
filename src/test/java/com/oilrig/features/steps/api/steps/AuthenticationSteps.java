package com.oilrig.features.steps.api.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.oilrig.modules.api.actions.AuthenticationActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AuthenticationSteps {
	@Steps
	private AuthenticationActions authenticationActions;	

	/*@Given("^user has valid login credential as 'Test' user$")
	public void setValidLoginCredintial() {
		authenticationActions.setValidLoginCredintial();
	}

	@When("^user post a POST request to LogIn API$")
	public void PostAPOSTRequestToLogInApi() {
		authenticationActions.PostAPOSTRequestToLogInApi();
	}

	@Then("^verifies if login response should have status code as (\\d+)$")
	public void verifyLoginResponseStatus(int statusCode) {
		assertThat("Log-In response status code ", authenticationActions.getStatusCodeOfResponse(), equalTo(statusCode));
	}
	*/
	
	@Given("^user has valid login credential as 'Test' user to fetch Token$")
	public void setValidLoginCredintialForToken() {
		authenticationActions.setValidLoginCredintialForToken();
	}
	
	@When("^user post a POST request to authorize API$")
    public void postaPOSTRequestToFetchToken() throws Throwable {
		authenticationActions.postAPOSTRequestToFetchToken();
    }
	
	@Then("^validate that response of authorize API should have status code as (\\d+)$")
    public void validateResponseCode(int responseCode) throws Throwable {
		assertThat("Token response code ", authenticationActions.getStatusCodeOfResponse(), equalTo(responseCode));
    }
}
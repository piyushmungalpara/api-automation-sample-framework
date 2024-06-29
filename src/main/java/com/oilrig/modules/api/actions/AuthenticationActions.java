package com.oilrig.modules.api.actions;

import org.apache.log4j.Logger;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.login.CreateLogInResponse;
import com.oilrig.models.token.TokenResponse;
import com.oilrig.modules.api.builders.AuthenticationBuilder;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.modules.api.builders.TokenBuilder;
import com.oilrig.utility.api.Constants;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AuthenticationActions {
	AuthenticationBuilder authenticationBuilder;
	TokenBuilder tokenBuilder;
	private static Logger LOG = Logger.getLogger("");
	private Response response;

	@Step
	public void setValidLoginCredintial() {
		authenticationBuilder = new AuthenticationBuilder();
		authenticationBuilder.setValidLoginCredintial();
	}

	@Step
	public void setValidLoginCredintialForToken() {
		tokenBuilder = new TokenBuilder();
		tokenBuilder.setValidLoginCredintial();
	}

	@Step
	public void PostAPOSTRequestToLogInApi() {
		Header contentType = new Header("content-type", Constants.GETCONTENT_TYPE);
		Header origin = new Header("origin", Constants.GETORIGIN);
		Headers headers = new Headers(contentType, origin);
		response = SerenityRest.given().headers(headers)
				.body(authenticationBuilder.getLogInRequest(), ObjectMapperType.GSON).when()
				.post(Constants.SIGNIN_BASEENDPOINT_URL);

		LOG.info("Response of Login API: " + response.asString());
		LOG.info("Response Code of Login API: " + response.statusCode());

		CreateLogInResponse obj = (CreateLogInResponse) MapBuilderFromJsonString.buildFromJsonString(CreateLogInResponse.class, response)
				.get();
		DependencyManager.getInjector().getInstance(ResponseBuilder.class).setLogInResponse(obj);
	}

	@Step
	public void postAPOSTRequestToFetchToken() {

		response = SerenityRest.given().headers(HeaderBuilder.getHeaders())
				.body(tokenBuilder.getTokenRequest(), ObjectMapperType.GSON).when()
				.post(Constants.TOKEN_BASEENDPOINT_URL);

		LOG.info("Response of Token API: " + response.asString());
		LOG.info("Response Code of Token API: " + response.statusCode());

		TokenResponse obj = (TokenResponse) MapBuilderFromJsonString.buildFromJsonString(TokenResponse.class, response)
				.get();
		DependencyManager.getInjector().getInstance(ResponseBuilder.class).setTokenResponse(obj);
	}

	@Step
	public int getStatusCodeOfResponse() {
		return response.then().extract().statusCode();
	}
}
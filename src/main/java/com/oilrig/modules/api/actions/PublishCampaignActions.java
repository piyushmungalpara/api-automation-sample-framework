package com.oilrig.modules.api.actions;

import org.apache.log4j.Logger;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.PublishCampaign.PublishCampaignResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PublishCampaignActions {
	private Response response;
	private static Logger LOG = Logger.getLogger("");

	@Step
	public void postAPOSTRequestToPublishCampaign() {
		response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken()).when()
				.post(Constants.PUBLISHCAMPAIGN_BASEENDPOINT_URL
						.replace("${advertiserId}",
								String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
										.getAdvertiserResponse().getData().getAdvertiser().getId()))
						.replace("${campaignId}",
								String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
										.getCampaignResponse().getData().getCampaign().getId())));

		LOG.info("Response of Publish Campaign API: " + response.asString());
		LOG.info("Response Code of Publish Campaign TAG API: " + response.statusCode());

		PublishCampaignResponse obj = (PublishCampaignResponse) MapBuilderFromJsonString
				.buildFromJsonString(PublishCampaignResponse.class, response).get();
		DependencyManager.getInjector().getInstance(ResponseBuilder.class).setPublishCampaignResponse(obj);

	}

	@Step
	public int getStatusCodeOfResponse() {
		return response.then().extract().statusCode();
	}

}
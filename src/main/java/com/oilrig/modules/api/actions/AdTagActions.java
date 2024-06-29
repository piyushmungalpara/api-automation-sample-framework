package com.oilrig.modules.api.actions;

import org.apache.log4j.Logger;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.adTag.CreateAdTagRequest;
import com.oilrig.models.adTag.CreateAdTagResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AdTagActions {
	private CreateAdTagRequest adTagRequest;
	private Response response;
	private static Logger LOG = Logger.getLogger("");

	@Step
	public void setParameterToCreateAdTag() {
		adTagRequest = new CreateAdTagRequest();

		adTagRequest.setAdvertiser_id(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
				.getAdvertiserResponse().getData().getAdvertiser().getId());
		adTagRequest.setName(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse()
				.getData().getCreatives().getName());
		adTagRequest.setAd_type(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse()
				.getData().getLineItem().getAd_type());
		if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse().getData()
				.getCreatives().getIs_third_party_tag()) {
			adTagRequest.setThird_party_url(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
					.getCreativeMediaResponse().getData().getCreativeMedia().getMedia_url());
		}
	}

	@Step
	public void postAPUTRequestToCreateAdTag() {
		response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
				.body(adTagRequest, ObjectMapperType.GSON).when()
				.put(Constants.ADTAG_BASEENDPOINT_URL.replace("${adUnitId}",
						String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
								.getAdUnitResponse().getData().getBudgetInterval().getAd_unit_id()))
						.replace("${creativeId}",
								String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
										.getCreativeResponse().getData().getCreatives().getId())));

		LOG.info("Response of Create Ad TAG API: " + response.asString());
		LOG.info("Response Code of Create Ad TAG API: " + response.statusCode());

		CreateAdTagResponse obj = (CreateAdTagResponse) MapBuilderFromJsonString.buildFromJsonString(CreateAdTagResponse.class, response)
				.get();
		DependencyManager.getInjector().getInstance(ResponseBuilder.class).setAdTagResponse(obj);

	}

	@Step
	public int getStatusCodeOfResponse() {
		return response.then().extract().statusCode();
	}

}
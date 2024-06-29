package com.oilrig.modules.api.actions;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;

import com.oilrig.enumtypes.EntityNamePrefix;
import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.adUnit.CreateAdUnitRequest;
import com.oilrig.models.adUnit.CreateAdUnitResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.CommonDateUtils;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AdUnitActions {
	private CreateAdUnitRequest adUnitRequest;
	private Response response;
	private static Logger LOG = Logger.getLogger("");

	@Step
	public void setParameterToCreateAdUnit(List<Map<String, String>> adUnitDetailsMap) {
		adUnitRequest = new CreateAdUnitRequest();

		if (ParamUtils.splitValues(adUnitDetailsMap.get(0).get("name"))[0].equals("true"))
			adUnitRequest.setName(
					EntityNamePrefix.AutoAU.toString() + " " + new Random().nextInt(1000) + new Random().nextInt(1000));

		if (ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_interval_start_day"))[0].equals("true"))
			adUnitRequest.setStart_date(
					CommonDateUtils.getDate(Integer.parseInt(ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_interval_start_day"))[1]),
							"yyyy-MM-dd") + "T00:00:00.000Z");
		if (ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_interval_end_day"))[0].equals("true"))
			adUnitRequest.setEnd_date(
					CommonDateUtils.getDate(Integer.parseInt(ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_interval_end_day"))[1]),
							"yyyy-MM-dd") + "T23:59:59.999Z");

		if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData()
				.getCampaign().getBudget_type().equalsIgnoreCase("impression")
				&& ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_value"))[0].equals("true")) {
			adUnitRequest.setLifetime_budget_imps(ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_value"))[1]);
		} else if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData()
				.getCampaign().getBudget_type().equalsIgnoreCase("revenue")
				&& ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_value"))[0].equals("true")) {
			adUnitRequest.setLifetime_budget_revenue(ParamUtils.splitValues(adUnitDetailsMap.get(0).get("budget_value"))[1]);
		}
	}

	@Step
	public void postAPOSTRequestToCreateAdUnit() {
		response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
				.body(adUnitRequest, ObjectMapperType.GSON).when()
				.post(Constants.ADUNIT_BASEENDPOINT_URL.replace("${lineItemId}",
						String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
								.getLineItemResponse().getData().getLineItem().getId())));

		LOG.info("Response of Create Ad Unit API: " + response.asString());
		LOG.info("Response Code of Create Ad Unit API: " + response.statusCode());

		CreateAdUnitResponse obj = (CreateAdUnitResponse) MapBuilderFromJsonString
				.buildFromJsonString(CreateAdUnitResponse.class, response).get();
		DependencyManager.getInjector().getInstance(ResponseBuilder.class).setAdUnitResponse(obj);


	}

	@Step
	public int getStatusCodeOfResponse() {
		return response.then().extract().statusCode();
	}

	public void verifyResponseAsperParametersPassed() {
		if(Integer.parseInt(adUnitRequest.getLifetime_budget_imps())==(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdUnitResponse().getData().getBudgetInterval().getLifetime_budget_imps())&&
				adUnitRequest.getEnd_date().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdUnitResponse().getData().getBudgetInterval().getEnd_date())&&
				adUnitRequest.getStart_date().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdUnitResponse().getData().getBudgetInterval().getStart_date())){
			LOG.info("Response matches to input given ");
		}else LOG.error("Response does not matches to input provided for adUnit creation");
	}
}
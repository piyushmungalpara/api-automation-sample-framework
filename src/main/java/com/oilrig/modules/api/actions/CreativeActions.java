package com.oilrig.modules.api.actions;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;

import com.oilrig.enumtypes.EntityNamePrefix;
import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.creative.CreateCreativeRequest;
import com.oilrig.models.creative.CreateCreativeResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CreativeActions {
    private CreateCreativeRequest creativeRequest;
    private Response response;
    private static Logger LOG = Logger.getLogger("");

    @Step
    public void setParameterToCreateCreative(List<Map<String, String>> creativeDetailsMap) {
        creativeRequest = new CreateCreativeRequest();

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("name"))[0].equals("true"))
            creativeRequest.setName(EntityNamePrefix.AutoCreative.toString() + " " + new Random().nextInt(1000)
                    + new Random().nextInt(1000));

        creativeRequest.setSplit(100);

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("advertiser_id"))[0].equals("true"))
            creativeRequest.setAdvertiser_id(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                    .getAdvertiserResponse().getData().getAdvertiser().getId());

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("ad_type"))[0].equals("true"))
            creativeRequest.setAd_type(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                    .getLineItemResponse().getData().getLineItem().getAd_type());

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("is_third_party_tag"))[0].equals("true"))
            creativeRequest.setIs_third_party_tag(Boolean.valueOf(ParamUtils.splitValues(creativeDetailsMap.get(0).get("is_third_party_tag"))[1]));

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("ad_tag_type"))[0].equals("true"))
            creativeRequest.setAd_tag_type(ParamUtils.splitValues(creativeDetailsMap.get(0).get("ad_tag_type"))[1]);

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("is_non_linear"))[0].equals("true"))
            creativeRequest.setIs_non_linear(Boolean.valueOf(ParamUtils.splitValues(creativeDetailsMap.get(0).get("is_non_linear"))[1]));

    }

    @Step
    public void postAPOSTRequestToCreateCreative() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(creativeRequest, ObjectMapperType.GSON).when()
                .post(Constants.CREATIVE_BASEENDPOINT_URL.replace("${adUnitId}",
                        String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                                .getAdUnitResponse().getData().getBudgetInterval().getAd_unit_id())));

        LOG.info("Response of Create Creative API: " + response.asString());
        LOG.info("Response Code of Creative Creative API: " + response.statusCode());

        CreateCreativeResponse obj = (CreateCreativeResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateCreativeResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCreativeResponse(obj);
    }

    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    public void verifyResponseAsPerParametersGiven() {
        if (creativeRequest.getAd_tag_type().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse().getData().getCreatives().getAd_tag_type()) &&
                creativeRequest.getAd_type().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse().getData().getCreatives().getAd_type()) &&
                creativeRequest.getAdvertiser_id() == DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse().getData().getCreatives().getAdvertiser_id() &&
                creativeRequest.getName().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse().getData().getCreatives().getAdvertiser_id())) {
            LOG.info("Response matches to input given ");
        } else LOG.error("Response does not matches to input provided for adUnit creation");
    }
}
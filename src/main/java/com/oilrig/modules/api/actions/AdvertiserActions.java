package com.oilrig.modules.api.actions;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;

import com.oilrig.enumtypes.EntityNamePrefix;
import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.advertiser.CreateAdvertiserRequest;
import com.oilrig.models.advertiser.CreateAdvertiserResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class AdvertiserActions {
    private CreateAdvertiserRequest advRequest;
    private Response response;
    private static Logger LOG = Logger.getLogger("");
    private static List<Map<String, String>> advertiserInputMap;

    @Step
    public void setParameterToCreateAdvertiser(List<Map<String, String>> advertiserDetailsMap) {
        advRequest = new CreateAdvertiserRequest();
        advertiserInputMap = advertiserDetailsMap;
        if (ParamUtils.splitValues(advertiserDetailsMap.get(0).get("name"))[0].equals("true"))
            advRequest.setName(EntityNamePrefix.AutoAdv.toString() + " " + new Random().nextInt(1000)
                    + new Random().nextInt(1000));

        if (ParamUtils.splitValues(advertiserDetailsMap.get(0).get("state"))[0].equals("true"))
            advRequest.setState(ParamUtils.splitValues(advertiserDetailsMap.get(0).get("state"))[1]);
    }

    @Step
    public void postAPOSTRequestToCreateAdvertiser() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(advRequest, ObjectMapperType.GSON).when().post(Constants.ADVERTISER_BASEENDPOINT_URL);

        LOG.info("Response of Create Advertiser API: " + response.asString());
        LOG.info("Response Code of Create Advertiser API: " + response.statusCode());


        CreateAdvertiserResponse obj = (CreateAdvertiserResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateAdvertiserResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setAdvertiserResponse(obj);


    }

    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    @Step
    public void verifyResponseAsPerParametersPassed() {
        if (ParamUtils.splitValues(advertiserInputMap.get(0).get("state"))[1].equals
                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getState())) {
            LOG.info("Response matches to input given ");
        } else LOG.error("Response does not matches to input provided");
    }
}
package com.oilrig.modules.api.actions;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;

import com.oilrig.enumtypes.EntityNamePrefix;
import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.lineItem.CreateLineItemRequest;
import com.oilrig.models.lineItem.CreateLineItemResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static com.oilrig.modules.api.actions.CampaignActions.campaignInputDetails;

public class LineItemActions {
    private CreateLineItemRequest liRequest;
    private Response response;
    private static Logger LOG = Logger.getLogger("");
    private CreateLineItemRequest lineItemInput;

    @Step
    public void setParameterToCreateLineItem(List<Map<String, String>> creativeDetailsMap) {
        liRequest = new CreateLineItemRequest();
        lineItemInput = liRequest;
        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("name"))[0].equals("true"))
            liRequest.setName(
                    EntityNamePrefix.AutoLI.toString() + " " + new Random().nextInt(1000) + new Random().nextInt(1000));

        liRequest.setState("inactive");

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("cpm"))[0].equals("true"))
            liRequest.setCpm(Double.parseDouble(ParamUtils.splitValues(creativeDetailsMap.get(0).get("cpm"))[1]));

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("margin"))[0].equals("true"))
            liRequest.setMargin(Integer.parseInt(ParamUtils.splitValues(creativeDetailsMap.get(0).get("margin"))[1]));

        if (ParamUtils.splitValues(creativeDetailsMap.get(0).get("ad_type"))[0].equals("true"))
            liRequest.setAd_type(ParamUtils.splitValues(creativeDetailsMap.get(0).get("ad_type"))[1]);
    }

    @Step
    public void postAPOSTRequestToCreateLineItem() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(liRequest, ObjectMapperType.GSON).when()
                .post(Constants.LINEITEM_BASEENDPOINT_URL.replace("${campaignId}",
                        String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                                .getCampaignResponse().getData().getCampaign().getId())));

        LOG.info("Response of Create LINE ITEM API: " + response.asString());
        LOG.info("Response Code of Create LINE ITEM API: " + response.statusCode());

        CreateLineItemResponse obj = (CreateLineItemResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateLineItemResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setLineItemResponse(obj);


    }

    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    public void verifyResponseAsPerParametersGiven() {
        //Verifying response
        if (
                lineItemInput.getName().equals(
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse().getData().getLineItem().getName()) &&
                lineItemInput.getAd_type().equals(
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse().getData().getLineItem().getAd_type()) &&
                lineItemInput.getCpm() ==
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse().getData().getLineItem().getCpm() &&
                lineItemInput.getMargin() ==
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse().getData().getLineItem().getMargin() &&
                lineItemInput.getState().equals(
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse().getData().getLineItem().getState()) &&
                DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getId() ==
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getLineItemResponse().getData().getLineItem().getCampaign_id()) {
            LOG.info("response matches to input given for line item");
        } else LOG.error("Response does not matches to input provided for LineItem creation");
    }
}
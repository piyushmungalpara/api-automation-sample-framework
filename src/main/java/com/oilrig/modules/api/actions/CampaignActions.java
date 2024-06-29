package com.oilrig.modules.api.actions;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;

import com.oilrig.utility.api.CommonDateUtils;
import com.oilrig.enumtypes.EntityNamePrefix;
import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.campaign.CreateCampaignRequest;
import com.oilrig.models.campaign.CreateCampaignResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CampaignActions {
    private CreateCampaignRequest cmpRequest;
    private Response response;
    private static Logger LOG = Logger.getLogger("");
    protected static CreateCampaignRequest campaignInputDetails;

    @Step
    public void setParameterToCreateCampaign(List<Map<String, String>> campaignDetails) {
        cmpRequest = new CreateCampaignRequest();
        campaignInputDetails = cmpRequest;
        if (ParamUtils.splitValues(campaignDetails.get(0).get("name"))[0].equals("true"))
            cmpRequest.setName(EntityNamePrefix.AutoCmp.toString() + " " + new Random().nextInt(1000)
                    + new Random().nextInt(1000));
        if (ParamUtils.splitValues(campaignDetails.get(0).get("budget_type"))[0].equals("true"))
            cmpRequest.setBudget_type(ParamUtils.splitValues(campaignDetails.get(0).get("budget_type"))[1]);

        if (ParamUtils.splitValues(campaignDetails.get(0).get("budget_type"))[1].equalsIgnoreCase("impression")
                && ParamUtils.splitValues(campaignDetails.get(0).get("budget_type_value"))[0].equals("true")) {
            cmpRequest.setLifetime_budget_imps(campaignDetails.get(0).get("budget_type_value").split(":")[1]);
        } else if (ParamUtils.splitValues(campaignDetails.get(0).get("budget_type"))[1].equalsIgnoreCase("revenue")
                && ParamUtils.splitValues(campaignDetails.get(0).get("budget_type_value"))[0].equals("true")) {
            cmpRequest.setLifetime_budget_revenue(campaignDetails.get(0).get("budget_type_value").split(":")[1]);
        }

        if (ParamUtils.splitValues(campaignDetails.get(0).get("start_date"))[0].equals("true"))
            cmpRequest.setStart_date(
                    CommonDateUtils.getDate(Integer.parseInt(ParamUtils.splitValues(campaignDetails.get(0)
                            .get("start_date"))[1]), "yyyy-MM-dd")
                            + "T00:00:00.000Z");
        if (ParamUtils.splitValues(campaignDetails.get(0).get("end_date"))[0].equals("true"))
            cmpRequest.setEnd_date(
                    CommonDateUtils.getDate(Integer.parseInt(ParamUtils.splitValues(campaignDetails.get(0).get("end_date"))[1]), "yyyy-MM-dd")
                            + "T23:59:59.999Z");

        if (ParamUtils.splitValues(campaignDetails.get(0).get("advertiser"))[0].equals("true"))
            cmpRequest.setAdvertiser_id(String.valueOf(DependencyManager.getInjector()
                    .getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getId()));
        if (ParamUtils.splitValues(campaignDetails.get(0).get("viewability_standard_provider"))[0].equals("true"))
            cmpRequest.setViewability_standard_provider(ParamUtils.splitValues(campaignDetails.get(0).get("viewability_standard_provider"))[1]);
    }

    @Step
    public void postAPOSTRequestToCreateCampaign() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(cmpRequest, ObjectMapperType.GSON).when().post(Constants.CAMPAIGN_BASEENDPOINT_URL);

        LOG.info("Response of Create Campaign API: " + response.asString());
        LOG.info("Response Code of Create Campaign API: " + response.statusCode());

        CreateCampaignResponse obj = (CreateCampaignResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateCampaignResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCampaignResponse(obj);



        /*
         * try { DependencyManager.getInjector().getInstance(ResponseBuilder.class).
         * setCampaignId( response.as(CampaignResponse.class,
         * ObjectMapperType.GSON).getData().getCampaign().getId());
         * DependencyManager.getInjector().getInstance(ResponseBuilder.class).
         * setBudget_type(response .as(CampaignResponse.class,
         * ObjectMapperType.GSON).getData().getCampaign().getBudget_type()); } catch
         * (NullPointerException npe) { LOG.info("Campaign Id is not generated"); }
         * catch (Exception e) { LOG.error("Campaign Id is not generated"); }
         */
    }

    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    public void verifyParametersFromResponse() {
        if (campaignInputDetails.getLifetime_budget_revenue() == null) {
            campaignInputDetails.setLifetime_budget_revenue("0.0");
        } else if (campaignInputDetails.getLifetime_budget_imps() == null) {
            campaignInputDetails.setLifetime_budget_imps("0.0");
        }
        //Verifying the response
        if (

                campaignInputDetails.getName().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getName()) &&
                        campaignInputDetails.getBudget_type().equals
                                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getBudget_type()) &&
                        Integer.parseInt(campaignInputDetails.getAdvertiser_id()) ==
                                DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getAdvertiser_id() &&
                        campaignInputDetails.getViewability_standard_provider().equals
                                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getViewability_standard_provider()) &&
                        campaignInputDetails.getStart_date().equals
                                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getStart_date()) &&
                        campaignInputDetails.getEnd_date().equals
                                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getEnd_date()) &&
                        Double.parseDouble(campaignInputDetails.getLifetime_budget_imps()) ==
                                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getLifetime_budget_imps()) &&
                        Double.parseDouble(campaignInputDetails.getLifetime_budget_revenue()) ==
                                (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getLifetime_budget_revenue())) {
            LOG.info("Response matches to input given");
        } else LOG.error("Response does not matches to input provided for campaign creation");
    }
}
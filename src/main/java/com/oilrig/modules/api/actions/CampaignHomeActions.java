package com.oilrig.modules.api.actions;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.campaign.CreateCampaignResponse;
import com.oilrig.models.campaignHomePage.CampaignHomeData;
import com.oilrig.models.campaignHomePage.CampaignHomePage;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.apache.log4j.Logger;

public class CampaignHomeActions {
    private Response response;

    private static Logger LOG = Logger.getLogger("");

    public void postAGETRequestToGetCampaignsDetails() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .when().get(Constants.CAMPAIGN_BASEENDPOINT_URL);

        LOG.info("Response of Create Campaign API: " + response.asString());
        LOG.info("Response Code of Create Campaign API: " + response.statusCode());

        CampaignHomePage cmpRequest = MapBuilderFromJsonString
                .buildFromJsonString(CampaignHomePage.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCampaignHomePageResponse(cmpRequest);
    }

    public void verifyCreatedCampaign(String state) {
//        assertThat(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getId(),
//                DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(1).getId());
        for (int i = 0; i < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().size(); i++) {
            if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getId()
                    == DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getId()) {

                //campaign name
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getName().
                        equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getName()));
                //state
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getState().
                        equals(state));
//                //budget type
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getBudget_type().
                        equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getBudgetType()));
                //advertiser id
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getAdvertiser_id() ==
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiserId()));
                //Viewability_standard_provider
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getViewability_standard_provider().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getViewabilityStandardProvider()));

                //Lifetime_budget_revenue
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getLifetime_budget_revenue() ==
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getLifetimeBudgetRevenue()));
                //  lifetime_budget_imps
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getLifetime_budget_imps() ==
                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getLifetimeBudgetImps());
                //start_date
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getStart_date().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getStartDate()));
                //end_date
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getEnd_date().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getEndDate()));
                //user_id
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getUser_id() ==
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getUserId()));
                //createdAt
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getCreatedAt().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getCreatedAt()));
                //updatedAt
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getUpdatedAt().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getUpdatedAt()));

                //advertiser id
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getId() ==
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getId()));
                //advertiser name
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getName().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getName()));
                //advertiser state
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getState().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getState()));
                //advertiser XandrAdvertiserId error
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getPublishCampaignResponse().getAdvertiser().getXandr_id() ==
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getXandrAdvertiserId()));
                //advertiser userID
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getUser_id() ==
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getUserId()));
                //advertiser createdAt
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getCreatedAt().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getCreatedAt()));
                //advertiser updatedAt
                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getUpdatedAt().equals
                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getUpdatedAt()));


                //xanderCampaignID leave for now
//                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getPublishCampaignResponse().getCampaign().getXandr_id()
//                        DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getXandrCampaignId()));
                //xander update status leave for now
//                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getXandr_update_status() ==
//                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getXandrUpdateStatus()));
                //xander budget interval id leave for now
//                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignResponse().getData().getCampaign().getXandr_budget_interval_id() ==
//                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getXandrBudgetIntervalId()));

                //advertiser XandrUpdateStatus error leave for now
//                assertTrue(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getAdvertiserResponse().getData().getAdvertiser().getXandr_update_status() ==
//                        (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCampaignHomeResponse().getData().getCampaigns().get(i).getAdvertiser().getXandrUpdateStatus()));

                break;
            }

        }


    }
}

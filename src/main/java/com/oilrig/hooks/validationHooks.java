package com.oilrig.hooks;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonFile;
import com.oilrig.models.Targeting.CreateTargetingResponse;
import com.oilrig.models.adTag.CreateAdTagResponse;
import com.oilrig.models.adUnit.CreateAdUnitResponse;
import com.oilrig.models.advertiser.CreateAdvertiserResponse;
import com.oilrig.models.campaign.CreateCampaignResponse;
import com.oilrig.models.creative.CreateCreativeResponse;
import com.oilrig.models.creativeMedia.CreateCreativeMediaResponse;
import com.oilrig.models.lineItem.CreateLineItemResponse;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import cucumber.api.java.Before;

import java.util.HashMap;
import java.util.Map;


public class validationHooks {

    static Object advTemplatePath = Constants.ADVERTISERRESPONCE_TEMPLATE_DATA;
    static Object cmpTemplatePath = Constants.CAMPAIGNRESPONCE_TEMPLATE_DATA;
    static Object lineItemTemplatePath = Constants.LINEITEMRESPONSE_TEMPLATE_DATA;
    static Object targetingTemplatePath = Constants.TARGETINGRESPONSE_TEMPLATE_DATA;
    static Object adUnitTemplatePath = Constants.ADUNITRESPONSE_TEMPLATE_DATA;
    static Object creativeTemplatePath = Constants.CREATIVERESPONSE_TEMPLATE_DATA;
    static Object creativeMediaTemplatePath = Constants.CREATIVEMEDIARESPONSE_TEMPLATE_DATA;
    static Object adTagTemplatePath = Constants.ADTAGRESPONSE_TEMPLATE_DATA;
    public static Map<String, Map<String, String>> eventInfo = new HashMap<String, Map<String, String>>();

    @Before(value = {"@loadTestData"})
    public void setupConfigurationOfTemplates() {

        CreateAdvertiserResponse rootAdvertiserResponse = (MapBuilderFromJsonFile
                .buildFromTemplate(CreateAdvertiserResponse.class, advTemplatePath.toString(), false).get());
        CreateCampaignResponse rootCmpResponse = (MapBuilderFromJsonFile
                .buildFromTemplate(CreateCampaignResponse.class, cmpTemplatePath.toString(), false).get());
        CreateLineItemResponse rootLineItemResponse = (MapBuilderFromJsonFile
                .buildFromTemplate(CreateLineItemResponse.class, lineItemTemplatePath.toString(), false).get());
        CreateTargetingResponse rootTargetingResponse = MapBuilderFromJsonFile
                .buildFromTemplate(CreateTargetingResponse.class, targetingTemplatePath.toString(), false).get();
        CreateAdUnitResponse rootAdUnitResponse = MapBuilderFromJsonFile
                .buildFromTemplate(CreateAdUnitResponse.class, adUnitTemplatePath.toString(), false).get();
        CreateCreativeResponse rootCreateCreativeResponse = MapBuilderFromJsonFile
                .buildFromTemplate(CreateCreativeResponse.class, creativeTemplatePath.toString(), false).get();
        CreateCreativeMediaResponse rootCreateCreativeMediaResponse = MapBuilderFromJsonFile
                .buildFromTemplate(CreateCreativeMediaResponse.class, creativeMediaTemplatePath.toString(), false).get();
        CreateAdTagResponse rootCreateAdTagResponse = MapBuilderFromJsonFile
                .buildFromTemplate(CreateAdTagResponse.class, adTagTemplatePath.toString(), false).get();

        Map<?, ?> obj = MapBuilderFromJsonFile.MapBuilderFromJsonTemplate(Constants.CREATIVEEVENTREQUEST_TEMPLATE_DATA);
        eventInfo.putAll((Map<? extends String, ? extends Map<String, String>>) obj);

        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setAdvertiserResponse(rootAdvertiserResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCampaignResponse(rootCmpResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setLineItemResponse(rootLineItemResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setTargetingResponse(rootTargetingResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setAdUnitResponse(rootAdUnitResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCreativeResponse(rootCreateCreativeResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCreativeMediaResponse(rootCreateCreativeMediaResponse);
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setAdTagResponse(rootCreateAdTagResponse);
    }
}

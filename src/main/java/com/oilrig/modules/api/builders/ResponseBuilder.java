package com.oilrig.modules.api.builders;

import com.google.inject.Singleton;
import com.oilrig.models.PublishCampaign.PublishCampaignResponse;
import com.oilrig.models.Targeting.CreateTargetingResponse;
import com.oilrig.models.adTag.CreateAdTagResponse;
import com.oilrig.models.adUnit.CreateAdUnitResponse;
import com.oilrig.models.advertiser.CreateAdvertiserResponse;
import com.oilrig.models.campaign.CreateCampaignResponse;
import com.oilrig.models.campaignHomePage.CampaignHomePage;
import com.oilrig.models.creative.CreateCreativeResponse;
import com.oilrig.models.creativeEvents.CreateCreativeEventResponse;
import com.oilrig.models.creativeMedia.CreateCreativeMediaResponse;
import com.oilrig.models.lineItem.CreateLineItemResponse;
import com.oilrig.models.login.CreateLogInResponse;
import com.oilrig.models.token.TokenResponse;

@Singleton
public class ResponseBuilder {
    private CreateLogInResponse logInResponse;
    private TokenResponse tokenResponse;
    private CreateCampaignResponse campaignResponse;
    private CampaignHomePage campaignHomePageResponse;
    private CreateAdvertiserResponse advertiserResponse;
    private CreateLineItemResponse lineItemResponse;
    private CreateTargetingResponse targetingResponse;
    private CreateAdUnitResponse adUnitResponse;
    private CreateCreativeResponse creativeResponse;
    private CreateCreativeMediaResponse creativeMediaResponse;
    private CreateCreativeEventResponse createCreativeEventResponse;
    private CreateAdTagResponse adTagResponse;
    private PublishCampaignResponse publishCampaignResponse;

    public CreateLogInResponse getLogInResponse() {
        return logInResponse;
    }

    public void setLogInResponse(CreateLogInResponse logInResponse) {
        this.logInResponse = logInResponse;
    }

    public TokenResponse getTokenResponse() {
        return tokenResponse;
    }

    public void setTokenResponse(TokenResponse tokenResponse) {
        this.tokenResponse = tokenResponse;
    }

    public CreateCampaignResponse getCampaignResponse() {
        return campaignResponse;
    }

    public void setCampaignResponse(CreateCampaignResponse campaignResponse) {
        this.campaignResponse = campaignResponse;
    }

    public void setCampaignHomePageResponse(CampaignHomePage campaignHomeResponse) {
        this.campaignHomePageResponse = campaignHomeResponse;
    }

    public CampaignHomePage getCampaignHomeResponse() {
        return campaignHomePageResponse;
    }

    public CreateAdvertiserResponse getAdvertiserResponse() {
        return advertiserResponse;
    }

    public void setAdvertiserResponse(CreateAdvertiserResponse advertiserResponse) {
        this.advertiserResponse = advertiserResponse;
    }

    public CreateLineItemResponse getLineItemResponse() {
        return lineItemResponse;
    }

    public void setLineItemResponse(CreateLineItemResponse lineItemResponse) {
        this.lineItemResponse = lineItemResponse;
    }

    public CreateTargetingResponse getTargetingResponse() {
        return targetingResponse;
    }

    public void setTargetingResponse(CreateTargetingResponse targetingResponse) {
        this.targetingResponse = targetingResponse;
    }

    public CreateAdUnitResponse getAdUnitResponse() {
        return adUnitResponse;
    }

    public void setAdUnitResponse(CreateAdUnitResponse adUnitResponse) {
        this.adUnitResponse = adUnitResponse;
    }

    public CreateCreativeResponse getCreativeResponse() {
        return creativeResponse;
    }

    public void setCreativeResponse(CreateCreativeResponse creativeResponse) {
        this.creativeResponse = creativeResponse;
    }

    public CreateCreativeMediaResponse getCreativeMediaResponse() {
        return creativeMediaResponse;
    }

    public void setCreativeMediaResponse(CreateCreativeMediaResponse creativeMediaResponse) {
        this.creativeMediaResponse = creativeMediaResponse;
    }

    public void setCreativeEventResponse(CreateCreativeEventResponse creativeEventResponse) {
        this.createCreativeEventResponse = creativeEventResponse;
    }

    public CreateCreativeEventResponse getCreativeEventResponse() {
        return createCreativeEventResponse;
    }

    public CreateAdTagResponse getAdTagResponse() {
        return adTagResponse;
    }

    public void setAdTagResponse(CreateAdTagResponse adTagResponse) {
        this.adTagResponse = adTagResponse;
    }

    public PublishCampaignResponse getPublishCampaignResponse() {
        return publishCampaignResponse;
    }

    public void setPublishCampaignResponse(PublishCampaignResponse publishCampaignResponse) {
        this.publishCampaignResponse = publishCampaignResponse;
    }

}
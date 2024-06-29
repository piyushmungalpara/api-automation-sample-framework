package com.oilrig.models.campaignHomePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CampaignHomeData {
    @SerializedName("campaigns")
    @Expose
    private List<CampaignsHome> campaigns = null;

    public List<CampaignsHome> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignsHome> campaigns) {
        this.campaigns = campaigns;
    }

}


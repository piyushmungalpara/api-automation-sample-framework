package com.oilrig.models.campaignHomePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CampaignHomePage {


    @SerializedName("data")
    @Expose
    private CampaignHomeData data;

    public CampaignHomeData getData() {
        return data;
    }

    public void setData(CampaignHomeData data) {
        this.data = data;
    }

}


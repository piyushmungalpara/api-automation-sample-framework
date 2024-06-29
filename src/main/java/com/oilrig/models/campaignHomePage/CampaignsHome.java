package com.oilrig.models.campaignHomePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CampaignsHome {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("budget_type")
    @Expose
    private String budgetType;
    @SerializedName("advertiser_id")
    @Expose
    private Integer advertiserId;
    @SerializedName("viewability_standard_provider")
    @Expose
    private String viewabilityStandardProvider;
    @SerializedName("xandr_campaign_id")
    @Expose
    private Object xandrCampaignId;
    @SerializedName("xandr_update_status")
    @Expose
    private Boolean xandrUpdateStatus;
    @SerializedName("xandr_budget_interval_id")
    @Expose
    private Object xandrBudgetIntervalId;
    @SerializedName("lifetime_budget_revenue")
    @Expose
    private double lifetimeBudgetRevenue;
    @SerializedName("lifetime_budget_imps")
    @Expose
    private double lifetimeBudgetImps;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("user_id")
    @Expose
    private Object userId;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("advertiser")
    @Expose
    private AdvertiserHome advertiser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public Integer getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    public String getViewabilityStandardProvider() {
        return viewabilityStandardProvider;
    }

    public void setViewabilityStandardProvider(String viewabilityStandardProvider) {
        this.viewabilityStandardProvider = viewabilityStandardProvider;
    }

    public Object getXandrCampaignId() {
        return xandrCampaignId;
    }

    public void setXandrCampaignId(Object xandrCampaignId) {
        this.xandrCampaignId = xandrCampaignId;
    }

    public Boolean getXandrUpdateStatus() {
        return xandrUpdateStatus;
    }

    public void setXandrUpdateStatus(Boolean xandrUpdateStatus) {
        this.xandrUpdateStatus = xandrUpdateStatus;
    }

    public Object getXandrBudgetIntervalId() {
        return xandrBudgetIntervalId;
    }

    public void setXandrBudgetIntervalId(Object xandrBudgetIntervalId) {
        this.xandrBudgetIntervalId = xandrBudgetIntervalId;
    }

    public double getLifetimeBudgetRevenue() {
        return lifetimeBudgetRevenue;
    }

    public void setLifetimeBudgetRevenue(double lifetimeBudgetRevenue) {
        this.lifetimeBudgetRevenue = lifetimeBudgetRevenue;
    }

    public double getLifetimeBudgetImps() {
        return lifetimeBudgetImps;
    }

    public void setLifetimeBudgetImps(double lifetimeBudgetImps) {
        this.lifetimeBudgetImps = lifetimeBudgetImps;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public AdvertiserHome getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(AdvertiserHome advertiser) {
        this.advertiser = advertiser;
    }

}

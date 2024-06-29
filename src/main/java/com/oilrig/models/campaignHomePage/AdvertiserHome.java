package com.oilrig.models.campaignHomePage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdvertiserHome {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("xandr_advertiser_id")
    @Expose
    private double xandrAdvertiserId;
    @SerializedName("xandr_update_status")
    @Expose
    private Boolean xandrUpdateStatus;
    @SerializedName("user_id")
    @Expose
    private Object userId;
    @SerializedName("createdAt")
    @Expose
    private Object createdAt;
    @SerializedName("updatedAt")
    @Expose
    private Object updatedAt;

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

    public double getXandrAdvertiserId() {
        return xandrAdvertiserId;
    }

    public void setXandrAdvertiserId(double xandrAdvertiserId) {
        this.xandrAdvertiserId = xandrAdvertiserId;
    }

    public Boolean getXandrUpdateStatus() {
        return xandrUpdateStatus;
    }

    public void setXandrUpdateStatus(Boolean xandrUpdateStatus) {
        this.xandrUpdateStatus = xandrUpdateStatus;
    }

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

}

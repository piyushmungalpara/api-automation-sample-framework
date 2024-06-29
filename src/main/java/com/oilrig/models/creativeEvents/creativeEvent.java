package com.oilrig.models.creativeEvents;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class creativeEvent {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("event_id")
    @Expose
    private Integer eventId;
    @SerializedName("event_url")
    @Expose
    private String eventUrl;
    @SerializedName("creative_id")
    @Expose
    private Integer creativeId;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Integer getCreativeId() {
        return creativeId;
    }

    public void setCreativeId(Integer creativeId) {
        this.creativeId = creativeId;
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

}
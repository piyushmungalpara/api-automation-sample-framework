package com.oilrig.models.creativeEvents;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventRequestData {

    @SerializedName("event_id")
    @Expose
    private Integer eventId;
    @SerializedName("event_url")
    @Expose
    private String eventUrl;

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
}

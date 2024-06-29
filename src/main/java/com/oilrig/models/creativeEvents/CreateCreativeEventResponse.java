package com.oilrig.models.creativeEvents;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateCreativeEventResponse {
    @SerializedName("data")
    @Expose
    private EventData data;

    public EventData getData() {
        return data;
    }

    public void setData(EventData data) {
        this.data = data;
    }
}

package com.oilrig.models.creativeEvents;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventData {

    @SerializedName("creativeEvents")
    @Expose
    private List<creativeEvent> creativeEvents = null;

    public List<creativeEvent> getCreativeEvents() {
        return creativeEvents;
    }

    public void setCreativeEvents(List<creativeEvent> creativeEvents) {
        this.creativeEvents = creativeEvents;
    }

}

package com.oilrig.modules.api.actions;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.hooks.validationHooks;
import com.oilrig.models.creativeEvents.CreateCreativeEventResponse;
import com.oilrig.models.creativeEvents.EventRequestData;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreativeEventActions {
    private Response response;
    private static final Logger LOG = LogManager.getLogger(CreativeEventActions.class);
    private List<EventRequestData> eventJsonData = new ArrayList<>();


    @Step
    public void setParameterToCreateCreativeEvent(List<Map<String, String>> creativeEventDetailsMap) {
        List<EventRequestData> eventData = new ArrayList<>();

        for (Map<String, String> s : creativeEventDetailsMap) {
            EventRequestData obj = new EventRequestData();
            if (ParamUtils.splitValues(s.get("event_type"))[0].equals("true")) {
                String event = (ParamUtils.splitValues(s.get("event_type"))[1]).toUpperCase();
                obj.setEventId(Integer.parseInt(validationHooks.eventInfo.get(event).get("event_id")));
                obj.setEventUrl(validationHooks.eventInfo.get(event).get("event_url"));
                eventData.add(obj);
            }
        }
        eventJsonData = eventData;
    }

    public void postAPOSTRequestToCreateCreativeEvent() {

        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(eventJsonData, ObjectMapperType.GSON).when()
                .post(Constants.CREATIVEEVENT_BASEENDPOINT_URL.replace("${creativeId}",
                        String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                                .getCreativeResponse().getData().getCreatives().getId())));
        LOG.info("Response of Create Creative Event API: " + response.asString());
        LOG.info("Response Code of Create Creative Event API: " + response.statusCode());
        CreateCreativeEventResponse obj = (CreateCreativeEventResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateCreativeEventResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCreativeEventResponse(obj);
    }

    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    public void verifyResponseAsPerParametersGiven() {
        for (int event = 0; event < eventJsonData.size(); event++) {
            if (eventJsonData.get(event).getEventId() == (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeEventResponse().getData().getCreativeEvents().get(event).getEventId()) &&
                    eventJsonData.get(event).getEventUrl().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeEventResponse().getData().getCreativeEvents().get(event).getEventUrl())) {
                LOG.info("Response of Creative Event is as per requested for eventID : " + eventJsonData.get(event).getEventId());
            }else LOG.error("Response of Creative Event is not as per requested");
        }
    }
}

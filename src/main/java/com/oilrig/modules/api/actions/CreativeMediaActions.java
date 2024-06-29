package com.oilrig.modules.api.actions;

import org.apache.log4j.Logger;

import com.oilrig.enumtypes.ObjectType;
import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.creativeMedia.CreateCreativeMediaRequest;
import com.oilrig.models.creativeMedia.CreateCreativeMediaResponse;
import com.oilrig.modules.api.builders.CreativeMediaBuilder;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.Map;

public class CreativeMediaActions {
    private CreateCreativeMediaRequest creativeMediaRequest;
    private CreativeMediaBuilder creativeMediaBuilder;
    private Response response;
    private static Logger LOG = Logger.getLogger("");

    @Step
    public void setParameterToCreateCreativeMedia(List<Map<String, String>> creativeMediaDetailsMap) {
        creativeMediaBuilder = new CreativeMediaBuilder();

        if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeResponse().getData()
                .getCreatives().getIs_third_party_tag()) {
            creativeMediaBuilder.setCreativeMedia(ObjectType.CREATIVEMEDIA_THIRDPARTY.toString());
            configureParameterToCreateCreativeMedia(creativeMediaDetailsMap.get(0).get("media_url"));
        } else {
            creativeMediaBuilder.setCreativeMedia(ObjectType.CREATIVEMEDIA_EMX.toString());
            configureParameterToCreateCreativeMediaEMX(
                    creativeMediaDetailsMap.get(0).get("media_url"),
                    creativeMediaDetailsMap.get(0).get("file_type"),
                    creativeMediaDetailsMap.get(0).get("width"),
                    creativeMediaDetailsMap.get(0).get("height"),
                    creativeMediaDetailsMap.get(0).get("duration"));
        }
    }

    private void configureParameterToCreateCreativeMedia(String media_url) {
        creativeMediaRequest = creativeMediaBuilder.getCreativeMediaRequest();

        if (ParamUtils.splitValues(media_url)[0].equals("false"))
            creativeMediaRequest.setMedia_url(null);

    }

    @Step
    public void configureParameterToCreateCreativeMediaEMX(String media_url, String file_type, String width,
                                                           String height, String duration) {
        creativeMediaRequest = creativeMediaBuilder.getCreativeMediaRequest();

        if (ParamUtils.splitValues(media_url)[0].equals("false"))
            creativeMediaRequest.setMedia_url(null);
        if (ParamUtils.splitValues(file_type)[0].equals("false"))
            creativeMediaRequest.setFile_type(null);
    }

    @Step
    public void postAPOSTRequestToCreateCreativeMedia() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(creativeMediaRequest, ObjectMapperType.GSON).when()
                .post(Constants.CREATIVEMEDIA_BASEENDPOINT_URL.replace("${creativeId}",
                        String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                                .getCreativeResponse().getData().getCreatives().getId())));

        CreateCreativeMediaResponse obj = (CreateCreativeMediaResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateCreativeMediaResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setCreativeMediaResponse(obj);

        LOG.info("Response of Create Creative Media API: " + response.asString());
        LOG.info("Response Code of Create Creative Media API: " + response.statusCode());
    }

    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    public void verifyResponseAsPerPassedParams() {
        if (creativeMediaRequest.getDuration() == DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeMediaResponse().getData().getCreativeMedia().getDuration() &&
                creativeMediaRequest.getMedia_url().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeMediaResponse().getData().getCreativeMedia().getMedia_url()) &&
                creativeMediaRequest.getHeight() == DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeMediaResponse().getData().getCreativeMedia().getHeight() &&
                creativeMediaRequest.getWidth() == DependencyManager.getInjector().getInstance(ResponseBuilder.class).getCreativeMediaResponse().getData().getCreativeMedia().getWidth()) {
            LOG.info("response is as per parameters passed for CreativeMedia");
        } else LOG.error("response is not as per parameters passed");
    }
}
package com.oilrig.modules.api.actions;

import org.apache.log4j.Logger;

import com.oilrig.factory.DependencyManager;
import com.oilrig.factory.MapBuilderFromJsonString;
import com.oilrig.models.Targeting.CreateTargetingRequest;
import com.oilrig.models.Targeting.CreateTargetingResponse;
import com.oilrig.modules.api.builders.HeaderBuilder;
import com.oilrig.modules.api.builders.ResponseBuilder;
import com.oilrig.modules.api.builders.TargetingBuilder;
import com.oilrig.utility.api.Constants;
import com.oilrig.utility.api.ParamUtils;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.*;

import java.util.*;

public class TargetingActions {
    private CreateTargetingRequest targetingRequest;
    private TargetingBuilder targetingBuilder;
    private Response response;
    private static Logger LOG = Logger.getLogger("");

    @Step
    public void setParameterToCreateTargeting(List<Map<String, String>> targetingDetailsMap) {
        targetingBuilder = new TargetingBuilder();
        targetingBuilder.setTargeting();

        configureParameterToCreateTargeting(targetingDetailsMap);
    }

    @Step
    public void configureParameterToCreateTargeting(List<Map<String, String>> targetingDetailsMap) {
        targetingRequest = targetingBuilder.getTargetingRequest();

        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("city"))[0].equals("false"))
            targetingRequest.setCity(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("country"))[0].equals("false"))
            targetingRequest.setCountry(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("region"))[0].equals("false"))
            targetingRequest.setRegion(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("dma"))[0].equals("false"))
            targetingRequest.setDma(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("language"))[0].equals("false"))
            targetingRequest.setLanguage(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("device_type"))[0].equals("false"))
            targetingRequest.setDevice_type(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("os_type"))[0].equals("false"))
            targetingRequest.setOs_type(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("browser"))[0].equals("false"))
            targetingRequest.setBrowser(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("segment"))[0].equals("false"))
            targetingRequest.setSegment(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("seller_network"))[0].equals("false"))
            targetingRequest.setSeller_network(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("player_size"))[0].equals("false"))
            targetingRequest.setPlayer_size(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("visibility_type"))[0].equals("false"))
            targetingRequest.setVisibility_type(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("daypart_target"))[0].equals("false"))
            targetingRequest.setDaypart_target(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("inventory_list"))[0].equals("false"))
            targetingRequest.setInventory_list(null);
        if (ParamUtils.splitValues(targetingDetailsMap.get(0).get("zip_code_file"))[0].equals("false"))
            targetingRequest.setZip_code_file(null);
    }

    @Step
    public void postAPOSTRequestToCreateTargeting() {
        response = SerenityRest.given().headers(HeaderBuilder.getHeadersWithToken())
                .body(targetingRequest, ObjectMapperType.GSON).when()
                .post(Constants.TARGETING_BASEENDPOINT_URL.replace("${lineItemId}",
                        String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class)
                                .getLineItemResponse().getData().getLineItem().getId())));

        LOG.info("Response of Create Targeting API: " + response.asString());
        LOG.info("Response Code of Create Targeting API: " + response.statusCode());

        CreateTargetingResponse obj = (CreateTargetingResponse) MapBuilderFromJsonString
                .buildFromJsonString(CreateTargetingResponse.class, response).get();
        DependencyManager.getInjector().getInstance(ResponseBuilder.class).setTargetingResponse(obj);


    }


    @Step
    public int getStatusCodeOfResponse() {
        return response.then().extract().statusCode();
    }

    public void verifyResponseisAsPerGivenParameters() {
        //verify response as per input given
        HashSet<Integer> browser = new HashSet<>();
        HashSet<String> cityCode = new HashSet<>();
        HashSet<String> countryCode = new HashSet<>();
        HashSet<String> regionCode = new HashSet<>();
        HashSet<String> regionCodeRequest = new HashSet<>();
        HashSet<Integer> dmaCode = new HashSet<>();
        HashSet<String> languageCode = new HashSet<>();
        HashSet<Integer> deviceType = new HashSet<>();
        HashSet<Integer> osType = new HashSet<>();
        HashSet<Integer> segmentId = new HashSet<>();
        HashSet<Integer> sellerNetwrokId = new HashSet<>();
        HashSet<Integer> inventoryList = new HashSet<>();
        HashSet<Integer> playersize = new HashSet<>();
        HashSet<Integer> visibilityType = new HashSet<>();
        if (targetingRequest.getBrowser().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_browsers().size(); index++) {
                browser.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_browsers().get(index).getBrowser_id());
            }
            assertTrue(browser.equals(targetingRequest.getBrowser().getParams()));
        } else if (targetingRequest.getBrowser().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for browser type",
                    targetingRequest.getBrowser().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getBrowser_action()));
        }

        //city
        if (targetingRequest.getCity().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_cities().size(); index++) {
                cityCode.add(String.valueOf(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_cities().get(index).getCity_id()));
            }
            assertTrue(cityCode.equals(targetingRequest.getCity().getParams()));
        } else if (targetingRequest.getCity().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for browser type",
                    targetingRequest.getCity().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getCity_action()));
        }
        //country
        if (targetingRequest.getCountry().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_countries().size(); index++) {
                countryCode.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_countries().get(index).getCountry_code());
            }
            assertTrue(countryCode.equals(targetingRequest.getCountry().getParams()));
        } else if (targetingRequest.getCountry().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for browser type",
                    targetingRequest.getCountry().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getCountry_action()));
        }

        //region
        if (targetingRequest.getRegion().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_regions().size(); index++) {
                regionCode.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_regions().get(index).getRegion_code());
            }
            for(int index =0;index<targetingRequest.getRegion().getParams().size();index++){
                    regionCodeRequest.add(targetingRequest.getRegion().getParams().get(index).getRegion_code());
            }
            assertTrue(regionCode.equals(regionCodeRequest));
        } else if (targetingRequest.getCity().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for region",
                    targetingRequest.getRegion().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getRegion_action()));
        }

        //dmaCode
        if (targetingRequest.getDma().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_dmas().size(); index++) {
                dmaCode.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_dmas().get(index).getDma_code());
            }
            assertTrue(dmaCode.equals(targetingRequest.getDma().getParams()));
        } else if (targetingRequest.getDma().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for browser type",
                    targetingRequest.getDma().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getDma_action()));
        }

        //LanguageCode
        if (targetingRequest.getLanguage().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_languages().size(); index++) {
                languageCode.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_languages().get(index).getLanguage_code());
            }
            assertTrue(languageCode.equals(targetingRequest.getLanguage().getParams()));
        } else if (targetingRequest.getLanguage().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for browser type",
                    targetingRequest.getLanguage().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getLanguage_action()));
        }

        //Device Type
        if (targetingRequest.getDevice_type().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_device_types().size(); index++) {
                deviceType.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_device_types().get(index).getDevice_type_id());
            }
            assertTrue(deviceType.equals(targetingRequest.getDevice_type().getParams()));
        } else if (targetingRequest.getDevice_type().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for browser type",
                    targetingRequest.getDevice_type().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getDevice_type_action()));
        }

        //OS Type
        if (targetingRequest.getOs_type().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_os_types().size(); index++) {
                osType.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_os_types().get(index).getOs_type_id());
            }
            assertTrue(osType.equals(targetingRequest.getOs_type().getParams()));
        } else if (targetingRequest.getOs_type().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for OS type",
                    targetingRequest.getOs_type().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getOs_action()));
        }
        //segmentId
        if (targetingRequest.getSegment().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_segments().size(); index++) {
                segmentId.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_segments().get(index).getSegment_id());
            }
            assertTrue(segmentId.equals(targetingRequest.getSegment().getParams()));
        } else if (targetingRequest.getSegment().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for segments",
                    targetingRequest.getSegment().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getSegment_action()));
        }
        //sellerNetwrokId
        if (targetingRequest.getSeller_network().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_seller_networks().size(); index++) {
                sellerNetwrokId.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_segments().get(index).getSegment_id());
            }
            assertTrue(sellerNetwrokId.equals(targetingRequest.getSeller_network().getParams()));
        } else if (targetingRequest.getSeller_network().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for seller network",
                    targetingRequest.getSeller_network().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getSeller_network_action()));
        }
        //inventoryList
        if (targetingRequest.getInventory_list().getAction().equals("include")) {
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_inventory_lists().size(); index++) {
                inventoryList.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_inventory_lists().get(index).getInventory_list_id());
            }
            assertTrue(inventoryList.equals(targetingRequest.getInventory_list().getParams()));
        } else if (targetingRequest.getInventory_list().getAction().equals("exclude")) {
            assertTrue("Targetting : Response matches for Inventory list",
                    targetingRequest.getInventory_list().getAction().equals(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getInventory_list_action()));
        }

        //playersize
        if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_inventory_lists().size() != 0)
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_player_sizes().size(); index++) {
                playersize.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_player_sizes().get(index).getPlayer_size_id());
            }
        assertTrue(playersize.equals(targetingRequest.getPlayer_size().getParams()));

        //visibility type
        if (DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_visibility_types().size() != 0)
            for (int index = 0; index < DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_visibility_types().size(); index++) {
                visibilityType.add(DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTargetingResponse().getData().getProfile().getProfile_visibility_types().get(index).getVisibility_type_id());
            }
        assertTrue(visibilityType.equals(targetingRequest.getVisibility_type().getParams()));
            

    }
}
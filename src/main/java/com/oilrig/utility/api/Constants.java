package com.oilrig.utility.api;

import com.oilrig.enumtypes.BaseURL;
import com.oilrig.enumtypes.Header;
import com.oilrig.enumtypes.ObjectType;
import com.oilrig.enumtypes.QueryMethod;
import com.oilrig.factory.BaseEndPointURLFactory;
import com.oilrig.factory.BaseConfigFileFactory;


import java.io.File;

public class Constants {
    //public static final String EXECUION_ENVIRONMENT_DEFAULT = "DEVELOPMENT";
    public static final File TESTDATACONFIG = new File("src\\test\\resources\\config\\api\\testdataconfig.ini");

    //public static final String EXECUTION_ENVIRONMENT = System.getProperty("testEnvironment") != null ? System.getProperty("testEnvironment") : EXECUION_ENVIRONMENT_DEFAULT;

    // BASE URL path
    public static final String SIGNIN_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.SIGN_IN, BaseURL.LOGIN).buildBaseEndPointURL();
    public static final String AUTHORIZE_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.AUTHORIZE, BaseURL.LOGIN).buildBaseEndPointURL();
    public static final String TOKEN_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.TOKEN, BaseURL.LOGIN).buildBaseEndPointURL();
    public static final String ADVERTISER_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.ADVERTISER, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String CAMPAIGN_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.CAMPAIGN, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String LINEITEM_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.LINE_ITEM, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String TARGETING_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.TARGETING, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String ADUNIT_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.ADUNIT, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String CREATIVE_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.CREATIVE, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String CREATIVEMEDIA_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.CREATIVEMEDIA_EMX, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String CREATIVEEVENT_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.CREATIVEEVENTS, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String ADTAG_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.ADTAG, BaseURL.OILRIG).buildBaseEndPointURL();
    public static final String PUBLISHCAMPAIGN_BASEENDPOINT_URL = BaseEndPointURLFactory
            .getBaseEndPointURLBuilderWith(ObjectType.PUBLISH_CAMPAIGN, BaseURL.META_DSP).buildBaseEndPointURL();

    // TEMPLATES FILE PATH
    public static final String LOGINREQUEST_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.SIGN_IN.toString(), QueryMethod.REQUESTTEMPLATES).getFileParamData();
    public static final String TOKENREQUEST_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.TOKEN.toString(), QueryMethod.REQUESTTEMPLATES).getFileParamData();
    public static final String TARGETINGREQUEST_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.TARGETING.toString(), QueryMethod.REQUESTTEMPLATES).getFileParamData();
    public static final String CREATIVEMEDIAEMXREQUEST_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.CREATIVEMEDIA_EMX.toString(), QueryMethod.REQUESTTEMPLATES).getFileParamData();
    public static final String CREATIVEMEDIATHIRDPARTYREQUEST_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.CREATIVEMEDIA_THIRDPARTY.toString(), QueryMethod.REQUESTTEMPLATES).getFileParamData();
    public static final String CREATIVEEVENTREQUEST_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.CREATIVEEVENTS.toString(), QueryMethod.REQUESTTEMPLATES).getFileParamData();

    //RESPONSE TEMPLATE DATA
    public static final String ADVERTISERRESPONCE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.ADVERTISER.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String CAMPAIGNRESPONCE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.CAMPAIGN.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String LINEITEMRESPONSE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.LINE_ITEM.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String TARGETINGRESPONSE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.TARGETING.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String ADUNITRESPONSE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.ADUNIT.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String CREATIVERESPONSE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.CREATIVE.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String CREATIVEMEDIARESPONSE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.CREATIVEMEDIA_EMX.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();
    public static final String ADTAGRESPONSE_TEMPLATE_DATA = BaseConfigFileFactory
            .getFileParamDataBuilderWith(ObjectType.ADTAG.toString(), QueryMethod.RESPONSETEMPLATES).getFileParamData();


    // FETCH HEADER DATA
    public static final String GETCONTENT_TYPE = BaseConfigFileFactory
            .getFileParamDataBuilderWith(Header.CONTENT_TYPE.toString(), QueryMethod.HEADER).getFileParamData();
    public static final String GETORIGIN = BaseConfigFileFactory
            .getFileParamDataBuilderWith(Header.ORIGIN.toString(), QueryMethod.HEADER).getFileParamData();
}
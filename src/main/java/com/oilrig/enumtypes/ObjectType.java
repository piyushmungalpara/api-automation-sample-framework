package com.oilrig.enumtypes;

public enum ObjectType {
    SIGN_IN {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "co/authenticate";
        }
    },

    AUTHORIZE {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "authorize";
        }
    },

    TOKEN {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "oauth/token";
        }
    },

    ADVERTISER {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "advertisers";
        }
    },

    CAMPAIGN {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "campaigns";
        }
    },

    LINE_ITEM {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "campaigns/${campaignId}/line_items";
        }
    },

    TARGETING {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "line_items/${lineItemId}/profiles";
        }
    },

    ADUNIT {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "line_items/${lineItemId}/ad_units";
        }
    },

    CREATIVE {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "ad_units/${adUnitId}/creatives";
        }
    },

    CREATIVEMEDIA_EMX {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "creatives/${creativeId}/creativeMedia";
        }
    },

    CREATIVEEVENTS {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "creatives/${creativeId}/creativeEvents";
        }
    },

    CREATIVEMEDIA_THIRDPARTY {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "creatives/${creativeId}/creativeMedia";
        }
    },

    ADTAG {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "ad_units/${adUnitId}/creatives/${creativeId}";
        }
    },

    PUBLISH_CAMPAIGN {
        @Override
        public String getEntityEndPointSuffixForAPIUrl() {
            return "xandr/publish/${advertiserId}/campaign/${campaignId}";
        }
    };

    public String getEntityEndPointSuffixForAPIUrl() {
        return null;
    }
}
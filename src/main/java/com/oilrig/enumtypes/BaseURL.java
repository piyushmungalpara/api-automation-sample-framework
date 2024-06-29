package com.oilrig.enumtypes;

public enum BaseURL {
	LOGIN {
		@Override
		public String getAPIBaseEndPointPrefix() {
			return "https://emxdigital-dev.auth0.com/";
		}
	},

	OILRIG {
		@Override
		public String getAPIBaseEndPointPrefix() {
			return "https://overdrive-api-dev.emxdigital.com/";
		}
	},
	LOGOUT {
		@Override
		public String getAPIBaseEndPointPrefix() {
			return "https://s3.amazonaws.com/insights.clearstream.tv/";
		}
	},
	META_DSP {
		@Override
		public String getAPIBaseEndPointPrefix() {
			return "https://meta-dsp-api-dev.emxdigital.com/";
		}
	},
	RTA {
		@Override
		public String getAPIBaseEndPointPrefix() {
			return "http://emx-slicer-dev.s3-website-us-east-1.amazonaws.com/";
		}
	},
	PLANNER {
		@Override
		public String getAPIBaseEndPointPrefix() {
			return "http://planner.emxdigital.com/";
		}
	};

	public String getAPIBaseEndPointPrefix() {
		return null;
	}

}
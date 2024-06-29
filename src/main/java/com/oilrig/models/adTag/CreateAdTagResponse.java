package com.oilrig.models.adTag;

public class CreateAdTagResponse {

	private DataParams data;

	public void setData(DataParams data) {
		this.data = data;
	}

	public DataParams getData() {
		return this.data;
	}

	public class DataParams {
		private String ad_tag_url;

		private String ad_tag;

		private String success;

		public void setAd_tag_url(String ad_tag_url) {
			this.ad_tag_url = ad_tag_url;
		}

		public String getAd_tag_url() {
			return this.ad_tag_url;
		}

		public void setAd_tag(String ad_tag) {
			this.ad_tag = ad_tag;
		}

		public String getAd_tag() {
			return this.ad_tag;
		}

		public void setSuccess(String success) {
			this.success = success;
		}

		public String getSuccess() {
			return this.success;
		}
	}
}
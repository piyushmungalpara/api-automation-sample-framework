package com.oilrig.models.creative;

public class CreateCreativeResponse {
	private DataParams data;

	public void setData(DataParams data) {
		this.data = data;
	}

	public DataParams getData() {
		return this.data;
	}

	public class DataParams {
		private CreativesParams creatives;

		public void setCreatives(CreativesParams creatives) {
			this.creatives = creatives;
		}

		public CreativesParams getCreatives() {
			return this.creatives;
		}
	}

	public class CreativesParams {
		private int id;
		private String name;
		private int advertiser_id;
		private String ad_type;
		private boolean is_third_party_tag;
		private String ad_tag_type;
		private boolean is_non_linear;
		private String updatedAt;
		private String createdAt;
		private String ad_tag_url;
		private String third_party_url;
		private String user_id;

		public void setId(int id) {
			this.id = id;
		}

		public int getId() {
			return this.id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setAdvertiser_id(int advertiser_id) {
			this.advertiser_id = advertiser_id;
		}

		public int getAdvertiser_id() {
			return this.advertiser_id;
		}

		public void setAd_type(String ad_type) {
			this.ad_type = ad_type;
		}

		public String getAd_type() {
			return this.ad_type;
		}

		public void setIs_third_party_tag(boolean is_third_party_tag) {
			this.is_third_party_tag = is_third_party_tag;
		}

		public boolean getIs_third_party_tag() {
			return this.is_third_party_tag;
		}

		public void setAd_tag_type(String ad_tag_type) {
			this.ad_tag_type = ad_tag_type;
		}

		public String getAd_tag_type() {
			return this.ad_tag_type;
		}

		public void setIs_non_linear(boolean is_non_linear) {
			this.is_non_linear = is_non_linear;
		}

		public boolean getIs_non_linear() {
			return this.is_non_linear;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public String getUpdatedAt() {
			return this.updatedAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getCreatedAt() {
			return this.createdAt;
		}

		public void setAd_tag_url(String ad_tag_url) {
			this.ad_tag_url = ad_tag_url;
		}

		public String getAd_tag_url() {
			return this.ad_tag_url;
		}

		public void setThird_party_url(String third_party_url) {
			this.third_party_url = third_party_url;
		}

		public String getThird_party_url() {
			return this.third_party_url;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getUser_id() {
			return this.user_id;
		}
	}
}
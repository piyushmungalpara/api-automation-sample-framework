package com.oilrig.models.adTag;

public class CreateAdTagRequest {

	private int advertiser_id;
	private String name;
	private String ad_type;
	private String third_party_url;

	public void setAdvertiser_id(int advertiser_id) {
		this.advertiser_id = advertiser_id;
	}

	public int getAdvertiser_id() {
		return this.advertiser_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAd_type(String ad_type) {
		this.ad_type = ad_type;
	}

	public String getAd_type() {
		return this.ad_type;
	}

	public String getThird_party_url() {
		return third_party_url;
	}

	public void setThird_party_url(String third_party_url) {
		this.third_party_url = third_party_url;
	}

}

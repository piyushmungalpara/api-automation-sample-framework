package com.oilrig.models.creative;

public class CreateCreativeRequest {
	private String name;
	private int split;
	private int advertiser_id;
	private String ad_type;
	private boolean is_third_party_tag;
	private String ad_tag_type;
	private boolean is_non_linear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSplit() {
		return split;
	}

	public void setSplit(int split) {
		this.split = split;
	}

	public int getAdvertiser_id() {
		return advertiser_id;
	}

	public void setAdvertiser_id(int advertiser_id) {
		this.advertiser_id = advertiser_id;
	}

	public String getAd_type() {
		return ad_type;
	}

	public void setAd_type(String ad_type) {
		this.ad_type = ad_type;
	}

	public boolean isIs_third_party_tag() {
		return is_third_party_tag;
	}

	public void setIs_third_party_tag(boolean is_third_party_tag) {
		this.is_third_party_tag = is_third_party_tag;
	}

	public String getAd_tag_type() {
		return ad_tag_type;
	}

	public void setAd_tag_type(String ad_tag_type) {
		this.ad_tag_type = ad_tag_type;
	}

	public boolean isIs_non_linear() {
		return is_non_linear;
	}

	public void setIs_non_linear(boolean is_non_linear) {
		this.is_non_linear = is_non_linear;
	}

}
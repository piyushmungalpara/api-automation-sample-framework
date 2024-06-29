package com.oilrig.models.PublishCampaign;

import java.util.List;

public class PublishCampaignResponse {
	private AdvertiserParams advertiser;
	private CampaignParams campaign;
	private List<ProfilesParams> profiles;
	private List<CreativesParams> creatives;
	private List<Line_itemsParams> line_items;

	public void setAdvertiser(AdvertiserParams advertiser) {
		this.advertiser = advertiser;
	}

	public AdvertiserParams getAdvertiser() {
		return this.advertiser;
	}

	public void setCampaign(CampaignParams campaign) {
		this.campaign = campaign;
	}

	public CampaignParams getCampaign() {
		return this.campaign;
	}

	public void setProfiles(List<ProfilesParams> profiles) {
		this.profiles = profiles;
	}

	public List<ProfilesParams> getProfiles() {
		return this.profiles;
	}

	public void setCreatives(List<CreativesParams> creatives) {
		this.creatives = creatives;
	}

	public List<CreativesParams> getCreatives() {
		return this.creatives;
	}

	public void setLine_items(List<Line_itemsParams> line_items) {
		this.line_items = line_items;
	}

	public List<Line_itemsParams> getLine_items() {
		return this.line_items;
	}

	public class AdvertiserParams {
		private double xandr_id;
		private int internal_id;
		private String message;

		public void setXandr_id(double xandr_id) {
			this.xandr_id = xandr_id;
		}

		public double getXandr_id() {
			return this.xandr_id;
		}

		public void setInternal_id(int internal_id) {
			this.internal_id = internal_id;
		}

		public int getInternal_id() {
			return this.internal_id;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return this.message;
		}
	}

	public class CampaignParams {
		private double xandr_id;
		private int internal_id;
		private String message;

		public void setXandr_id(double xandr_id) {
			this.xandr_id = xandr_id;
		}

		public double getXandr_id() {
			return this.xandr_id;
		}

		public void setInternal_id(int internal_id) {
			this.internal_id = internal_id;
		}

		public int getInternal_id() {
			return this.internal_id;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return this.message;
		}
	}

	public class ProfilesParams {
		private double xandr_id;
		private int internal_id;
		private int line_item_id;
		private String message;

		public void setXandr_id(double xandr_id) {
			this.xandr_id = xandr_id;
		}

		public double getXandr_id() {
			return this.xandr_id;
		}

		public void setInternal_id(int internal_id) {
			this.internal_id = internal_id;
		}

		public int getInternal_id() {
			return this.internal_id;
		}

		public void setLine_item_id(int line_item_id) {
			this.line_item_id = line_item_id;
		}

		public int getLine_item_id() {
			return this.line_item_id;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return this.message;
		}
	}

	public class CreativesParams {
		private double xandr_id;
		private int internal_id;
		private int ad_unit_id;
		private int line_item_id;
		private String message;

		public void setXandr_id(double xandr_id) {
			this.xandr_id = xandr_id;
		}

		public double getXandr_id() {
			return this.xandr_id;
		}

		public void setInternal_id(int internal_id) {
			this.internal_id = internal_id;
		}

		public int getInternal_id() {
			return this.internal_id;
		}

		public void setAd_unit_id(int ad_unit_id) {
			this.ad_unit_id = ad_unit_id;
		}

		public int getAd_unit_id() {
			return this.ad_unit_id;
		}

		public void setLine_item_id(int line_item_id) {
			this.line_item_id = line_item_id;
		}

		public int getLine_item_id() {
			return this.line_item_id;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return this.message;
		}
	}

	public class Line_itemsParams {
		private double xandr_id;
		private int internal_id;
		private String message;
		private String budget_interval;

		public void setXandr_id(double xandr_id) {
			this.xandr_id = xandr_id;
		}

		public double getXandr_id() {
			return this.xandr_id;
		}

		public void setInternal_id(int internal_id) {
			this.internal_id = internal_id;
		}

		public int getInternal_id() {
			return this.internal_id;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMessage() {
			return this.message;
		}

		public void setBudget_interval(String budget_interval) {
			this.budget_interval = budget_interval;
		}

		public String getBudget_interval() {
			return this.budget_interval;
		}
	}
}
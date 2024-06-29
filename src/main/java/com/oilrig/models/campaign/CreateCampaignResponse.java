package com.oilrig.models.campaign;

public class CreateCampaignResponse {
	private Data data;

	public void setData(Data data) {
		this.data = data;
	}

	public Data getData() {
		return this.data;
	}

	public class Data {
		private Campaign Campaign;

		public void setCampaign(Campaign Campaign) {
			this.Campaign = Campaign;
		}

		public Campaign getCampaign() {
			return this.Campaign;
		}
	}

	public class Campaign {

		private int id;
		private String name;
		private String budget_type;
		private int advertiser_id;
		private String viewability_standard_provider;
		private String start_date;
		private String end_date;
		private double lifetime_budget_revenue;
		private double lifetime_budget_imps;
		private String updatedAt;
		private String createdAt;
		private String state;
		private Object xandr_campaign_id;
		private boolean xandr_update_status;
		private Object xandr_budget_interval_id;
		private Object user_id;

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

		public void setBudget_type(String budget_type) {
			this.budget_type = budget_type;
		}

		public String getBudget_type() {
			return this.budget_type;
		}

		public void setAdvertiser_id(int advertiser_id) {
			this.advertiser_id = advertiser_id;
		}

		public int getAdvertiser_id() {
			return this.advertiser_id;
		}

		public void setViewability_standard_provider(String viewability_standard_provider) {
			this.viewability_standard_provider = viewability_standard_provider;
		}

		public String getViewability_standard_provider() {
			return this.viewability_standard_provider;
		}

		public void setStart_date(String start_date) {
			this.start_date = start_date;
		}

		public String getStart_date() {
			return this.start_date;
		}

		public void setEnd_date(String end_date) {
			this.end_date = end_date;
		}

		public String getEnd_date() {
			return this.end_date;
		}

		public void setLifetime_budget_revenue(double lifetime_budget_revenue) {
			this.lifetime_budget_revenue = lifetime_budget_revenue;
		}

		public double getLifetime_budget_revenue() {
			return this.lifetime_budget_revenue;
		}

		public void setLifetime_budget_imps(double lifetime_budget_imps) {
			this.lifetime_budget_imps = lifetime_budget_imps;
		}

		public double getLifetime_budget_imps() {
			return this.lifetime_budget_imps;
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

		public void setState(String state) {
			this.state = state;
		}

		public String getState() {
			return this.state;
		}

		public void setXandr_campaign_id(Object xandr_campaign_id) {
			this.xandr_campaign_id = xandr_campaign_id;
		}

		public Object getXandr_campaign_id() {
			return this.xandr_campaign_id;
		}

		public void setXandr_update_status(boolean xandr_update_status) {
			this.xandr_update_status = xandr_update_status;
		}

		public boolean getXandr_update_status() {
			return this.xandr_update_status;
		}

		public void setXandr_budget_interval_id(Object xandr_budget_interval_id) {
			this.xandr_budget_interval_id = xandr_budget_interval_id;
		}

		public Object getXandr_budget_interval_id() {
			return this.xandr_budget_interval_id;
		}

		public void setUser_id(Object user_id) {
			this.user_id = user_id;
		}

		public Object getUser_id() {
			return this.user_id;
		}
	}

}

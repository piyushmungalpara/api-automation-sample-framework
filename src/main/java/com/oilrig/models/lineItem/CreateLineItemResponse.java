package com.oilrig.models.lineItem;

public class CreateLineItemResponse {
	private DataParams data;

	public void setData(DataParams data) {
		this.data = data;
	}

	public DataParams getData() {
		return this.data;
	}

	public class DataParams {
		private LineItemParams LineItem;

		public void setLineItem(LineItemParams LineItem) {
			this.LineItem = LineItem;
		}

		public LineItemParams getLineItem() {
			return this.LineItem;
		}
	}

	public class LineItemParams {
		private int id;
		private String name;
		private String state;
		private double cpm;
		private int margin;
		private String ad_type;
		private int campaign_id;
		private String updatedAt;
		private String createdAt;
		private String start_date;
		private String end_date;
		private int xandr_line_item_id;
		private boolean xandr_update_status;
		private int lifetime_budget_revenue;
		private int lifetime_budget_imps;
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

		public void setState(String state) {
			this.state = state;
		}

		public String getState() {
			return this.state;
		}

		public void setCpm(double cpm) {
			this.cpm = cpm;
		}

		public double getCpm() {
			return this.cpm;
		}

		public void setMargin(int margin) {
			this.margin = margin;
		}

		public int getMargin() {
			return this.margin;
		}

		public void setAd_type(String ad_type) {
			this.ad_type = ad_type;
		}

		public String getAd_type() {
			return this.ad_type;
		}

		public void setCampaign_id(int campaign_id) {
			this.campaign_id = campaign_id;
		}

		public int getCampaign_id() {
			return this.campaign_id;
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

		public void setXandr_line_item_id(int xandr_line_item_id) {
			this.xandr_line_item_id = xandr_line_item_id;
		}

		public int getXandr_line_item_id() {
			return this.xandr_line_item_id;
		}

		public void setXandr_update_status(boolean xandr_update_status) {
			this.xandr_update_status = xandr_update_status;
		}

		public boolean getXandr_update_status() {
			return this.xandr_update_status;
		}

		public void setLifetime_budget_revenue(int lifetime_budget_revenue) {
			this.lifetime_budget_revenue = lifetime_budget_revenue;
		}

		public int getLifetime_budget_revenue() {
			return this.lifetime_budget_revenue;
		}

		public void setLifetime_budget_imps(int lifetime_budget_imps) {
			this.lifetime_budget_imps = lifetime_budget_imps;
		}

		public int getLifetime_budget_imps() {
			return this.lifetime_budget_imps;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getUser_id() {
			return this.user_id;
		}
	}

}
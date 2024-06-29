package com.oilrig.models.campaign;

public class CreateCampaignRequest {
	private String name;
	private String budget_type;
	private String advertiser_id;
	private String viewability_standard_provider;
	private String start_date;
	private String end_date;
	private String lifetime_budget_revenue;
	private String lifetime_budget_imps;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBudget_type() {
		return budget_type;
	}

	public void setBudget_type(String budget_type) {
		this.budget_type = budget_type;
	}

	public String getAdvertiser_id() {
		return advertiser_id;
	}

	public void setAdvertiser_id(String advertiser_id) {
		this.advertiser_id = advertiser_id;
	}

	public String getViewability_standard_provider() {
		return viewability_standard_provider;
	}

	public void setViewability_standard_provider(String viewability_standard_provider) {
		this.viewability_standard_provider = viewability_standard_provider;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getLifetime_budget_revenue() {
		return lifetime_budget_revenue;
	}

	public void setLifetime_budget_revenue(String lifetime_budget_revenue) {
		this.lifetime_budget_revenue = lifetime_budget_revenue;
	}

	public String getLifetime_budget_imps() {
		return lifetime_budget_imps;
	}

	public void setLifetime_budget_imps(String lifetime_budget_imps) {
		this.lifetime_budget_imps = lifetime_budget_imps;
	}

}
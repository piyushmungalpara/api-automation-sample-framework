package com.oilrig.models.adUnit;

public class CreateAdUnitRequest {
	private String name;
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
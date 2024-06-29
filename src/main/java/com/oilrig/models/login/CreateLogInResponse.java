package com.oilrig.models.login;

public class CreateLogInResponse {
	private String login_ticket;
	private String co_verifier;
	private String co_id;

	public String getLogin_ticket() {
		return login_ticket;
	}

	public void setLogin_ticket(String login_ticket) {
		this.login_ticket = login_ticket;
	}

	public String getCo_verifier() {
		return co_verifier;
	}

	public void setCo_verifier(String co_verifier) {
		this.co_verifier = co_verifier;
	}

	public String getCo_id() {
		return co_id;
	}

	public void setCo_id(String co_id) {
		this.co_id = co_id;
	}

}
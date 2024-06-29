package com.oilrig.models.token;

public class TokenRequest {

	private String client_id;
	private String username;
	private String password;
	private String realm;
	private String grant_type;
	private String scope;

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_id() {
		return this.client_id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getRealm() {
		return this.realm;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public String getGrant_type() {
		return this.grant_type;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getScope() {
		return this.scope;
	}
}

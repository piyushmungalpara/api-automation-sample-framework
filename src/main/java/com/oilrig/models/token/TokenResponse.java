package com.oilrig.models.token;

public class TokenResponse {

	private String access_token;
	private String id_token;
	private String scope;
	private int expires_in;
	private String token_type;

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getAccess_token() {
		return this.access_token;
	}

	public void setId_token(String id_token) {
		this.id_token = id_token;
	}

	public String getId_token() {
		return this.id_token;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getScope() {
		return this.scope;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public int getExpires_in() {
		return this.expires_in;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getToken_type() {
		return this.token_type;
	}
}

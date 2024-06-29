package com.oilrig.models.login;

public class CreateLogInRequest {
	private String client_id;
	private String username;
	private String password;
	private String realm;
	private String credential_type;

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getCredential_type() {
		return credential_type;
	}

	public void setCredential_type(String credential_type) {
		this.credential_type = credential_type;
	}

}
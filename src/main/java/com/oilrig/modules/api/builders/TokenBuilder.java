package com.oilrig.modules.api.builders;

import com.oilrig.factory.MapBuilderFromJsonFile;
import com.oilrig.models.token.TokenRequest;
import com.oilrig.utility.api.Constants;

public class TokenBuilder {

	public TokenRequest getTokenRequest() {
		return tokenRequest;
	}

	public void setTokenRequest(TokenRequest tokenRequest) {

		this.tokenRequest = tokenRequest;
	}

	public void setValidLoginCredintial() {
		TokenRequest request = MapBuilderFromJsonFile
				.buildFromTemplate(TokenRequest.class, Constants.TOKENREQUEST_TEMPLATE_DATA, false).get();
		request.setPassword(System.getenv("oilRigPassword"));
		request.setUsername(System.getenv("oilRigUserName"));
		this.setTokenRequest(request);
	}
	private TokenRequest tokenRequest;
}
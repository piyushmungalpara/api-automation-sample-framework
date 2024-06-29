package com.oilrig.modules.api.builders;

import com.oilrig.factory.MapBuilderFromJsonFile;
import com.oilrig.models.login.CreateLogInRequest;
import com.oilrig.utility.api.Constants;

public class AuthenticationBuilder {
	public CreateLogInRequest getLogInRequest() {
		return logInRequest__;
	}

	public void setLogInRequest(CreateLogInRequest logInRequest) {
		this.logInRequest__ = logInRequest;
	}

	public void setValidLoginCredintial() {
		CreateLogInRequest request = MapBuilderFromJsonFile
				.buildFromTemplate(CreateLogInRequest.class, Constants.LOGINREQUEST_TEMPLATE_DATA, false).get();
		this.setLogInRequest(request);
	}

	private CreateLogInRequest logInRequest__;
}

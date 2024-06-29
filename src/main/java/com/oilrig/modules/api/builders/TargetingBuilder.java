package com.oilrig.modules.api.builders;

import com.oilrig.factory.MapBuilderFromJsonFile;
import com.oilrig.models.Targeting.CreateTargetingRequest;
import com.oilrig.utility.api.Constants;

public class TargetingBuilder {

	public CreateTargetingRequest getTargetingRequest() {
		return targetingRequest;
	}

	public void setTargetingRequest(CreateTargetingRequest targetingRequest) {
		this.targetingRequest = targetingRequest;
	}

	public void setTargeting() {
		CreateTargetingRequest request = MapBuilderFromJsonFile
				.buildFromTemplate(CreateTargetingRequest.class, Constants.TARGETINGREQUEST_TEMPLATE_DATA, false).get();
		this.setTargetingRequest(request);
	}

	private CreateTargetingRequest targetingRequest;
}
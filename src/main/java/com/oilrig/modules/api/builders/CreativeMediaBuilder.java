package com.oilrig.modules.api.builders;

import com.oilrig.factory.MapBuilderFromJsonFile;
import com.oilrig.models.creativeMedia.CreateCreativeMediaRequest;
import com.oilrig.utility.api.Constants;

public class CreativeMediaBuilder {

	public CreateCreativeMediaRequest getCreativeMediaRequest() {
		return creativeMediaRequest;
	}

	public void setCreativeMediaRequest(CreateCreativeMediaRequest creativeMediaRequest) {
		this.creativeMediaRequest = creativeMediaRequest;
	}

	public void setCreativeMedia(String ad_Tag_Type) {
		String jsonFilePath = ad_Tag_Type.equals("CREATIVEMEDIA_EMX") ? Constants.CREATIVEMEDIAEMXREQUEST_TEMPLATE_DATA
				: Constants.CREATIVEMEDIATHIRDPARTYREQUEST_TEMPLATE_DATA;

		CreateCreativeMediaRequest request = MapBuilderFromJsonFile
				.buildFromTemplate(CreateCreativeMediaRequest.class, jsonFilePath, false).get();
		this.setCreativeMediaRequest(request);
	}

	private CreateCreativeMediaRequest creativeMediaRequest;
}
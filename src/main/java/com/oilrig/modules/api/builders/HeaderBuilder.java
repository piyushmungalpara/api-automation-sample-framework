package com.oilrig.modules.api.builders;

import com.oilrig.factory.DependencyManager;
import com.oilrig.utility.api.Constants;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class HeaderBuilder {

	public static Headers getHeaders() {
		Header contentType = new Header("content-type",Constants.GETCONTENT_TYPE);
		Header origin = new Header("origin", Constants.GETORIGIN);
		Headers headers = new Headers(contentType, origin);
		return headers;
	}
	
	public static Headers getHeadersWithToken() {
		Header contentType = new Header("content-type",Constants.GETCONTENT_TYPE);
		Header origin = new Header("origin", Constants.GETORIGIN);
		Header token =  new Header("authorization", "Bearer " + DependencyManager.getInjector().getInstance(ResponseBuilder.class).getTokenResponse().getId_token());
		Headers headers = new Headers(contentType, origin, token);
		return headers;
	}
}
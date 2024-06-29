package com.oilrig.utility.api;

public class ParamUtils {
	public static String[] splitValues(String paramValue) {
		String[] splitValues = paramValue.split(":");
		return splitValues;
	}
}

/*
 This helps to run oil-rig-api project
 <p>
 Copyright (C) 2017 Clearstream.TV, Inc. All Rights Reserved.
 Proprietary and confidential.
 */

package com.oilrig.features.steps.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/api/ValidateCreateCampaign.feature", glue = {
		"com.oilrig.features.steps.api.steps", "com.oilrig.hooks" }, format = {
				"json:target/cucumber-report/cucumber.json" }, plugin = { "json:target/cucumber-report/cucumber.json" })
public class TestRunner {
}
package com.testrunner;

import org.junit.*;
import org.junit.runner.RunWith;

import com.stepdef.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Feature\\One.feature" }, glue = {
		"com.stepdef" }, monochrome = true, plugin = { "html:D:\\NewSelenium42\\Star360\\Reports",
				"json:D:\\NewSelenium42\\Star360\\Reports\\search.json" }

)

public class TestRunner {
@AfterClass
	public static void jvm() {
		JVMReport.report("D:\\NewSelenium42\\Star360\\Reports\\search.json");
	}

}

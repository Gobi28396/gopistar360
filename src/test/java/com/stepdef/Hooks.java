package com.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.bases.SearchBase;

import cucumber.api.java.*;

public class Hooks extends SearchBase {
	@Before
	public void before() {
		browserLaunch();

	}}



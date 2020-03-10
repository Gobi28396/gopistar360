package com.stepdef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pom.SearchPojo;

import cucumber.api.java.en.*;

public class Search extends SearchPojo {
	SearchPojo p=new SearchPojo();
	@Given("User in home page")
	public void user_in_home_page() {
		url();

	}

	@When("User enters the products name {string}")
	public void user_enters_the_products_name(String s) {
		SearchPojo p=new SearchPojo();
		fill(p.getSearch(), s);
	}

	@Then("click enter button")
	public void click_enter_button() throws IOException {
		click(p.getSearchbtn());
		//driver.quit();
		TakesScreenshot scrShot =((TakesScreenshot)driver);


        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);


        File DestFile=new File("D:\\NewSelenium42\\Star360\\Reports\\JvmReport\\screens\\img.png");


        FileUtils.copyFile(SrcFile, DestFile);

}

	}


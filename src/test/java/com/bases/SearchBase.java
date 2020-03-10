package com.bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBase {
	public static WebDriver driver;

	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\NewSelenium42\\Star360\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void url() {
		driver.get("https://starthreesixty.com/");
	}

	public void fill(WebElement e, String s) {
		e.sendKeys(s);

	}

	public void click(WebElement e) {
		e.click();

	}



}

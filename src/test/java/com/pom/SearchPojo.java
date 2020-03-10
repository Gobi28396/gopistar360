package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import com.bases.SearchBase;

public class SearchPojo extends SearchBase {
	public SearchPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "search")
	private WebElement search;
	@FindBy(xpath = "//label[@data-role='minisearch-label']")
	private WebElement searchbtn;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

}

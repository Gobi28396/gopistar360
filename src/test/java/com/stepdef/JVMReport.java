package com.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.WebDriverWait;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void report(String s) {
		File f = new File("D:\\NewSelenium42\\Star360\\Reports\\JvmReport");
		Configuration c = new Configuration(f, "Search");
		c.addClassifications("browser version", "80");
		c.addClassifications("browser name", "chrome");
		c.addClassifications("os", "windows");
		c.addClassifications("os version", "10");
		c.addClassifications(" sprint", "47");
		c.addClassifications("functionality", "search");
		List<String> l=new ArrayList();
		l.add(s);
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
		
	}

}

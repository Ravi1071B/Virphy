package com.virphy.TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.SelHomePage;
import com.virphy.util.Autoutils;

public class ResponseCode extends BrowserHooks{
	@Test(dataProvider="oneBrowsers")
	  
	public void responseCodeRavi(String browser,String version,String os, Method method) throws FileNotFoundException, IOException {
			  

	this.createDriver(browser, version, os, method.getName());
			  
	WebDriver driver = this.getWebDriver(); 
			  
	          
	SelHomePage objHome= new SelHomePage(driver);
	          
	Autoutils  objUtil = new Autoutils (driver);
			  
			  
	// Open the URL of Selenium
			  
	driver.get("http://www.seleniumhq.org");
			  
			  
	//Collect all the links from the above page and validate response code..
			 
	objUtil.getAllLinks(); 
	objUtil.getResponseCode("allLinks.get(i).getAttribute(\"href\")");
	}
}

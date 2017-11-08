package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dummy {
	
	public class SeleniumTest extends BrowserHooks {
		  @Test (dataProvider="hardCodedBrowsers")
		  public void openSeleniumRAVI(String browser,String version,String os, Method method) throws IOException, MalformedURLException {
			  this.createDriver(browser, version, os, method.getName());
				 
			  WebDriver driver = this.getWebDriver(); 

         }
	 }

}

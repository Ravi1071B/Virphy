package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.PopUPsHome;

public class HiddenPopUp extends BrowserHooks {
	 @Test (dataProvider="oneBrowsers")
	  public void hiddenpop(String browser,String version,String os, Method method) throws IOException, MalformedURLException {
		  this.createDriver(browser, version, os, method.getName());
			 
		  WebDriver driver = this.getWebDriver(); 
		  
		  PopUPsHome pop = new PopUPsHome(driver);
		  
		  driver.get("https://www.yatra.com/flights");
		  
		  pop.Departure();
		  pop.Datepick();
}
	 }

package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.SelHomePage;
import com.virphy.util.AutoConstant;
import com.virphy.util.PropFileHandler;
import com.virphy.util.Utility;

public class DropNDownList extends BrowserHooks {
	 @Test (dataProvider="oneBrowsers")
	  public void screenshortofdropNdown(String browser,String version,String os, Method method) throws IOException, MalformedURLException, InterruptedException {
		  this.createDriver(browser, version, os, method.getName());
			 
		  WebDriver driver = this.getWebDriver(); 
		  
		  SelHomePage drop = new SelHomePage(driver);
		            //hardcode Script for Opening Browser
		  //driver.get("http://demos.telerik.com/kendo-ui/dropdownlist/index");
		  
		  // softcode Script for opening Browser
		  driver.get(PropFileHandler.fetchKey(AutoConstant.URL.DDLT));
		  Thread.sleep(3000);
		  Utility.Screenshorttaken(driver, "OPNUrlOFCAP");
		  Thread.sleep(3000);
		 drop.SelectDropDownlist();
		 Thread.sleep(3000);
		 Utility.Screenshorttaken(driver, "ClickonDropDownOfCAP");
		 Thread.sleep(3000);
		 drop.ClickonOrange();
		 Thread.sleep(3000);
		 Utility.Screenshorttaken(driver, "OrangeCAP");
		
		} 
}

package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.SelHomePage;

public class DragNDropList extends BrowserHooks {
	  @Test (dataProvider="oneBrowsers")
	  public void dragNdropRAVI(String browser,String version,String os, Method method) throws IOException, MalformedURLException, InterruptedException {
		  this.createDriver(browser, version, os, method.getName());
			 
		  WebDriver driver = this.getWebDriver(); 
		  
		  SelHomePage drag = new SelHomePage(driver);
		  
		  driver.get("http://www.americangolf.co.uk/golf-clubs/drivers?pmin=15&pmax=400");
		  
		  drag.DragNdrop();
		  
		  
}
}

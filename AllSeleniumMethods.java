package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.SelHomePage;

public class AllSeleniumMethods extends BrowserHooks{
	// @Test (dataProvider="hardCodedBrowsers")
		@Test(dataProvider="oneBrowsers")
public void AllSeleniumMethodsRAVI(String browser,String version,String os, Method method) throws IOException, MalformedURLException {
			  this.createDriver(browser, version, os, method.getName());
				 
			  WebDriver driver = this.getWebDriver(); 
			//Page object for selenium homepage
			  
			  SelHomePage objSel = new SelHomePage(driver);
			  		
			  		
			  //Open the Selenium URL using get methods
			  		 
			   driver.get("http://www.seleniumhq.org");
			  		  
			  		
			  // Get the title of the page
			  		  
			  objSel.getPageTitle();
			  		  
			  		
			  // Get the Current URL of the Page
			  		  
			  objSel.getCurrentPageURL();
			  		  
			  		
			  // Type text in Search selenium and click GO
			  		  
			  objSel.searchselenium("bahubali");
			  		  
			  		
			  // use Navigate option to come backward to selenium home page
			  		 
			   driver.navigate().back();
			  		  
			  		
			  // Get the Pagesource of Selenium
			  		 
			  // System.out.println( driver.getPageSource());
		
  }
}


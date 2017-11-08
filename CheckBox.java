package com.virphy.TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.SelHomePage;
import com.virphy.util.AutoConstant;
import com.virphy.util.PropFileHandler;

public class CheckBox extends BrowserHooks{
	@Test(dataProvider="oneBrowsers")
	  
	public void checkBoxRavi(String browser,String version,String os, Method method) throws FileNotFoundException, IOException {
			  

	this.createDriver(browser, version, os, method.getName());
			  
	WebDriver driver = this.getWebDriver();
			 
	 SelHomePage objHome= new SelHomePage(driver);
			  
			 
	 //Open Echoecho URL here..
			 
	 driver.get(PropFileHandler.fetchKey(AutoConstant.URL.CURL));
			 
			  
	//Select Milk as the radio button here.
			  
	objHome.selectchkBox();
		
  }
}

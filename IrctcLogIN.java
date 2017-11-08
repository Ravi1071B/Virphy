package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.PromptHandler;
import com.virphy.pages.IrctcHome;
import com.virphy.util.AutoConstant;
import com.virphy.util.PropFileHandler;

public class IrctcLogIN extends BrowserHooks {
	 @Test (dataProvider="oneBrowsers")
	  public void irctcLogIn(String browser,String version,String os, Method method) throws IOException, MalformedURLException {
		  this.createDriver(browser, version, os, method.getName());
			 
		  WebDriver driver = this.getWebDriver(); 
		  
		  IrctcHome irc = new IrctcHome(driver);
		  //driver.get(PropFileHandler.fetchKey(AutoConstant.URL.IRCTC));
		 driver.get(PropFileHandler.fetchKey(AutoConstant.URL.IRCTC));
		 irc.Username("C.ravi1071@gmail.com");
		  
		  
		  
		 
		  
		 
		  
}
}


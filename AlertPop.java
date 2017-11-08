package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.PopUPsHome;

public class AlertPop extends BrowserHooks {
	  @Test (dataProvider="oneBrowsers")
	  public void alertpop(String browser,String version,String os, Method method) throws IOException, MalformedURLException {
		  this.createDriver(browser, version, os, method.getName());
			 
		  WebDriver driver = this.getWebDriver(); 
		  
		  PopUPsHome alt = new PopUPsHome(driver);
		  driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  alt.Signin();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Alert alerts = driver.switchTo().alert();
		    alerts.accept();
		    alt.Username("C.ravi1071@gmail.com");
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  //alerts.dismiss();
		  
		 //String actual= driver.switchTo().alert().getText();
		// System.out.println("Alert message should be displayed: " +actual);
		// driver.switchTo().alert().accept();
		    
		    
		  
		  
		
		  
		  	

}
}

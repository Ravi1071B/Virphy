package com.virphy.TestNG;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.FacebookPage;
import com.virphy.util.Utility;

public class FaceBookLogIN extends BrowserHooks {
	@Test (dataProvider="oneBrowsers")
	  public void faceBookRavi(String browser,String version,String os, Method method) throws IOException, MalformedURLException, InterruptedException {
		  this.createDriver(browser, version, os, method.getName());
			 
		  WebDriver driver = this.getWebDriver(); 
		  
		  FacebookPage face = new FacebookPage(driver);
		  driver.get("https://www.facebook.com/");
		 Utility.Screenshorttaken(driver, "BWStarted");
		  Thread.sleep(5000);
		 //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  face.Email("c.ravi1071@gmail.com");
		  Utility.Screenshorttaken(driver, "AFUsername");
		  //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		  Thread.sleep(5000);
		  face.Passed("test@123");
		  Utility.Screenshorttaken(driver, "AFPassWord");
		  Thread.sleep(3000);
		  face.clickLogin();
		  Utility.Screenshorttaken(driver, "lastEND");
	}
}

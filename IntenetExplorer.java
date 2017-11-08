package com.virphy.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test; 

public class IntenetExplorer {
  @Test
  public void login() throws InterruptedException 
  {
	System.setProperty("webdriver.ie.driver","E:\\RaviEclipseWorkspace\\Virphy\\Libs\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.seleniumhq.org");
	driver.close();
  }
}
 
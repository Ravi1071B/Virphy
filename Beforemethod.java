package com.virphy.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Beforemethod {
	@BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("Log in to the application");
	  }
  @Test
  public void login() {
	  System.out.println("LogIN");
	  Assert.assertEquals("doaction", "logout");
	 
	}
  @Test(dependsOnMethods= "login")
  public void doaction() {
  System.out.println("ActionDone");
 
  }
  @Test
  public void logout() {
	  System.out.println("LogOUT");
	 
	  }
 @AfterMethod
  public void afterMethod() {
	  System.out.println("log out to the aplication");
  }

}

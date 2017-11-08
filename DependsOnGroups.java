package com.virphy.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DependsOnGroups {
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Log in to the application");
  }
  @Test(groups="one")
  public void login() {
	  System.out.println("LogIN");
	  Assert.assertEquals("doaction", "logout");
	 
	}
  @Test(dependsOnGroups="one")
  public void doaction() {
  System.out.println("ActionDone");
 
  }
  @Test(groups="two")
  public void logout() {
	  System.out.println("LogOUT");
	 
	  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Log out to the application");
  }

}

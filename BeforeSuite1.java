package com.virphy.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeSuite1 {
 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("logIn to before suite");
  }
  @Test
  public void login1() {
	  System.out.println("log in to Gmail");
  }
  @Test
  public void login2() {
	  System.out.println("log in to Yahoo");
  }
  @Test
  public void login3() {
	  System.out.println("log in to youtube");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("logout to After suite");
  }

}

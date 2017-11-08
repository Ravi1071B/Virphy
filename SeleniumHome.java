package com.virphy.TestNG;

import org.testng.annotations.Test;

import com.virphy.util.BaseClass;

public class SeleniumHome extends BaseClass {
  @Test
  public void selenium() throws InterruptedException
  {
	  System.out.println("Gmail log in is successful");
	  driver.get("http://www.seleniumhq.org");
 
    }
 }

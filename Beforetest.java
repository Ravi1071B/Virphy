package com.virphy.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Beforetest {
	@BeforeTest
	  public void beforeTest1() {
		  System.out.println(" 1st Test case is excuting");
	  }

@Test
  public void dog() {
	System.out.println("dog is bow-bow");
	Assert.assertEquals(2<1, 2>1);
	
  }
@Test(dependsOnMethods="dog")
public void cat() {
	System.out.println("cat is miya-miya");
	
}
@Test (dependsOnMethods="cat")
public void rat() {
	
	System.out.println("rat is huuuuu");

}
@Test 
public void cow() {
	
	System.out.println("cow is Amba amba");

}
@AfterTest
  public void afterTest() {
	  System.out.println("2nd Test case is excuting");
  }

}

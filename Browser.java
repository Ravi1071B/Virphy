package com.virphy.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.virphy.util.BaseClass;

public class Browser extends BaseClass{
  @Test
  public void Ravi() {
	  System.out.println("Program should be excuted");
  }
  @Test
  public void Sandeep() {
	  System.out.println("Program should not be excuted");
	  Assert.fail();
  }
  @Test
  public void Giddu() {
	  System.out.println("Program has to be excuted");
  }
  @Test
  public void Mani() {
	  System.out.println("mani is a Trainer");
  }
}

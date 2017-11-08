package com.virphy.TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.virphy.pages.SelHomePage;

public class RadioBtn extends BrowserHooks {
	@Test(dataProvider = "oneBrowsers")

	public void radioButtonRavi(String browser, String version, String os, Method method)
			throws FileNotFoundException, IOException {

		this.createDriver(browser, version, os, method.getName());

		WebDriver driver = this.getWebDriver();

		SelHomePage objSel1 = new SelHomePage(driver);
		// driver.get(PropFileHandler .fetchKey(AutoConstant.URL.RURL));
		//objHome.clickRadioBtn();

		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		objSel1.clickRadioBtn("//input[@value='Milk']");
		//Open Echoecho URL here..
		 
		 
				 
				  
		//Select Milk as the radio button here.
				  
		


	}
}

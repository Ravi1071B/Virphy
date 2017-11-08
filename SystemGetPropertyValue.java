package com.virphy.TestNG;

public class SystemGetPropertyValue {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Libs\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Libs\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver","E:\\RaviEclipseWorkspace\\Virphy\\Libs\\IEDriverServer.exe");

	}

}

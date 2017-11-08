package com.virphy.TestNG;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.virphy.util.Autoutils;
import com.virphy.util.PropFileHandler;

public class EncryptNDecrypt {
	
	public static WebDriver driver;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Autoutils auto = new Autoutils(driver);
		System.out.println("Password Encryption: ");
		auto.pwdEncrypt("Test@123");
		System.out.println("Password Decryption: ");
		auto.pwdDecrypt(PropFileHandler.fetchKey("pwd"));

	}

}

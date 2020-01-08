package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * Testing selenium with Singleton driver.
 */

public class GooglePageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		SingletonWebDriver inst = SingletonWebDriver.getInstance();
		driver = inst.OpenBrowser();
	}
	
	@Test
	public void test1() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

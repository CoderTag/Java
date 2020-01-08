package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * There are following annotation with TestNG. And they execute in sequence mentioned below
 * @BeforeSuite -> @BeforeTest -> @BeforeClass -> @BeforeMethod These are pretest sequence
 *  @AfterMethod -> @AfterClass -> @AfterClass -> @AfterSuite  These are post test sequence
 */

public class TestNGBasic {

	@BeforeSuite
	public void setUp() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Before Method");
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("1st Test : Google Title Test");
	}
	
	@Test
	public void googleTitleTest2() {
		System.out.println("2nd Test : Google Title Test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class");
	}
	@AfterSuite
	public void generateReport() {
		System.out.println("After Suite");
	}
}

package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



/*
 * Grouping of test cases can be done using TestNG. Use groups with @Test annotation
 * TestNG will execute test cases in any sequence. To specify a perticular sequence use
 * priority=<number> . Test cases will be executed in that fashion.
 * Validate test case with assertion.
 * If Priority is given then it will not run from testng.xml. when running all classes together.
 * But it will run from testng.xml when only one class specified
 */

public class TestNGGoogle {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url"})
	public void setUp(String url) {
		System.setProperty("webdriver.chrome.driver","/home/kaushik/eclipse-workspace/SelProj/src/com/test/driver/chromedriver");
		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	//@Test(priority=1,groups="Title")
	@Test(groups="Title")
	@Parameters({"userid"})
	public void googleTitleTest(String userid) {
		String Title = driver.getTitle();
		System.out.println(Title + ":" + userid);
		
		Assert.assertEquals(Title, "Google", "Title is not match");
		
	}
	
	//@Test(priority=2,groups="Logo")
	@Test(groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);  // We expect b to be true if logo found
	}
	
	//@Test(priority=3,groups="MailLink")
	@Test(groups="MailLink")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(groups="Test")
	public void oneTest() {		
		System.out.println("TEST ONE");
	}
	
	@Test(groups="Test")
	public void twoTest() {		
		System.out.println("TEST TWO");
	}
	
	@Test(groups="Test")
	public void threeTest() {		
		System.out.println("TEST THREE");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

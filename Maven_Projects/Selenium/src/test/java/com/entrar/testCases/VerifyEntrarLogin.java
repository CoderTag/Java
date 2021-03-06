/**
 * 
 */
package com.entrar.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.entrar.Pages.LoginPage;

/**
 * @author kaushik
 *
 */

public class VerifyEntrarLogin {
	public static WebDriver driver;
	
	@Parameters("url")
	@BeforeMethod
	public void setup(String url) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver");
		
		//Set Chrome Headless mode as TRUE
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
		//Instantiate Web Driver
//		WebDriver driver = new ChromeDriver(options);
				
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void cleanup() {
		driver.close();
	}
	
	@Parameters({"Username","Password"})
	@Test
	public void loginTest(String userid, String password) {
		LoginPage schoolLogin = new LoginPage(driver);
		schoolLogin.login(userid,password);
		String expectedTitle = "School Management Web Application";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}
}

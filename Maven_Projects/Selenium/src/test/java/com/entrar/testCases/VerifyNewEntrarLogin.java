/**
 * 
 */
package com.entrar.testCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.entrar.Pages.NewLoginPage;

/**
 * @author kaushik
 *
 */
public class VerifyNewEntrarLogin extends BaseClass{
	
	private static final Logger logger = Logger.getLogger(VerifyNewEntrarLogin.class);
	
	@Parameters({"Username","Password"})
	@Test
	public void newLoginTest(String userid, String password) {
		test = extent.createTest("LoginToSchoolDashboard");
		
		//Using Page object using page factory
		NewLoginPage login_page = new NewLoginPage(driver);
		
//		NewLoginPage login_page = PageFactory.initElements(driver, NewLoginPage.class);
		logger.info("Created Login Page object");
		
		login_page.login(userid, password);
		logger.info("Logged into the dashboard");
		
		String expectedTitle = "School Management Web Application";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
		logger.info("Title Matched");
		
		
		//Following line just for testing
		test.createNode("Add with valid input");
		Assert.assertTrue(true);
		test.createNode("Add with invalid input");
		Assert.assertTrue(true);
	}
}

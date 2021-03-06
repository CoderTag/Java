/**
 * 
 */
package com.entrar.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author kaushik
 *
 */
public class NewLoginPage {
	
	WebDriver driver;
	
	public NewLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.CLASS_NAME,using="login100-form-btn")
	@CacheLookup
	WebElement loginButton;
	
	public void login(String userid, String mypassword) {
		username.sendKeys(userid);
		password.sendKeys(mypassword);
		WebDriverWait wait = new WebDriverWait(driver,20);		
		WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		elemnt.click();
	}
}

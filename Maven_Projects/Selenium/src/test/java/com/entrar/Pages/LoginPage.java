/**
 * 
 */
package com.entrar.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Kaushik
 *
 */
public class LoginPage {
	WebDriver driver; 
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.className("login100-form-btn");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String userid, String mypassword) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(mypassword);
		WebDriverWait wait = new WebDriverWait(driver,20);		
		WebElement elemnt = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		elemnt.click();
//		driver.findElement(loginButton).click();
	}
}

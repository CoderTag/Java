package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebDriver {
	private WebDriver driver;
	private static SingletonWebDriver instance_ref=null; 
	
	private SingletonWebDriver() {
		
	}
	
	public static SingletonWebDriver getInstance() {
		if(instance_ref == null)
			instance_ref = new SingletonWebDriver();
		return instance_ref;
	}
	
	public WebDriver OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/kaushik/eclipse-workspace/SelProj/src/com/test/driver/chromedriver");
		driver = new ChromeDriver();
		return driver;		
	}
	
}

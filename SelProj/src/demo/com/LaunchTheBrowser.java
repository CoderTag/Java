package demo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchTheBrowser {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.gecko.driver", "/home/kaushik/eclipse-workspace/SelProj/lib/geckodriver/geckodriver");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("login")).click();
	    String actualTitle = driver.getTitle();
	    System.out.println("Title: " + actualTitle);
		driver.close();
		
	}
}

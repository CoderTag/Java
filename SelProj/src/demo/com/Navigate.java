package demo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/kaushik/eclipse-workspace/SelProj/lib/geckodriver/geckodriver");
		WebDriver driver;		
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	    driver.close();

	}

}

package demo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/kaushik/eclipse-workspace/SelProj/lib/geckodriver/geckodriver");
		WebDriver driver;
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(true);
		
		driver = new FirefoxDriver(option);
		driver.get("http://www.google.com");
	    String actualTitle = driver.getTitle();
	    String url = driver.getCurrentUrl();
	    System.out.println("Title: " + actualTitle);
	    System.out.println("URL: " + url);
	    driver.close();

	}

}

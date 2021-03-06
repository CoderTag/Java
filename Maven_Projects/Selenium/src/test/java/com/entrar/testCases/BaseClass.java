/**
 * 
 */
package com.entrar.testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.entrar.utilities.BrowserFactory;

/**
 * @author kaushik
 *
 */
public class BaseClass {
	public static WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	private static final Logger logger = Logger.getLogger(BaseClass.class);
	
	@BeforeTest
	public void setupTest() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport"+ getCurrentTime() +".html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Hostname", "Localhost");
		extent.setSystemInfo("OS", "Ubuntu");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Tester Name", "Kas");
	}
	
	@AfterTest
	public void clearTest() {
		extent.flush();
	}
	
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void setup(String url,String browser) {			
//		logger = Logger.getLogger(getClass()); 
		PropertyConfigurator.configure("log4j.properties");
		
		driver = BrowserFactory.startBrowser(browser, url);
		logger.info("Browser Opened");
	}
	
	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException {
//		String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//after execution, you could see folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + getCurrentTime() + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source,finalDestination);
		return destination;
	}
	
	public static String getCurrentTime() {
		String dateName = new SimpleDateFormat("_yyyy_MM_dd_hh_mm_ss").format(new Date());
		return dateName;
	}
	
	@AfterMethod
	public void cleanup(ITestResult result) throws IOException {		
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED IS : " + result.getName()); // Add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED DUE TO :  " + result.getThrowable()); // Add error/exception in extent report
			
			String screenshotPath = BaseClass.getScreenshot(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotPath);			
		} 
		else if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "TEST CASE SKIPPED IS " + result.getName());
		} 
		else if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "TEST CASE PASSED IS " + result.getName());
		}
		driver.close();
	}	
}

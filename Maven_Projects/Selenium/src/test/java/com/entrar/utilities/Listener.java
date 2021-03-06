package com.entrar.utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * @author kaushik
 *
 */
public class Listener extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("***************************************************************");
		System.out.println(result.getStartMillis() + " - Test Started: " + result.getName());
		System.out.println("****************************************************************");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("\n)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
		System.out.println(result.getStartMillis() + " - Test Succeeded: " + result.getName());
		System.out.println(")))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println(result.getStartMillis() + " - Test Failed: " + result.getName());
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getStartMillis() + " - Test Skipped: " + result.getName());
	}
	
	

}

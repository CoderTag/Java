package com.test;

import org.testng.annotations.Test;

/*
 * Exception time out is required to specify time should be taken by a specific testcase
 * If it exceed the time test case will be stopped.Here time is in millisecond
 */

public class TestNGExceptionTimeOut {
	@Test(invocationTimeOut=1)
	public void myTest() {		
		while(true) {
			System.out.println("TEST");
		}
	}
}

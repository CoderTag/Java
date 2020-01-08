package com.test;

import org.testng.annotations.Test;

/*
 * with invocation count we can define how many time the same test cases to be run.
 */
public class TestNGInvocationCount {
	
	@Test(invocationCount=5)
	public void myTest() {		
		System.out.println("TEST");
	}
}

package com.test;

import org.testng.annotations.Test;

/*
 * Here test two and three depends on oneTest method. If oneTest method fail following two testcases will be skipped.
 */

public class TestNGDependsOnMethod {

	@Test()
	public void oneTest() {		
		System.out.println("TEST ONE");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="oneTest")
	public void twoTest() {		
		System.out.println("TEST TWO");
	}
	
	@Test(dependsOnMethods="oneTest")
	public void threeTest() {		
		System.out.println("TEST THREE");
	}
}

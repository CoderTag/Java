package com.test;

import org.testng.annotations.Test;

/*
 * WIth expectedException keyword we are telling to TestNG that we expect an exception.
 * So don't fail the testcase. In following example we will get exception NumberFormatException as we are trying
 * to convert string to integer.And "100A" and A can not be converted.
 */

public class TestNGExpectedException {
	@Test(expectedExceptions=NumberFormatException.class)
	public void myTest() {		
		String s = "100A";
		Integer.parseInt(s);
	}
}

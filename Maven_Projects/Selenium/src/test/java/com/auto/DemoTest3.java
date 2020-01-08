	package com.auto;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest3 {

	@BeforeMethod
	public void setup() {
		System.out.println("Run B4 Test");
	}
	
	@Test
	public void sum() {
		System.out.println("Sum Test");
		int a=10,b=20;
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void prod() {
		System.out.println("Product Test");
		int a=10,b=20;
		Assert.assertEquals(a*b, 200);
	}
	
	@AfterMethod
	public void cleanup() {
		System.out.println("Run after Test");
	}
	
}

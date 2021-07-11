package Org.Testing.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {
	@Test(priority = 2)
	public void testcase1() {
		System.out.println("This is my first TestNG Program");
	}

	@Test(priority = 1)
	public void testcase2() {
		System.out.println("This is my second Method");
	}

	@BeforeTest
	public void ExecuteBeforeTest() {
		System.out.println("This is executed before Test");
	}

	@AfterTest
	public void ExecuteAfterTest() {
		System.out.println("This is executed after Test");
	}
	
	
	@BeforeMethod
	public void ExecuteBeforeMethod() {
		System.out.println("This is executed before Method");
	}

	@AfterMethod
	public void ExecuteAfterMethod() {
		System.out.println("This is executed after Method");
	}
	
	
	

}

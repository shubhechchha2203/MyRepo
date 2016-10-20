package com.project.selenium1;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTesting2 {
	
	@BeforeSuite
	public void bfrSuiteexe1()
	{
		System.out.println("This will execute before suite2");
	}
	
	
	@BeforeTest
	public void bfrTexe1()
	{
		System.out.println("This will execute before test2");
	}
	
	@BeforeClass
	public void bfrCexe1()
	{
		System.out.println("This will execute before class2");
	}
	
	@BeforeMethod
	public void bfrMexe1()
	{
		System.out.println("This will execute before_method2");
	}
	
	@Test
	public void test_exe1()
	{
		System.out.println("This will execute first method2");
	}
	
	
	@Test
	public void test1_exe1()
	{
		System.out.println("This will execute second method2");
	}
	
	@AfterMethod
	public void aftMexe1()
	{
		System.out.println("This will execute after_method2");
	}
	
	@AfterClass
	public void aftCexe1()
	{
		System.out.println("This will execute after class2");
	}
	
	@AfterSuite
	public void aftSexe1()
	{
		System.out.println("This will after  suite2");
	}
	
	@AfterTest
	public void aftTexe1()
	{
		System.out.println("This will execute after test2");
	}

	
	
	
	
	
	
	
	
	
}
	
	


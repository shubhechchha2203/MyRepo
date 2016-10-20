package com.project.selenium;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTesting1 {
	
	@BeforeSuite
	public void bfrSuiteexe()
	{
		System.out.println("This will execute before suite");
	}
	
	
	@BeforeTest
	public void bfrTexe()
	{
		System.out.println("This will execute before_test");
	}
	
	@BeforeClass
	public void bfrCexe()
	{
		System.out.println("This will execute before class");
	}
	
	@BeforeMethod
	public void bfrMexe()
	{
		System.out.println("This will execute before_method");
	}
	
	@Test
	public void test_exe()
	{
		System.out.println("This will execute first method");
	}
	
	
	@Test
	public void test1_exe()
	{
		System.out.println("This will execute second method");
	}
	
	@AfterMethod
	public void aftMexe()
	{
		System.out.println("This will execute after method");
	}
	
	@AfterClass
	public void aftCexe()
	{
		System.out.println("This will execute after class");
	}
	
	@AfterSuite
	public void aftSexe()
	{
		System.out.println("This will after suite");
	}
	
	@AfterTest
	public void aftTexe()
	{
		System.out.println("This will execute after_test");
	}
		
}
	
	


package com.project.selenium;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SeleniumIRCTCTest {
			
	
	
	@Test
	 public void testIRCTC_firefox() throws InterruptedException
	 {
	 WebDriver driver = new FirefoxDriver(); //creating object for firefox
	 driver.manage().window().maximize();  //command to maximize the window
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	 driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
	 String pw=driver.getWindowHandle();//command to switch window
		Set<String> allwin=driver.getWindowHandles();
		for(String s:allwin)
		{
			if(s.equals(pw)== false)
			{
				driver.switchTo().window(s);
				break;
			}
				
		}
		
		String s1=driver.getCurrentUrl();
		Assert.assertTrue(s1.contains("air"));
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='tripType' and @value='One way']")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Round trip' and @name='tripType']")).isSelected());
		
		WebElement sourceField=driver.findElement(By.xpath("//input[@id='origin']"));
		sourceField.sendKeys("delhi");
		driver.findElement(By.xpath("//a[contains(text(),'Delhi')]")).click();
		WebElement DestField=driver.findElement(By.xpath("//input[@id='destination']"));
		DestField.sendKeys("mumbai");
		driver.findElement(By.xpath("//a[contains(text(),'Bombay')]")).click();
		driver.findElement(By.xpath("//input[@id='departDate']/following-sibling::img")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[contains(text(),'20')]")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='noOfAdult']")));//command to select value from dropdown list
		select.selectByIndex(1);
		Select select1=new Select(driver.findElement(By.xpath("//select[@id='noOfChild']")));
		select1.selectByIndex(1);
		driver.findElement(By.xpath("//div[@onclick='submitSearch();']")).click();
		List<WebElement> alllist= driver.findElements(By.xpath("//div[@class='onewayflightinfo']"));//command to create a list of flights
		
		Assert.assertTrue(alllist.size()>0 & alllist.size()<100);
		System.out.println(alllist.size());
		
		driver.close();
		driver.switchTo().window(pw);
		driver.close();
	 }
	
	@Test
	 public void testIRCTC_chrome() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();  //command to maximize the window
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		 driver.findElement(By.xpath("//a[@href='http://air.irctc.co.in']")).click();
		 String pw=driver.getWindowHandle();//command to switch window
			Set<String> allwin=driver.getWindowHandles();
			for(String s:allwin)
			{
				if(s.equals(pw)== false)
				{
					driver.switchTo().window(s);
					break;
				}
					
			}
			
			String s1=driver.getCurrentUrl();
			Assert.assertTrue(s1.contains("air"));
			System.out.println("Assertion is executed");
			
			Assert.assertTrue(driver.findElement(By.xpath("//input[@name='tripType' and @value='One way']")).isSelected());
			Assert.assertFalse(driver.findElement(By.xpath("//input[@value='Round trip' and @name='tripType']")).isSelected());
			
			WebElement sourceField=driver.findElement(By.xpath("//input[@id='origin']"));
			sourceField.sendKeys("delhi");
			driver.findElement(By.xpath("//a[contains(text(),'Delhi')]")).click();
			WebElement DestField=driver.findElement(By.xpath("//input[@id='destination']"));
			DestField.sendKeys("mumbai");
			driver.findElement(By.xpath("//a[contains(text(),'Bombay')]")).click();
			driver.findElement(By.xpath("//input[@id='departDate']/following-sibling::img")).click();
			driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[contains(text(),'20')]")).click();
			Select select=new Select(driver.findElement(By.xpath("//select[@id='noOfAdult']")));//command to select value from dropdown list
			select.selectByIndex(1);
			Select select1=new Select(driver.findElement(By.xpath("//select[@id='noOfChild']")));
			select1.selectByIndex(1);
			driver.findElement(By.xpath("//div[@onclick='submitSearch();']")).click();
			List<WebElement> alllist= driver.findElements(By.xpath("//div[@class='onewayflightinfo']"));//command to create a list of flights
			
			Assert.assertTrue(alllist.size()>0 & alllist.size()<100);
			System.out.println(alllist.size());
			System.out.println(s1);
			driver.close();
			driver.switchTo().window(pw);
			driver.close();
		 }
			 

}

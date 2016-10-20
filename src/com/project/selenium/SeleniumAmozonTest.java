package com.project.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumAmozonTest {

	@Test
	
	public void testAmazon() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[1]")).click();
		WebElement loginIDField=driver.findElement(By.xpath("//input[@id='ap_email']"));
		loginIDField.sendKeys("shubhirai229@gmail.com");
		WebElement loginPassword=driver.findElement(By.xpath("//input[@id='ap_password']"));
		loginPassword.sendKeys("29913022@");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		WebElement mobileNo=driver.findElement(By.xpath("//input[@id='dcq_question_subjective_1']"));
		mobileNo.sendKeys("9630415639");
		driver.findElement(By.xpath("//input[@id='dcq_submit']")).click();
		Select sel=new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
}

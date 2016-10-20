package com.project.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumMacysTest {
	
	@Test
	public void testMacys() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www1.macys.com/");
		driver.findElement(By.xpath("//a[@id='closeButton']")).click();
		WebElement googleSearchField=driver.findElement(By.xpath("//input[@id='globalSearchInputField']"));
		googleSearchField.sendKeys("jeans");
		driver.findElement(By.xpath("//input[@id='subnavSearchSubmit']")).click();
		String s1=driver.getTitle();
		System.out.println(s1);
		String s2=driver.getCurrentUrl();
		System.out.println(s2);
		driver.findElement(By.xpath("//img[@id='image_2351352_0_cat']")).click();
		driver.findElement(By.xpath("//ul[@id='sizeList2351352']/li[@title='4']/span")).click();
		driver.findElement(By.xpath("//button[@id='addToBagButton2351352']")).click();
		driver.findElement(By.xpath("//img[@id='btnCheckout']")).click();
		driver.findElement(By.xpath("//div[@id='remove_item_31387082_3_1']")).click();
		String s3=driver.findElement(By.xpath("//div[text()= 'Removed from bag')]")).getText();
		System.out.println(s3);
		Thread.sleep(5000);
		driver.close();
	}

}

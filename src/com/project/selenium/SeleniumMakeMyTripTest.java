package com.project.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumMakeMyTripTest {
	
	
	@Test
	public void testMakeMyTrip() throws InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@class='arrow_downall']")).click();
	driver.findElement(By.xpath("//a[@rel='#allMenu_domhldData']")).click();
	String p1=driver.getTitle();
	System.out.println(p1);
	String pw=driver.getWindowHandle();
	Set<String> allwin=driver.getWindowHandles();
	for(String s:allwin)
	{
		if(s.equals(pw)== false)
		{
			driver.switchTo().window(s);
			break;
		}
			
	}
	String p2=driver.getCurrentUrl();
	System.out.println(p2);
	//.findElement(By.xpath("//input[@class='typeahead-dep-city input-md form-control field-transparent tt-input']")).click();
	WebElement SearchField=driver.findElement(By.xpath("//input[@class='typeahead-dep-city input-md form-control field-transparent tt-input']"));
	SearchField.sendKeys("jaipur");
	driver.findElement(By.xpath("//a[@id='submit-btn-holiday']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'148')]/following-sibling::a[@class='flR button view_detls']")).click();
	driver.findElement(By.xpath("//a[@class='flR button view_detls pkgViewDetailLink' and @href='/holidays/india/package?id=24812&depCityId=3769&intid=inspire_Packageview']")).click();
	String fw=driver.getWindowHandle();
	Set<String> allwin1=driver.getWindowHandles();
	for(String s1:allwin1)
	{
		if(s1.equals(pw)== false && s1.equals(fw)==false)
		{
			driver.switchTo().window(s1);
			break;
		}
			
	}
	driver.findElement(By.xpath("//a[@class='button fullWidth alC rateDate_overlayOpen']")).click();
	driver.findElement(By.xpath("//a[@class='close_button rateDate_overlay']")).click();
	Thread.sleep(5000);
	driver.close();
	driver.switchTo().window(fw);
	driver.close();
	driver.switchTo().window(pw);
	String p3=driver.getCurrentUrl();
	System.out.println(p3);
	
}
}

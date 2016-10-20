package com.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumDemoTest {
   
 @Test
 public void testgoogle() throws InterruptedException, IOException
 {
 WebDriver driver = new FirefoxDriver(); //creating object for firefox
 driver.manage().window().maximize();  //command to maximize the window
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.get("https://www.google.co.in/?gws_rd=ssl"); //command to get the url of the page 
 WebElement googleSearchField = driver.findElement(By.xpath("//input[@id='lst-ib']")); //command to find the element in which i want to go
 googleSearchField.sendKeys("pakistan");
 //driver.findElement(By.xpath("//button[@value='Search']")).click();
 Thread.sleep(5000);
 Random random=new Random();
 int num=random.nextInt(15);
 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(file,new File("E:/software/first"+num+".png"));
 driver.close(); //command to close the maximize window
}
}
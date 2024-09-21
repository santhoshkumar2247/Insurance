package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Concept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("9876541233");
//		driver.findElement(By.id("pass")).sendKeys("32465445");		
//		driver.findElement(By.linkText("Create new account")).click();		
//		String txt = driver.findElement(By.id("reg_pages_msg")).getText();
//		System.out.println("The text is "+txt);
//		boolean tbox = driver.findElement(By.id("email")).isDisplayed();
//		System.out.println(tbox);
//		Thread.sleep(5000);
//		driver.findElement(By.className("firstname")).sendKeys("jgjkghj");
		
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.name("username")).sendKeys("8110828866");
		//driver.findElement(By.name("password")).sendKeys("ynyokesh");		
		WebElement a = driver.findElement(By.name("username"));
		WebElement b = driver.findElement(By.name("password"));
		Thread.sleep(5000);
		a.sendKeys("8110828866");
		b.sendKeys("ynyokesh");
		driver.findElement(By.className("_acap")).click();		
		
		
	}

}

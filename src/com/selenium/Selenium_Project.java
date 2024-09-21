package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Project {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		String pgsource = driver.getPageSource();
		//System.out.println(pgsource);
		String title = driver.getTitle();
		System.out.println(title);
		//driver.navigate().to("https://meet.google.com");
		//driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='nav-a  '][@data-csa-c-content-id='nav_cs_bestsellers']")).click();
//		WebElement a  =	driver.findElement(By.xpath("//textarea[@id='APjFqb'][1]"));
//				a.sendKeys("Test");
//				a.submit();
		//driver.close();
	}

}

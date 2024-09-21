package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.rediff.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
//		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("dsgdszg");
	}

}

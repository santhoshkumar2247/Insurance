package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("8110828866");
		driver.findElement(By.name("password")).sendKeys("asdassad");
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Santho\\OneDrive\\Documents\\Doc\\Selenium\\screenshot1.png");
		FileHandler.copy(source, destination);
	
	
	}

}

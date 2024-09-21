package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseDropDown {
		static WebDriver driver;		
	public static void lanuchBrowser(String browser) {
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}		
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void selectDropDown(WebElement options) throws InterruptedException {
		Select select = new Select(options);
		boolean status = select.isMultiple();
		System.out.println("Dropdown status: "+status);
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Hyundai");
		String txt = select.getFirstSelectedOption().getText();
		System.out.println(txt);
//		Thread.sleep(3000);
//		select.deselectAll();
	}
	
	public static void main(String[] args) throws InterruptedException {
		lanuchBrowser("chrome");
		getUrl("https://omayo.blogspot.com/");
		WebElement options= driver.findElement(By.id("multiselect1"));
		selectDropDown(options);
		
	}

}

package com.base;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void lauchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void passInput(WebElement element, String str) {
		try {
			element.clear();
			element.sendKeys(str);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void searchBtn(WebElement element2) {
		try {
			element2.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	private static Select dropDownObject(WebElement element) {
		Select s = new Select(element);
		return s;		
	}
	
	public static void selectByValue(WebElement element, String val) {
		dropDownObject(element).selectByValue(val);
	}
	
	public static void screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		FileUtils.copyFile(scr, des);
	}
	
	
} 
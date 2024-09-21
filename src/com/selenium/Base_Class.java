package com.selenium;

import java.io.File;

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

public class Base_Class {

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

	public static void scrollBy(String val) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(val);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	private static JavascriptExecutor javascriptExecutor(String script, WebElement element3) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, element3);
		return js;
	}

	public static void scrollIntoView(String script, WebElement element3) {
		try {
			javascriptExecutor(script, element3);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void forwardPage() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void backPage() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void reFresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void radioButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void alertAccept() {
		try {
			Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void alertDismiss() {
		try {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void getAlertText() {
		try {
			Alert a = driver.switchTo().alert();
			a.getText();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void getCurrentUrl() {
		try {
			System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static void getTitle() {
		try {
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static void screenShot(String location) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(location);
			FileUtils.copyFile(src, des);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}

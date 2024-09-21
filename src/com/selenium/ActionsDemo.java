package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {
	
	 WebDriver driver;		
	public void lanuchBrowser(String browser) {
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}		
	}
	
	public void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


	public void webElements() throws AWTException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element1 = driver.findElement(By.xpath("//a//span[text()='Fresh']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element1).build().perform();
		WebElement element2 = driver.findElement(By.xpath("//img[@alt=\"Amazon Fresh Meat\"]"));
		ac.contextClick(element2).build().perform();

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		WebDriverWait wb = new WebDriverWait(driver,Duration.ofSeconds(10));
		wb.until(ExpectedConditions.numberOfWindowsToBe(2));
		String parent = driver.getWindowHandle();
		Set <String> wids = driver.getWindowHandles();
		
		List <String> ws = new ArrayList(wids);
		
		for(String id:ws) {
			String txt = driver.switchTo().window(id).getTitle();
			System.out.println(txt);
			if(txt.equals("Amazon.in: Amazon Meat")) {
				//driver.close();
				 driver.switchTo().window(id);
			}
		}
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("602025");
		driver.switchTo().window(parent);
//		driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("602025");
//		driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
	}
	
	public static void main(String[] args) throws AWTException {
		ActionsDemo ad = new ActionsDemo();
		ad.lanuchBrowser("chrome");
		ad.getUrl("https://www.amazon.in/");
		ad.webElements();
	}

}

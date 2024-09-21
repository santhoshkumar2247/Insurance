package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {

	 WebDriver driver;		
	public void lanuchBrowser(String browser) {
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}		
	}
	
	public void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void webElements(){
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("Santhosh");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("89845548545");
		driver.findElement(By.name("reg_passwd__")).sendKeys("454656646");
		WebElement options= driver.findElement(By.id("day"));
		Select select = new Select(options);
		select.selectByValue("22");
		WebElement options2= driver.findElement(By.id("month"));
		Select select2 = new Select(options2);
		select2.selectByValue("11");
		WebElement options3= driver.findElement(By.id("year"));
		Select select3 = new Select(options3);
		select3.selectByValue("1992");
		List <WebElement> rd =driver.findElements(By.name("sex"));
		
		for(WebElement r: rd) {
			if(r.getAttribute("value").equalsIgnoreCase("2")){
				r.click();
			}
		}
		
	}
	
	public static void main(String[] args) {
		FacebookDemo fb = new FacebookDemo();
		fb.lanuchBrowser("chrome");
		fb.getUrl("https://www.facebook.com/");
		fb.webElements();
	}

}

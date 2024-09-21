package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://omayo.blogspot.com/");
//		driver.manage().window().maximize();
//		List <WebElement> options= driver.findElements(By.id("multiselect1"));
//	
//		for(WebElement op:options) {
//			String txt = op.getText();
//			System.out.println(txt);
//			if(txt.equals("Volvo") || txt.equals("Swift")) {
//				op.click();
//			}
//		}
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
	}

}

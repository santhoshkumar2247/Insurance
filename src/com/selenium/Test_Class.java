package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Class extends Base_Class {

	public static void main(String[] args) {
		launchBrowser("chrome");
		lauchUrl("https://www.amazon.in/");
		WebElement element = driver.findElement(By.name("q"));
		passInput(element,"Rose");
		WebElement element2 = driver.findElement(By.xpath("//input[@type='submit']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		searchBtn(element2);
		scrollBy("window.scrollBy(0,200)");
		WebElement element3 = driver.findElement(By.xpath("//a[text()='About Us']"));
		scrollIntoView("arguments[0].scrollIntoView();",element3);
	}

}

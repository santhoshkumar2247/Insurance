package com.typecasting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		int tot1 = driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th")).size();
		for (int r = 1; r <= tot1; r++) {
			String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[1]//td[" + r + "]"))
					.getText();

			System.out.println(name);
		}
		
		for (int p = 1; p <= 4; p++) {
			if (p > 1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + p + "]"));
//				active_page.click();
			}

//			int tot = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			int tot = driver.findElements(By.xpath("//table[@id='productTable']//thead//tr//th")).size();
//			System.out.println(tot);

			for (int r = 1; r <= tot; r++) {
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[1]//td[" + r + "]"))
						.getText();

//				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]"))
//						.getText();
//				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]"))
//						.getText();

//				System.out.println(name);
			}
		}
	}

}

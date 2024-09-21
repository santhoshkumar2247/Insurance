package com.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		ArrayList<String> a = new ArrayList<String>();
//	    a.add("apple");
//	    a.add("banana");
//	    a.add("cherry");
//	    a.add("mango");
//	    a.add("apple");
//	    
//	    a.remove("apple");
//	   System.out.println(a.contains("orange"));
//	    System.out.println(a);
//	    System.out.println(a.size());
//	    for(int i=0;i<a.size();i++) {
//	    	System.out.println(a.get(i));
//	    }
//		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String un = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).getText().split(":")[1].trim();
		String pw = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]")).getText().split(":")[1].trim();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
//		System.out.println(pw);
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
//		Set<String> windows = driver.getWindowHandles();
//		
//		Iterator<String> it = windows.iterator();
//		String pt = it.next();
//		String ct = it.next();
//		
//		driver.switchTo().window(ct);
//		driver.get("https://rahulshettyacademy.com/");
//		
//		String name = driver.findElement(By.cssSelector("h2 a[href*='api-automation-testing-with-javascript']")).getText().split("For")[1].trim().split(" ")[0];
//		driver.switchTo().window(pt);
//		
//		driver.findElement(By.name("name")).sendKeys(name);
//		String name ="Apale";
//		String a ="";
//		
//		for(int i=name.length()-1;i>=0;i--) {
//			a+=name.charAt(i);
//		}
//		
//		System.out.println(a);
		
//		char[] arr = name.toLowerCase().toCharArray();
//		
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i] == arr[i+1]) {
//				System.out.println(arr[i]);
//			}
//			
//		}
		
		
		int arr[] = {5,8,5,9,7,6,6};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The dup is "+arr[i]);
				}
			}
		}
		
//		int a[][]= {{4,5,7},{5,8,9}};
//		int b = a[0][0];
//		
//		for(int i= 0; i<a.length;i++) {
//			
//			for(int j=0;j<a.length;j++) {
//				if(a[i][j]<b) {
//					
//					b=a[i][j];
//					
//				}
//			}
//		}
//		System.out.println(b);
//		List<String> list = new ArrayList<String>();
//		list.add("Test");
//		list.add("Test2");
//		list.add("Test3");
//		list.add("Test4");
//		
//		List <String> val = Arrays.asList("Don","Theif");
//		Stream <String> st = Stream.concat(list.stream(), val.stream());
//		st.sorted().forEach(s->System.out.println(s));
		
//		val.stream().distinct().forEach(s->System.out.println(s));
//		driver.get("https://qaclickacademy.com/practice.php");
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,600)");
//		
//		int tot = driver.findElements(By.xpath("//table[@name='courses']//tbody//th")).size();
//		System.out.println(tot);
//
//		for (int r = 1; r <= tot; r++) {
//			String name = driver.findElement(By.xpath("//table[@id='product']//tbody//tr[" + r + "]//td[2]"))
//					.getText();
//			String price = driver.findElement(By.xpath("//table[@id='product']//tbody//tr[" + r + "]//td[3]"))
//					.getText();
//			String text = driver.findElement(By.xpath("//table[@id='product']//tbody//tr[2]//td["+r+"]"))
//					.getText();
//			System.out.println(text);
//		}
		
		
//		WebElement table=driver.findElement(By.id("product"));
//		System.out.println(table.findElements(By.tagName("tr")).size());
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		System.out.println(secondrow.get(0).getText());
//		System.out.println(secondrow.get(1).getText());
//		System.out.println(secondrow.get(2).getText());
//		int month = 11;
//		String date = "11";
//		String year = "2025";
//		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
//		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
//		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
//		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
//		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(month-1).click();
//		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
//		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
//		Thread.sleep(5000);
//		driver.switchTo().frame("frame-top");
//
//		driver.switchTo().frame("frame-middle");
//		String text = driver.findElement(By.cssSelector("div[id='content']")).getText();
//		System.out.println(text);
//		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
//		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//		Set<String> wind = driver.getWindowHandles();
//		Iterator <String> it = wind.iterator();
//		String parent = it.next();
//		String child = it.next();
//		driver.switchTo().window(child);
//		String text = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
//		System.out.println(text);
//		driver.switchTo().window(parent);
//		String text2 = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
//		System.out.println(text2);
//		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
//		Set <String> w = driver.getWindowHandles();
//		Iterator<String> it = w.iterator();
//		String parent = it.next();
//		String child = it.next();
//		driver.switchTo().window(child);
//		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		System.out.println(email);
//		driver.switchTo().window(parent);
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
//		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.name("password")).sendKeys("learning");
//		driver.findElement(By.name("terms")).click();
//		driver.findElement(By.name("signin")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
//		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
//
//		for(int i =0;i<products.size();i++)
//
//		{
//
//		products.get(i).click();
//
//		}
	}

}

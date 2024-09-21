package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {
	
	 WebDriver driver;		
		public void lanuchBrowser(String browser) {
			if(browser.equals("chrome")){
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}		
		}
		
		public void getUrl(String url) {
			driver.get(url);
		}
		
		public void webElements() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.linkText("Create an Account")).click();
			driver.findElement(By.id("firstname")).sendKeys("Santhosh");
			driver.findElement(By.id("lastname")).sendKeys("M");
			driver.findElement(By.id("email_address")).sendKeys("santhoshkumar2247@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Santhosh2247$");
			driver.findElement(By.id("password-confirmation")).sendKeys("Santhosh2247$");
			driver.findElement(By.xpath("//button//span[text()='Create an Account']")).click();
		}
		
		public void signIn() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.linkText("Sign In")).click();
			driver.findElement(By.id("email")).sendKeys("santhoshkumar2247@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Santhosh2247$");
			driver.findElement(By.xpath("//button//span[text()='Sign In']")).click();
		}
		
		public void afterSignUp() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement element = driver.findElement(By.xpath("//a//span[text()='Men']"));
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			WebElement element2 = driver.findElement(By.linkText("Tops"));
			act.moveToElement(element2).build().perform();
			driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
			
		}

		public void dropDownEvent() throws AWTException, InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement options= driver.findElement(By.id("sorter"));
			Select select = new Select(options);
			select.selectByValue("price");
			driver.findElement(By.xpath("//div[text()='Material']")).click();
			driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[6]/div[2]/ol/li[3]/a")).click();
			
			WebElement element = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li/div/a/span/span/img"));
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			WebDriverWait wb = new WebDriverWait(driver,Duration.ofSeconds(10));
			wb.until(ExpectedConditions.numberOfWindowsToBe(2));
			String parent = driver.getWindowHandle();
			Set <String> wids = driver.getWindowHandles();
			
//			List <String> ws = new ArrayList(wids);
//			System.out.println(ws);
//			String parentId = ws.get(0);
//			String childId = ws.get(1);			
			
//			Iterator it = wids.iterator();
//			String parentId =(String) it.next();
//			String childId = (String) it.next();
			
			for(String id:wids) {
				if(!parent.equals(id)){
				driver.switchTo().window(id);
				}			
			}

			driver.findElement(By.xpath("//input[@id='qty']")).clear();
			driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("4");
			driver.findElement(By.id("option-label-size-143-item-168")).click();
			driver.findElement(By.id("option-label-color-93-item-53")).click();
			driver.findElement(By.xpath("//button//span[text()='Add to Cart']")).click();
		
			driver.switchTo().window(parent);
			driver.findElement(By.linkText("Clear All")).click();
			driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/div/div/a[4]/div")).click();
			driver.findElement(By.xpath("//*[@class='filter-options-title'][text()='Color']")).click();
			driver.findElement(By.xpath("//div[@option-label=\"Red\"][@option-id=\"58\"][@option-tooltip-value=\"#ff0000\"][@class=\"swatch-option color \"]")).click();
						
		}
		
		public void addToCart() {
			WebDriverWait wb = new WebDriverWait(driver,Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
			driver.findElement(By.xpath("//a//span[text()='View and Edit Cart']")).click();		
			driver.findElement(By.xpath("//input[@title='Qty']")).clear();
			driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("2");			
			driver.findElement(By.xpath("//button//span[text()='Update Shopping Cart']")).click();
			WebElement element = driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div/ul/li[1]/a"));			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()",element);
			driver.findElement(By.xpath("//button//span[text()='Proceed to Checkout']")).click();
//			WebElement ele = wb.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")));
//			ele.click();
//			WebElement element = driver.findElement(By.xpath("//button//span[text()='Proceed to Checkout']"));			
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,5000)","");
//			js.executeScript("arguments[0].click()",element);
			
		}
		
		public void shippingAddress() {
//			WebElement options= driver.findElement(By.name("country_id"));
//			Select select = new Select(options);
//			select.selectByVisibleText("India");
//			WebElement options2= driver.findElement(By.name("region_id"));
//			Select select2 = new Select(options2);
//			select2.selectByVisibleText("Tamil Nadu");
//			driver.findElement(By.name("company")).sendKeys("XYZ");
//			driver.findElement(By.name("street[0]")).sendKeys("XYZ");
//			driver.findElement(By.name("street[1]")).sendKeys("XYZ");
//			driver.findElement(By.name("street[2]")).sendKeys("XYZ");
//			driver.findElement(By.name("city")).sendKeys("Chennai");
//			driver.findElement(By.name("postcode")).sendKeys("602025");
//			driver.findElement(By.name("telephone")).sendKeys("87878787878");
//			driver.findElement(By.xpath("//button//span[text()='Next']")).click();
			WebElement element2 = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,5000)","");
			js.executeScript("arguments[0].click()",element2);
//			driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
			WebElement element = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
			
			js.executeScript("window.scrollBy(0,5000)","");
			js.executeScript("arguments[0].click()",element);
		}
		
		public void takeScreenshot() throws IOException, InterruptedException {
			Thread.sleep(5000);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Santho\\OneDrive\\Documents\\Doc\\Selenium\\cart.png");
			FileHandler.copy(source, destination);
		}
		
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		SeleniumDemo sc = new SeleniumDemo();
			sc.lanuchBrowser("chrome");
			sc.getUrl("https://magento.softwaretestingboard.com/");		
			sc.webElements();
			sc.signIn();
			sc.afterSignUp();
			sc.dropDownEvent();
			sc.addToCart();
			sc.shippingAddress();
			sc.takeScreenshot();
		
	}

	

}

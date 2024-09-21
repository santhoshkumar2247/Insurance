package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public WebDriver driver;
	
	public BookPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name") 
	WebElement first_name;
	
	@FindBy(id="last_name") 
	WebElement last_name;
	
	@FindBy(id="address") 
	WebElement address;
	
	@FindBy(id="cc_num") 
	WebElement cc_num;
	
	@FindBy(id="cc_type") 
	WebElement cc_type;
	
	@FindBy(id="cc_exp_month") 
	WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year") 
	WebElement cc_exp_year;
	
	@FindBy(id="cc_cvv") 
	WebElement cc_cvv;
	
	@FindBy(xpath="//input[@id='book_now']") 
	WebElement book_now;
	
	@FindBy(xpath="//input[@id='logout']") 
	WebElement logout;
	
	
	public WebElement getFirstName() {
		return first_name;
	}
	
	public WebElement getlastName() {
		return last_name;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getcc_num() {
		return cc_num;
	}
	
	public WebElement getcc_type() {
		return cc_type;
	}
	
	public WebElement getcc_exp_month() {
		return cc_exp_month;
	}
	
	public WebElement getcc_exp_year() {
		return cc_exp_year;
	}
	
	public WebElement getcc_cvv() {
		return cc_cvv;
	}
	
	public WebElement getBookNow() {
		return book_now;
	}
	
	public WebElement getLogout() {
		return logout;
	}
}

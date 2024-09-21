package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;
	
	@FindBy(id="location") 
	WebElement location;
	
	@FindBy(id="hotels") 
	WebElement hotels;

	@FindBy(id="room_type") 
	WebElement room_Type;
	
	@FindBy(id="room_nos") 
	WebElement roomNos;
	
	@FindBy(xpath="//input[@id='datepick_in']") 
	WebElement datepick_in;
	
	@FindBy(id="datepick_out") 
	WebElement datepick_out;
	
	@FindBy(id="adult_room") 
	WebElement adult_room;
	
	@FindBy(id="child_room") 
	WebElement child_room;
	
	@FindBy(id="Submit") 
	WebElement Submit;
	
	@FindBy(xpath="//input[@id='radiobutton_0']") 
	WebElement radioSubmit;
	
	@FindBy(xpath="//input[@id='continue']") 
	WebElement conSubmit;
	
	public SearchPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	
	public WebElement getRoom_type() {
		return room_Type;
	}
	
	public WebElement getRoomNos() {
		return roomNos;
	}
	
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	
	public WebElement getAdult_room() {
		return adult_room;
	}
	
	public WebElement getChild_room() {
		return child_room;
	}
	
	public WebElement getSubmit() {
		return Submit;
	}
	
	public WebElement getRadioSubmit() {
		return radioSubmit;
	}
	
	public WebElement getContinueSubmit() {
		return conSubmit;
	}
	
}

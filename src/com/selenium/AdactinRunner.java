package com.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.poma.PageObjectManager;

public class AdactinRunner extends BaseClass {
@Test
//	public static void main(String[] args) throws InterruptedException, IOException {
		public void submitOrder() throws InterruptedException, IOException {
		launchBrowser("chrome");
		lauchUrl("http://adactinhotelapp.com/index.php");
		
		PageObjectManager pom = new PageObjectManager(driver);
		//Login
		passInput(pom.getLp().getUsername(), "Lekha2128");
		passInput(pom.getLp().getPassword(), "Rishi@28");
		searchBtn(pom.getLp().getLogin());
		//search page
		selectByValue(pom.getSp().getLocation(),"Melbourne");
		selectByValue(pom.getSp().getHotels(),"Hotel Sunshine");
		selectByValue(pom.getSp().getRoom_type(),"Super Deluxe");
		selectByValue(pom.getSp().getRoomNos(),"4");
		passInput(pom.getSp().getDatepick_in(),"12/12/2024");
		passInput(pom.getSp().getDatepick_out(),"15/12/2024");
		selectByValue(pom.getSp().getAdult_room(),"3");
		selectByValue(pom.getSp().getChild_room(),"2");
		searchBtn(pom.getSp().getSubmit());
		searchBtn(pom.getSp().getRadioSubmit());		
		searchBtn(pom.getSp().getContinueSubmit());	
		//Book Page
		passInput(pom.getBp().getFirstName(), "Lekha2128");
		passInput(pom.getBp().getlastName(), "Lekha");
		passInput(pom.getBp().getAddress(), "Chennai");
		passInput(pom.getBp().getcc_num(), "1234567891254540");
		selectByValue(pom.getBp().getcc_type(),"VISA");
		selectByValue(pom.getBp().getcc_exp_month(),"5");
		selectByValue(pom.getBp().getcc_exp_year(),"2025");
		passInput(pom.getBp().getcc_cvv(),"456");
		searchBtn(pom.getBp().getBookNow());
		Thread.sleep(5000);
		searchBtn(pom.getBp().getLogout());	
		screenshot(System.getProperty("user.dir")+"\\Screen\\book.png");
	}

}

package com.poma;

import org.openqa.selenium.WebDriver;

import com.pom.BookPage;
import com.pom.LoginPage;
import com.pom.SearchPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private LoginPage lp;
	private SearchPage sp;
	private BookPage bp;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getLp() {
		if(lp==null) {
			lp =new	LoginPage(driver);
		}
		return lp;
	}
	
	public SearchPage getSp() {
		if(sp==null) {
			sp =new	SearchPage(driver);
		}
		return sp;
	}
	
	public BookPage getBp() {
		if(bp==null) {
			bp =new	BookPage(driver);
		}
		return bp;
	}
}

package com.pages.inbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LandingPage {
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyLoginFailed(){
		
	}
}


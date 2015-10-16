package com.cucumber.Steps;

import org.openqa.selenium.WebDriver;

import com.pages.inbox.LandingPage;
import com.pages.login.Loginpage;
import com.pom.fb.Utils.HooksTask;

import cucumber.api.java.en.*;

public class Com_Steps {
	
	public WebDriver driver = null;
	public Loginpage onLoginPage ;
	protected LandingPage onLandingPage;
	
//	public Com_Steps(){
//		System.out.println("Hooks driver::  " + HooksTask.driver);
//		driver = HooksTask.driver;
//		System.out.println("dirver value : ;;; "  + driver);
//		
//	}
	 
	@Given("^i log into the fb$")
	public void login(){
//		onLoginPage = Loginpage.setUp(driver);
		onLoginPage = HooksTask.setupDriver();
		onLandingPage = onLoginPage.doLogin("username", "password");
	}
	
	@Then("^verify the invalid login page$")
	public void verify_invlid_login_page(){
		onLandingPage.verifyLoginFailed();
	}
	
	@Then("^application \"([^\"]*)\" successfully$")
	public void application_successfully(String arg1) {
		onLandingPage.verifyLoginFailed();
	}
}

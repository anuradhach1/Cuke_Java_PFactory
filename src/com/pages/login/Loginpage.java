package com.pages.login;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pages.inbox.LandingPage;

public class Loginpage 
{
	public static WebDriver driver;
	public static Properties CONFIG = null;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id='email']") 
	private WebElement username_Edit;
	
	@FindBy(xpath="//*[@id='pass']") 
	private WebElement password_Edit;
	
	@FindBy(xpath="//input[@value='Log In']") 
	private WebElement login_button;

	public LandingPage doLogin(String userName, String password){
		username_Edit.sendKeys(userName);
		password_Edit.sendKeys(password);
		login_button.click();
		return new LandingPage(driver);
	}
//	
//	
//	public static Loginpage setUp(WebDriver driver){
//		if(driver==null){
//			
//			// initialize the properties file
//			CONFIG = new Properties();
//			String configPath = System.getProperty("user.dir") + "/src/com/pom/fb/Utils/config.properties";
//			try {
//				System.out.println("Initiating the CONFIG");
//				FileInputStream fsconfig = new FileInputStream(configPath);
//				CONFIG.load(fsconfig);
//				} catch(Exception e){
//					System.out.println("Error loading the config.properties file");
//				}
//			
//			// Initializing the WebDriver
//			String configBrowser = CONFIG.getProperty("browser");
//			
//			if(configBrowser.equals("firefox")){
//				System.out.println("Initiating the WebDrver for Firefox browser");
//				driver = new FirefoxDriver();
//				driver.manage().window().maximize();
//				
//				}
//			else if(configBrowser.equals("chrome")){
//				System.out.println("Initiating the WebDrver for chrome browser");
//				String chromeDriverPath = System.getProperty("user.dir") + "/driverexes/chromedriver";
//				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//				driver = new ChromeDriver();
//				driver.manage().window().maximize();
//			}		
//		}
//		
//
//		driver.get(CONFIG.getProperty("test_url"));
//		System.out.println("Window Title: " + driver.getTitle());
//		return new Loginpage(driver);
//	}
}
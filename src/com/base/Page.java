//package com.base;
//
//import java.io.FileInputStream;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//
//
//public class Page {
//	
//	public WebDriver driver = null;
//	protected Properties CONFIG = null;
//	
//	public WebDriver initiatePage(){
//		
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
//		return driver;	
//	}	
//	
//}





//public void orRepository(){
//
//	// initialize the OR file
//	OR = new Properties();
//	String orPath = System.getProperty("user.dir") + "/src/com/pom/fb/Utils/OR.properties";
//	try {
//		System.out.println("Initiating the OR");
//		FileInputStream fsor = new FileInputStream(orPath);
//		OR.load(fsor);
//		} catch(Exception e){
//			System.out.println("Error loading the OR.properties file");
//			return;
//		}	
//	}
//

//
//		// open browser
//	public void openBrowser(){
//		driver.get(CONFIG.getProperty("test_url"));
//	}
//		// quit browser
//	public void quitBrowser()
//	{
//		System.out.println("Tests are passed");
//		driver.quit();
//	}
//
//		// wait for few seconds
//	public void implecitWaitSeconds(int seconds){
//		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
//	}
//
//		//input
//	public void setValue(String xpath_key, String value)
//	{
//		try{
//			driver.findElement(By.xpath(OR.getProperty(xpath_key))).sendKeys(value);
//			}catch(Exception e)
//			{
//				System.out.println("Element with " + xpath_key + " not found in the page");
//			}
//	}
//	
//	//click
//	public void clickElement(String xpath_key){
//		try{
//		driver.findElement(By.xpath(OR.getProperty(xpath_key))).click();
//		}catch(Exception e)
//		{
//			System.out.println("Element with " + xpath_key + " not found in the page");
//		}
//	}
//	
//		//verification
//	public Boolean isElementPresent(String xpath_key)
//	{
//		try{
//			driver.findElement(By.xpath(OR.getProperty(xpath_key))).isDisplayed();			
//		}
//		catch(Exception e){
//			System.out.println("Element with " + xpath_key + " not found in the page");
//			return false;
//		}
//		return true;
//	}	
//}

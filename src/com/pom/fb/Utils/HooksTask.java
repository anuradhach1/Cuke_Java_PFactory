package com.pom.fb.Utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.login.Loginpage;

import cucumber.api.Scenario;

public class HooksTask {

    public static WebDriver driver;
	public static Properties CONFIG = null;
    
 
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
	@Before
    public static Loginpage setupDriver() {
		if(driver==null){
			
				// initialize the properties file
				CONFIG = new Properties();
				String configPath = System.getProperty("user.dir") + "/src/com/pom/fb/Utils/config.properties";
				try {
					System.out.println("Initiating the CONFIG");
					FileInputStream fsconfig = new FileInputStream(configPath);
					CONFIG.load(fsconfig);
					} catch(Exception e){
						System.out.println("Error loading the config.properties file");
					}
				
				// Initializing the WebDriver
				String configBrowser = CONFIG.getProperty("browser");
				
				if(configBrowser.equals("firefox")){
					System.out.println("Initiating the WebDrver for Firefox browser");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					
					}
				else if(configBrowser.equals("chrome")){
					System.out.println("Initiating the WebDrver for chrome browser");
					String chromeDriverPath = System.getProperty("user.dir") + "/driverexes/chromedriver";
					System.setProperty("webdriver.chrome.driver", chromeDriverPath);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}		
			}
			driver.get(CONFIG.getProperty("test_url"));
			System.out.println("Window Title: " + driver.getTitle());
			return new Loginpage(driver);
	    }

 
    
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
	@After
    public void embedScreenshot(Scenario scenario) {
    	System.out.println("Inside Hooks After");
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        
    }



    
}


package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.pages.login.Loginpage;

public class TestOne {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver = new FirefoxDriver();
		 driver.get("http://facebook.com");
		 
	

	}
}

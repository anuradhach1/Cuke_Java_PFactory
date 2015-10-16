package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.Page;
import com.pages.login.Loginpage;

public class TestOne {
	
	public static WebDriver driver;
	
	public static Loginpage loginPageObj;
	
	public static void main(String[] args) {
		
//		 driver = new FirefoxDriver();
//		 driver.get("http://facebook.com");
		 
		loginPageObj = new Loginpage(driver);
		loginPageObj.doLogin("username", "password");

	}
}

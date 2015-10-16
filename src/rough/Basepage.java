package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepage {

	public static WebDriver driver;
	
	public  Basepage(){
		System.out.println(driver);
		driver = new FirefoxDriver();
		System.out.println(driver);
	}
	
}

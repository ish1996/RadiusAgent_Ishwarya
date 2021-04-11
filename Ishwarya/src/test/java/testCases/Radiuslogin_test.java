package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.RadiusLoigIn;

public class Radiuslogin_test {
	
	private static 	WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.radiusagent.com/");
		//RadiusLoigIn.login_button(driver).click();
		//RadiusLoigIn.login_button(driver).sendKeys(Keys.RETURN);
		//clicking login button in homepage
		RadiusLoigIn.clickLoginInHome(driver);
	}

}

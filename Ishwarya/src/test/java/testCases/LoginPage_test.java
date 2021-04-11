package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPageAction;
//import pages.RadiusLoigIn;

public class LoginPage_test {
	
	private static WebDriver driver=null;
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    test1();
	}*/
	
	// no need of main method while running with testNg
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	}
	@Test(priority = 1)
	public static void test1() {
		driver.get("https://www.radiusagent.com/login");
		LoginPageAction page = new LoginPageAction(driver);
		page.writeEmailId("ishwarya@gmail.com");
		page.writePassword("Pass");
		page.clickLogin();
		
	}
	
	@Test(priority = 2)
	public static void test2() {
		driver.get("https://www.radiusagent.com/login");
		LoginPageAction page = new LoginPageAction(driver);
		page.googleLogin();
	}
	
	@Test(priority = 3)
	public static void test3() {
		driver.get("https://www.radiusagent.com/login");
		LoginPageAction page = new LoginPageAction(driver);
		page.appleLogin();
	}
	
	@AfterTest
public static void testcom() {
		driver.close();
		driver.quit();
	}

}

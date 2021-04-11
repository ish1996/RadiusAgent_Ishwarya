package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
		// test case to verify if user with invalid credentials in not able to login
		
		driver.get("https://www.radiusagent.com/login");
		LoginPageAction page = new LoginPageAction(driver);
		page.writeEmailId("ishwarya@gmail.com");
		page.writePassword("Pass");
		page.clickLogin();
		String actualUrl="https://www.radiusagent.com/login";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	/*@Test(priority = 2)
	public static void test2() {
		driver.get("https://www.radiusagent.com/login");
		LoginPageAction page = new LoginPageAction(driver);
		page.googleLogin();
		String actualUrl="https://appleid.apple.com/auth/authorize?client_id=com.agentdesks.agentdesksserviceid&redirect_uri=https%3A%2F%2Fwww.radiusagent.com%2Flogin&response_type=code&scope=name%20email&response_mode=form_post&state=a5f24dc7c2";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	@Test(priority = 3)
	public static void test3() {
		driver.get("https://www.radiusagent.com/login");
		LoginPageAction page = new LoginPageAction(driver);
		page.appleLogin();
		String actualUrl="https://appleid.apple.com/*";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
	}
	*/
	
	@AfterTest
public static void testcom() {
		driver.close();
		driver.quit();
	}

}

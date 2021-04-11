package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadiusLoigIn {
	
	
	private static WebElement element = null;
	
	public static WebElement login_button(WebDriver driver) {
		
		element = driver.findElement(By.linkText("Log In"));
		return element;
	}
	
	public static void clickLoginInHome(WebDriver driver) {
		element = login_button(driver);
		element.sendKeys(Keys.RETURN);
	}

}

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class LoginPageAction {
	
	private  WebDriver driver;

	private String email_obj = "//input[contains(@placeholder,'mail')]";
	private String pass_obj = "input[placeholder*='Pass']";
	private String login_obj = "button[class*='Login__CTAButton']";
	private String google_obj = "button[class*='GoogleSignIn']";
	private String apple_obj = "a[class*='AppleSignIn']";
	
	public LoginPageAction(WebDriver driver) {
		this.driver = driver;
	}
	
	By Email = By.xpath(email_obj);
	By Pas=By.cssSelector(pass_obj);
	By Login = By.cssSelector(login_obj);
	By goo = By.cssSelector(google_obj);
	By app = By.cssSelector("a[class*='AppleSignIn']");
	
	public void writeEmailId(String userinput) {
		driver.findElement(Email).sendKeys(userinput);
	}
	
	
	public void writePassword(String userinput) {
		driver.findElement(Pas).sendKeys(userinput);
	}
	
	public void clickLogin() {
		driver.findElement(Login).sendKeys(Keys.RETURN);
	}
	
	public void googleLogin() {
		driver.findElement(goo).sendKeys(Keys.RETURN);
	}
	
	public void appleLogin() {
		driver.findElement(app).sendKeys(Keys.RETURN);
	}
	
}
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//input[@name='username']")
	WebElement usernameBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordBox;
	
	@FindBy(xpath="//p[text()='Invalid credentials']")
	WebElement invalidCred;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	public void setUsername(String username) {
		usernameBox.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public boolean invalidCredDisplayed() {
		return invalidCred.isDisplayed();
	}
}

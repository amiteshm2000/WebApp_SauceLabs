package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginPage {
	public InvalidLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='user-name']")
	WebElement usernameBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordBox;
	
	@FindBy(xpath="//div[@class='error-message-container error']/h3")
	WebElement invalidCredText;
	
	@FindBy(xpath="//input[@id='login-button']")
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
		return invalidCredText.isDisplayed();
	}
	public String getInvalidCredTest() {
		return invalidCredText.getText();
	}
	
}

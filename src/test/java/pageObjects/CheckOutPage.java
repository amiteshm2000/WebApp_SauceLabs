package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class CheckOutPage {
	
	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
//	this is the comment in the 3March branch
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement postalCode;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement cont;
	
	public void setFirstName() {
		firstName.sendKeys("amites");
	}
	
	public void setLastName() {
		lastName.sendKeys("amites");
	}
	
	public void setPostalCode() {
		postalCode.sendKeys("1234");
	}
	public void clickContinue() {
		cont.click();
	}
}

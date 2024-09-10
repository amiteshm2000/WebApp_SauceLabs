package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	public AdminPage() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a/span[normalize-space()='Admin']")
	WebElement adminButton;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addButton;
	
	
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")
	WebElement userRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement empName;
	
	@FindBy(xpath="//div[@class='oxd-select-option --selected']")
	WebElement status;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	WebElement userName;
	
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveButton;
	
	public void clickAdmin() {
		adminButton.click();;
	}
	
	
	public void clickAddButton() {
		addButton.click();;
	}
	
	public void setUserName(String name) {
		userName.sendKeys(name);
	}

	
	public void setUserRole(String role) {
		Select s= new Select(userRole);
		s.selectByVisibleText(role);
	}
	
	public void setEmpName(String emp) {
		empName.sendKeys(emp);
	}

	public void setStatus(String stats) {
		Select s= new Select(status);
		s.selectByVisibleText(stats);
	}

	public void setPassword(String passw) {
		password.sendKeys(passw);
	}
	
	public void setConfirmPassword(String ConPass) {
		confirmPassword.sendKeys(ConPass);
	}
	
	public void clickSave() {
		saveButton.click();
	}

	
}


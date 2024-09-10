package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class DashboardPage{
	
	public DashboardPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	WebElement dashboard;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	public
	WebElement userDetail;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	
	public void clickUserDetail() {
		userDetail.click();
	}
	
	public void logout() {
		logout.click();
	}
}

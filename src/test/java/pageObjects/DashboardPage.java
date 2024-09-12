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

	@FindBy(xpath="//div[@class='app_logo']")
	WebElement dashboard;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menuButton;
	
	@FindBy(xpath="logout_sidebar_link")
	WebElement logoutButton;
		
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addToCartButton;
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	
	public void clickMenuButton() {
		menuButton.click();
	}
	
	public void goToCart() {
		cart.click();
	}
	public void addToCart() {
		addToCartButton.click();
	}
	
	public void logout() {
		logoutButton.click();
	}

}

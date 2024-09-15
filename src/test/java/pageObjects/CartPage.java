package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import testBase.BaseClass;

//	Adding items from Dashboard to cart
public class CartPage{

	public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath="//div[contains(text(),'Backpack')]")
//	WebElement itemButton;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addToCart;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement goToCart;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkOutButton;
	
//	clicking on specific items on DashBoard
	public void clickOnItem(WebDriver driver , String item) {
		String path="//div[contains(text(),'"+item+"')]";
		WebElement itemButton =driver.findElement(By.xpath(path));
		itemButton.click();
	}
	
	public boolean checkItems(WebDriver driver, String item) {
		//div[contains(text(),'Backpack')]
		String path="//div[contains(text(),'"+item+"')]";
		WebElement cartItem =driver.findElement(By.xpath(path));
			return cartItem.isDisplayed();

	}

	
//	Clicking on add to cart button
	public void clickAddToCart() {
			addToCart.click();	
	}
	
	public void clickGoToCart() {
		goToCart.click();	
}
	
	public void clcikOnCheckOutButton() {
		checkOutButton.click();
	}
//	going back to dashboard
	public void clcikOnBack() {
		backButton.click();
	}
}
	

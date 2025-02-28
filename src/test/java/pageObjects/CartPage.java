package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class CartPage{

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement goToCart;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkOutButton;
	
	public void clickOnItem(WebDriver driver , String item) {
		String path="//div[contains(text(),'"+item+"')]";
		WebElement itemButton =driver.findElement(By.xpath(path));
		itemButton.click();
	}
	
	public boolean checkItems(WebDriver driver, String item) {
		String path="//div[contains(text(),'"+item+"')]";
		WebElement cartItem =driver.findElement(By.xpath(path));
			return cartItem.isDisplayed();
	}

	public void clickAddToCart() {
			addToCart.click();	
	}
	
	public void clickGoToCart() {
		goToCart.click();	
}
	
	public void clcikOnCheckOutButton() {
		checkOutButton.click();
	}
	public void clcikOnBack() {
		backButton.click();
	}
}
	

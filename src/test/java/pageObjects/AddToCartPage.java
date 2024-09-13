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

public class AddToCartPage{

	public AddToCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

//	@FindBy(xpath="//div[contains(text(),'Backpack')]")
//	WebElement itemButton;
	
	@FindBy(xpath="//button[@id='add-to-cart']")
	WebElement addToCart;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backButton;
	
	public void clickOnItem(WebDriver driver , String item) {
		String path="//div[contains(text(),'"+item+"')]";
		WebElement itemButton =driver.findElement(By.xpath(path));
		try {
			itemButton.click();
		}
		catch(Exception e) {
			System.out.println(e);
			Assert.assertTrue(false);
		}
	}
	public void clickAddToCart() {
			addToCart.click();
			
	}
	public void clcikOnBack() {
		backButton.click();
	}
}
	

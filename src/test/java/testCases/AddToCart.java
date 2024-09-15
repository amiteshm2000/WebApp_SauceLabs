package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;
import java.util.Arrays;
public class AddToCart extends BaseClass{
	
	@Test(dataProvider="ItemData", dataProviderClass=DataProviders.class)
	public void addToCart(String username, String password, String credData, String items) {
		
		login(username, password, credData);
		CartPage cart= new CartPage(driver);
		String[] item=items.split(",");
		for(String s:item) {
			cart.clickOnItem(driver, s.trim());
			cart.clickAddToCart();
			cart.clcikOnBack();
		}
		cart.clickGoToCart();
		System.out.println("excel items "+ Arrays.toString(item));
		for(String s:item) {
			System.out.println("each item "+ s);
			if(!cart.checkItems(driver, s.trim())) {
				System.out.println("Fail");
				Assert.assertTrue(false);
			}
		}
		Assert.assertTrue(true);
		
	}
}

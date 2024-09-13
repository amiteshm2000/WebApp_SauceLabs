package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class AddToCart extends LoginTest{
	
	@Test(dataProvider="ItemData", dataProviderClass=DataProviders.class)
	public void addToCart(String username, String password, String credData, String items) {
		
		login(username, password, credData);
		AddToCartPage cart= new AddToCartPage(driver);
		String[] item=items.split(",");
		for(String s:item) {
			cart.clickOnItem(driver, s.trim());
			cart.clickAddToCart();
			cart.clcikOnBack();
		}
		
	}
}

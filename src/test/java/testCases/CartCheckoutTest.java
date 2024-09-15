package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class CartCheckoutTest extends BaseClass {

	@Test(dataProvider = "ItemData", dataProviderClass = DataProviders.class)
	public void cartCheckOut(String username, String password, String credData, String items) {

		login(username, password, credData);
		CartPage cart = new CartPage(driver);
		String[] item = items.split(",");
		for (String s : item) {
			cart.clickOnItem(driver, s.trim());
			cart.clickAddToCart();
			cart.clcikOnBack();
		}
		cart.clickGoToCart();
		cart.clcikOnCheckOutButton();
		CheckOutPage check = new CheckOutPage(driver);
		check.setFirstName();
		check.setLastName();
		check.setPostalCode();
		check.clickContinue();

	}
}

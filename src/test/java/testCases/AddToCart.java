package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import testBase.BaseClass;
import utilities.DataProviders;
public class AddToCart extends BaseClass{
	
	@Test(dataProvider="ItemData", dataProviderClass=DataProviders.class)
	public void addToCart(String username, String password, String credData, String items) {
//		logger.info("****Logging in to application****");
		login(username, password, credData);
		CartPage cart= new CartPage(driver);
		String[] item=items.split(",");
//		logger.info("****Adding Items to Cart****");
		for(String s:item) {
			cart.clickOnItem(driver, s.trim());
			cart.clickAddToCart();
			cart.clcikOnBack();
		}
//		logger.info("****Going to Cart****");
		cart.clickGoToCart();
//		logger.info("****Validating added Items****");
		for(String s:item) {
			if(!cart.checkItems(driver, s.trim())) {
				Assert.assertTrue(false);
			}
		}
		Assert.assertTrue(true);
		
	}
}

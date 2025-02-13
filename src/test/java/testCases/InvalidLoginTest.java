package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.InvalidLoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class InvalidLoginTest extends BaseClass{
	
	@Test(dataProvider="InvalidLoginData", dataProviderClass = DataProviders.class)
	public void invalidLoginTest(String username, String password) {
		
		InvalidLoginPage login = new InvalidLoginPage(driver);
		login.setUsername(username);
		login.setPassword(password);
		login.clickLoginButton();
		
		if(login.invalidCredDisplayed()) {
			Assert.assertEquals(true, login.invalidCredDisplayed());
			System.out.println(login.getInvalidCredTest());
		}
		else {
			Assert.assertEquals(false, login.invalidCredDisplayed());
		}
	}
	
}

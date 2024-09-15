package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginTest extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void loginVerification(String username, String password, String credData) {
		login(username, password, credData);
		DashboardPage db = new DashboardPage(driver);
		if (credData == "valid") {
			try {
				Assert.assertTrue(db.isDashboardDisplayed());
				logout();
			} catch (Exception e) {
				System.out.println(e);
			}
		} else if (credData == "invalid") {
			try {
				LoginPage lp = new LoginPage(driver);
				Assert.assertTrue(lp.invalidCredDisplayed());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

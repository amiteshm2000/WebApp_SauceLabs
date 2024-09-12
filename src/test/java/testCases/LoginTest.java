package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginTest extends BaseClass{

		@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
		public void loginVerification(String username, String password, String credData) {
			LoginPage lp=new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(password);
			lp.clickLoginButton();
			DashboardPage db= new DashboardPage(driver);
		if(credData=="valid") {
		try{
			Assert.assertTrue(db.isDashboardDisplayed());
//			db.clickMenuButton();
//			db.logout();
		}
		catch(Exception e){
			System.out.println(e);
			}
		}
		else if(credData=="invalid") {
			try{
				Assert.assertTrue(lp.invalidCredDisplayed());
			}
			catch(Exception e){
				System.out.println(e);
				}
			}
		}
}

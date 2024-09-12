package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class AddToCart extends LoginTest{
	
	@Test(dataProvider="ItemData", dataProviderClass=DataProviders.class)
	public void addToCart(String username, String password, String credData, String items) {
		LoginTest lt= new LoginTest();
		lt.loginVerification(username, password, credData);
		String[] item=items.split(",");
		System.out.println(item.toString());
		
		}
	}

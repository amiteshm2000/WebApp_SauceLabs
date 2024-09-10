package testCases;

import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class AddUser extends BaseClass{

	public AddUser() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void addUser() {
//		LoginTest login = new LoginTest();
//		login.loginVerification("Admin", "admin123", "valid");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLoginButton();
		
		AdminPage ad= new AdminPage();
		ad.clickAdmin();
		ad.clickAddButton();
		ad.setUserRole("Admin");
		ad.setEmpName("William  Arias");
		ad.setStatus("Enabled");
		ad.setUserName("amitesh");
		ad.setPassword("qwerty1234");
		ad.setConfirmPassword("qwerty1234");
		ad.clickSave();
	}
}

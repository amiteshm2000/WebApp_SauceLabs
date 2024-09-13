package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass()
	public void launch() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.saucedemo.com/");
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
//	login to the application 
	public void login(String username, String password, String credData) {
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLoginButton();
		DashboardPage db= new DashboardPage(driver);
		Assert.assertTrue(db.isDashboardDisplayed());
		}
	
//	logout from the application
	public void logout() {
		DashboardPage db= new DashboardPage(driver);
		if(db.isDashboardDisplayed()) {
			db.clickMenuButton();
			db.logout();		
		}
	}
}

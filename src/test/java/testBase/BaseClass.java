package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public BaseClass() {
		// TODO Auto-generated constructor stub
	}

	@BeforeClass()
	public void login() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
//	@AfterClass
//	public void close() {
//		driver.quit();
//	}
	
	public void logout() {
		DashboardPage db= new DashboardPage(driver);
		if(db.isDashboardDisplayed()) {
			db.clickUserDetail();
			db.logout();		
		}
	}
}

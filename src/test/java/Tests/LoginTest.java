package Tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginSearch;

public class LoginTest  {
    
	static WebDriver driver=null;
	
	
	@Test
	public static void actualTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\POM_Framework\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		LoginSearch login = new LoginSearch(driver);
		login.EnterTextInUser("Admin");
		login.EnterTextInPass("admin123");
		login.ClickOnLogin();
		driver.close();
		Thread.sleep(3000);
		
		
	}
	
	
	

}

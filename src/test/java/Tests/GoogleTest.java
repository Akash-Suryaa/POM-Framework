package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearch;

public class GoogleTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		
		 ActualTest();
	}

	public static void ActualTest() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\eclipse-workspace\\POM_Framework\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		GoogleSearch search = new GoogleSearch(driver);
		search.EnterText();
		search.ClickOnSearch();
		
		driver.close();
		
		System.out.println("Test passed");
	}
	
	
	
}

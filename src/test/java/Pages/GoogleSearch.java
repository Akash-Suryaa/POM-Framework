package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	
	WebDriver driver=null;
	
	By txt_Username = By.name("q");
	
	By btn_Search = By.name("btnK");
	
	public GoogleSearch(WebDriver driver) {
		this.driver= driver;
		
	}
	
	public void EnterText() {
		
		driver.findElement(txt_Username).sendKeys("wwe");
		
	}
	
	public void ClickOnSearch() {
		driver.findElement(btn_Search).sendKeys(Keys.RETURN);
		
	}
	
	
	
	
	
	
	
	

}

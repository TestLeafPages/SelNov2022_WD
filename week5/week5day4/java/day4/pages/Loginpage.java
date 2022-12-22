package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class Loginpage extends BaseClass {

	
	public Loginpage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public Loginpage  enteruserName(String userName) {
		
		
		driver.findElement(By.id("username")).sendKeys(userName);
		return this;
	}
	
	
public Loginpage  enterpassword(String passWord) {
	driver.findElement(By.name("PASSWORD")).sendKeys(passWord);
return this;
	}
	
public HomePage  clickonLoginbutton() {
	driver.findElement(By.className("decorativeSubmit")).click();

	return new HomePage(driver);
}
	
	
}

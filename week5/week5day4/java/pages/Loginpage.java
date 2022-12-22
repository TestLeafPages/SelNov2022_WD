package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class Loginpage extends BaseClass {

	
	public Loginpage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public Loginpage  enteruserName() {
		
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		return this;
	}
	
	
public Loginpage  enterpassword() {
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
return this;
	}
	
public HomePage  clickonLoginbutton() {
	driver.findElement(By.className("decorativeSubmit")).click();

	return new HomePage(driver);
}
	
	
}

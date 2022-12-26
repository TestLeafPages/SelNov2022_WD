package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Loginpage extends BaseClass {


	
	@And ("Enter the username as {string}")
	public Loginpage  enteruserName(String userName) {
		
		
		getDriver().findElement(By.id("username")).sendKeys(userName);
		return this;
	}
	
	@And ("Enter the password as {string}")
public Loginpage  enterpassword(String passWord) {
		
		getDriver().findElement(By.name("PASSWORD")).sendKeys(passWord);
return this;
	}
	
	@When ("Click on LoginButton")
public HomePage  clickonLoginbutton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();

	return new HomePage();
}
	
	
}

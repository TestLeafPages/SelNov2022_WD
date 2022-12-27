package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Loginpage extends BaseClass {


	
	@And ("Enter the username as {string}")
	public Loginpage  enteruserName(String userName) throws IOException {
		
		
		try {
			getDriver().findElement(By.id("username")).sendKeys(userName);
			reportStep("username enter successful", "Pass");
		} catch (Exception e) {
			reportStep("username enter not successful", "Fail");
		}
		return this;
	}
	
	@And ("Enter the password as {string}")
public Loginpage  enterpassword(String passWord) throws IOException {
		
		try {
			getDriver().findElement(By.name("PASSWORD")).sendKeys(passWord);
			reportStep("password enter successful", "Pass");
		} catch (Exception e) {
			reportStep("password not enter successful", "Fail");
		}
return this;
	}
	
	@When ("Click on LoginButton")
public HomePage  clickonLoginbutton() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmi")).click();
			reportStep("login successful", "Pass");
		} catch (Exception e) {
			
			reportStep("login not successful", "Fail");
			
		}

	return new HomePage();
}
	
	
}

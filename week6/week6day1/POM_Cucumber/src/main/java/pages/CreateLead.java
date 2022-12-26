package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	

	@And ("Enter the CompanyName as (.*)$")
	public CreateLead enterCompanyName(String comName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
		return this;
	}
	
	@And ("Enter the FristName as (.*)$")
public CreateLead enterFirstName(String Fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
	return this;
	}

	@And ("Enter the LastName as (.*)$")
public CreateLead enterLastName(String Lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	return this;
}

	
	@When ("Click on Submit Button")
public viewLead clickonCreateButton() {
		getDriver().findElement(By.name("submitButton")).click();
return new viewLead();
}
}

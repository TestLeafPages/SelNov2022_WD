package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead enterCompanyName(String comName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
		return this;
	}
	
public CreateLead enterFirstName(String Fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
	return this;
	}

public CreateLead enterLastName(String Lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	return this;
}

public viewLead clickonCreateButton() {
	driver.findElement(By.name("submitButton")).click();
return new viewLead(driver);
}
}

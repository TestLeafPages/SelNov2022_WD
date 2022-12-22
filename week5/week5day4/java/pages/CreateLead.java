package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	
public CreateLead enterFirstName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
	return this;
	}

public CreateLead enterLastName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	return this;
}

public viewLead clickonCreateButton() {
	driver.findElement(By.name("submitButton")).click();
return new viewLead(driver);
}
}

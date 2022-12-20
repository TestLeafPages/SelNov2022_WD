package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadStep extends BaseClass{
	
	@Given ("Click on CRMSFA Link")
	public void clickCrmsaf() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	
	@And ("Click on Leads Button")
public void clickonLeadbutton() {
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@And ("Click on CreateLead Button")
public void clickonCreateLead() {
		driver.findElement(By.partialLinkText("Create")).click();

	}
	@And ("Enter the CompanyName as (.*)$")
public void entertheCompanyName(String Company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);

	}
	@And ("Enter the FristName as (.*)$")
public void entertheFristName(String Fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);

	}
	@And ("Enter the LastName as (.*)$")
public void entertheLast(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);

	}
	
	@When ("Click on Submit Button")
public void clickonsubmit() {
		driver.findElement(By.name("submitButton")).click();

	}
}

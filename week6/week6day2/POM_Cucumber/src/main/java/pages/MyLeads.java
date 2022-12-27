package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.And;

public class MyLeads extends BaseClass {
	
	


	
	
	@And ("Click on CreateLead Button")
	public CreateLead clickonCreateLead() {
		getDriver().findElement(By.partialLinkText("Create")).click();
		
		return new CreateLead();
	}
}

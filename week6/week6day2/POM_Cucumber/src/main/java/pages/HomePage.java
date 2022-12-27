package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass{

	

	
	@Then ("Verify that login successful")
	public HomePage verifypage() {
		
		String exptTittle="Leaftaps - TestLeaf Automation Platform";
		String acctTittle=getDriver().getTitle();
		
		Assert.assertEquals(acctTittle, exptTittle);
		System.out.println("Leaftaps - TestLeaf Automation Platform");
		
		return this;
	}
	
	@Given ("Click on CRMSFA Link")
	public MyHomePage clickOnCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
}

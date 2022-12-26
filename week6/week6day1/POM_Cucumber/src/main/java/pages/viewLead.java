package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import baseclass.BaseClass;
import io.cucumber.java.en.And;

public class viewLead extends BaseClass{
	

	
	@And ("Verify Page")
	public viewLead checkName() {
		String text = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		String actName=text;
		String expName="Dilip";
		Assert.assertEquals(actName, expName);
		
		return this;
	}
}

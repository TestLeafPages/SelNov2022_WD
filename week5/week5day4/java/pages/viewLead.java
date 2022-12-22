package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class viewLead extends BaseClass{
	
	public viewLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public viewLead checkName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		String actName=text;
		String expName="Dilip";
		Assert.assertEquals(actName, expName);
		
		return this;
	}
}

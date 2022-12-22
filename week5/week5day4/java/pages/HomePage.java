package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{

	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public HomePage verifypage() {
		
		String exptTittle="Leaftaps - TestLeaf Automation Platform";
		String acctTittle=driver.getTitle();
		
		Assert.assertEquals(acctTittle, exptTittle);
		System.out.println("Leaftaps - TestLeaf Automation Platform");
		
		return this;
	}
	
	
	public MyHomePage clickOnCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeads extends BaseClass {
	
	
	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead clickonCreateLead() {
		driver.findElement(By.partialLinkText("Create")).click();
		
		return new CreateLead(driver);
	}
}

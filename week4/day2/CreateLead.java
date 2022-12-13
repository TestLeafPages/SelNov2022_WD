package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BasicClass {
	

	
		@Test()
	public  void runCreateLead() {
		//We have to call WDM for the browser driver!!
		

	
	
		//click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Give values
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dk");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tester");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@hcl.com");
		
		driver.findElement(By.name("submitButton")).click();

		//verify the view leads page
		String title=driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("sucessully added lead");
		}

		
		
	}
		

}


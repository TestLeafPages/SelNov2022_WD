package failedtest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RetryFailedTestCase extends BasicClass {

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
		driver.findElement(By.id("createLeadForm_companyNam")).sendKeys("TestLeaf");

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

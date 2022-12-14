package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataprovider.BasicClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BasicClass {

	//packagename.classname.methodname
	@Test(dependsOnMethods="week4.day2.CreateLead.runCreateLead")
	public  void runDuplicateLead() {
		
	
		//click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Give values
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Tester");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@hcl.com");
		
		driver.findElement(By.name("submitButton")).click();

		//verify the view leads page
		String title=driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("sucessully added lead");
			
			
		}
		
		//Duplicate Lead
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				//Give new values
				WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
				companyname.clear();
				companyname.sendKeys("hcl");
				
				WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
				firstname.clear();
				firstname.sendKeys("Dilipkumar");
				
				driver.findElement(By.name("submitButton")).click();

				//verify the view leads page
				String titles=driver.getTitle();
				if(titles.equals("View Lead | opentaps CRM"))
				{
					System.out.println("sucessully duplicated lead");
				}
				
				driver.close();

	}

}

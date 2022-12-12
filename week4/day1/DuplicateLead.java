package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	
	@Test
	public  void runDuplicateLead() {
		//We have to call WDM for the browser driver!!
		WebDriverManager.chromedriver().setup();

		//Launch the browser(chrome)
		ChromeDriver driver=new ChromeDriver();

		//Load the url
		driver.get("http://leaftaps.com/opentaps");

		//Maximize the browser
		driver.manage().window().maximize();

		//inspect user name and send username text
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//inspect password and send password text
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();

	
	
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

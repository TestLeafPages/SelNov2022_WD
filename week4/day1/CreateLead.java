package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	
public	ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();

		//Launch the browser(chrome)
		driver=new ChromeDriver();

		//Load the url
		driver.get("http://leaftaps.com/opentaps");

		//Maximize the browser
		driver.manage().window().maximize();

		//inspect user name and send username text
		driver.findElement(By.id("username")).sendKeys("DemoCsr");

		//inspect password and send password text
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
	}
	
	
	
	@Test
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

		
		
	}
		@AfterMethod
		public void postcondition() {
			
			driver.close();
			
		}

}


package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	
	@Test
	public  void runEditLead() {

		//We have to call WDM for the browser driver!!
				WebDriverManager.chromedriver().setup();

				//Launch the browser(chrome)
				ChromeDriver driver=new ChromeDriver();

				//Load the url
				driver.get("http://leaftaps.com/opentaps");

				//Maximize the browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
				
				//click find leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Find first name field and give values
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Dilip");
				
				//click find lead
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//click on first displayed name
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
				
				//verify the view leads page
				String titles=driver.getTitle();
				if(titles.equals("View Lead | opentaps CRM"))
				{
					System.out.println(titles);
				}
				
				//edit with new company name
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
			
				
				WebElement company=driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
				company.clear();
				company.sendKeys("HCL");
				
				driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
				
				//verify new company name
				WebElement newcompany=driver.findElement(By.id("viewLead_companyName_sp"));
				String newcompanytext=newcompany.getText();
				
				if(newcompanytext.contains("HCL"))
				{
					System.out.println("Successfully edited company name as HCL");
				}
				
				driver.close();

	}

}

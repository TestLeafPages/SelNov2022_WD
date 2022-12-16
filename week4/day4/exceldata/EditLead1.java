package exceldata;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.BasicClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead1  extends BasicClass1{

	@BeforeTest
	public void values() {
		datafile="EditLead";
	}
	
	
	@Test(dataProvider="fetch")
	public  void runEditLead(String name,String ucn) {

		
				//click CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//click leads tab
				driver.findElement(By.linkText("Leads")).click();
				
				//click find leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Find first name field and give values
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(name);
				
				//click find lead
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//click on first displayed name
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
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
				company.sendKeys(ucn);
				
				driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
				
				//verify new company name
				WebElement newcompany=driver.findElement(By.id("viewLead_companyName_sp"));
				String newcompanytext=newcompany.getText();
				
				if(newcompanytext.contains("HCL"))
				{
					System.out.println("Successfully edited company name as HCL");
				}
				
				

	}

}

package exceldata;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.BasicClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1 extends BasicClass1 {
	
	/*
	 * method calling excel
	 * return data
	 * 
	 * 
	 * 
	 * 
	 */
	@BeforeTest
	public void data1() {
		datafile="CreateLead";
	}

	
		@Test(dataProvider="fetch")
	public  void runCreateLead(String compn,String fname,String lname,String mid) {
		//We have to call WDM for the browser driver!!
		

	
	
		//click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead tab
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Give values
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compn);

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(mid);
		
		driver.findElement(By.name("submitButton")).click();

		//verify the view leads page
		String title=driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("sucessully added lead");
		}

		
		
	}
		

}


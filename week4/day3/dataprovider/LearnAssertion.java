package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {


	@Test()
	public  void verify() {
		
		//actual result
		String exptitle="Leaftaps - TestLeaf Automation Platform";
		//We have to call WDM for the browser driver!!
		
		WebDriverManager.chromedriver().setup();

		//Launch the browser(chrome)
	ChromeDriver	driver=new ChromeDriver();

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
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//hard assertion
		
		Assert.assertEquals(exptitle, title);
		
	
		
		/*
		 * if(title.equals(exptitle)) { System.out.println("matched"); }else {
		 * System.out.println("not matched"); }
		 */
		
		
		//click CRM/SFA
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			//	driver.findElement(By.linkText("CRM/SFA")).click();
	
		
		//	Assert.assertTrue(displayed);//--->it will check condition -->itwork 
		
		
		
		Assert.assertFalse(displayed);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	
	
	
		
		
}

package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSoftAssert {
	
	@Test()
	public  void verify() {
		//actual result
		
		
			String exptitle=" TestLeaf Automation Platform";
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
			
			//softassert
			SoftAssert sa= new SoftAssert();
			
		sa.assertEquals(exptitle, title);
		driver.findElement(By.linkText("CRM/SFA")).click();
			sa.assertAll();
			
		driver.close();
			
			
		
			
			
			
}
}

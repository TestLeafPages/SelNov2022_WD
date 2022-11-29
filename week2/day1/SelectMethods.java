package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//lintest
		driver.findElement(By.linkText("Leads")).click();
		
		//PARTIAL LINK TEXT
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dilip");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		
		
		WebElement sele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		
		//select class
		
		Select sat= new Select(sele);
		
		sat.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
	}

}

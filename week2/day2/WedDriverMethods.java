package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WedDriverMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//gettitle method
		String title = driver.getTitle();
		System.out.println(title);
		
		String uSERNAME = driver.findElement(By.id("username")).getAttribute("attribute_value");
		System.out.println(uSERNAME);
		
		//Attribute based xPath
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
		//Partial Attribute based
				//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
				
				//index based
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
				
				//Attribute based xPath
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				
				
				
				
				String text2 = driver.findElement(By.tagName("h2")).getText();
				
				System.out.println(text2);
				
				//partial text based xpath
				
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				
				
				
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				String text = driver.findElement(By.xpath("//div[contains(@class,'col-partyId')]/a")).getText();
				
				System.out.println(text);
				
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
				
				
				driver.close();
	}
	
	

}

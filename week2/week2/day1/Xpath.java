package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		//Attribute based xPath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
//Partial Attribute based
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		
		//index based
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		//Attribute based xPath
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		
		//partial text based xpath
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}

}

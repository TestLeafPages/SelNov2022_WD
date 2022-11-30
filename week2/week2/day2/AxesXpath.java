package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxesXpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//p to c
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");

		//c to p
		//driver.findElement(By.xpath("input[@id='password']/parent::p")).sendKeys("crmsfa");
		
		//gp to gc
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		
		
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		
		
	}

}

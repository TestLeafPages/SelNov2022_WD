package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implictwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("https://www.facebook.com/");

		//selenium wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.manage().window().maximize();
		//Create New Account
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//java wait
		//Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("dilip");
	}

}

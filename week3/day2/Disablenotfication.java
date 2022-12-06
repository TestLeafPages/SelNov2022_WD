package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disablenotfication {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		
		//disable notiofication
		
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver= new ChromeDriver(option);
		
	//load url
		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[4]/td[5]")).click();
		Thread.sleep(2000);
WebElement cli = driver.findElement(By.id("search_btn"));
//js click
driver.executeScript("arguments[0].click();", cli);
	}

}

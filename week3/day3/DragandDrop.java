package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//form:drop_header
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
	//load url
		driver.get("https://www.leafground.com/drag.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		WebElement drop= driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		
		Actions obj= new Actions(driver);
		
		
		obj.dragAndDrop(drag, drop).perform();	
		
		
		
		
		
		
		
		
		
	}

}

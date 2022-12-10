package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
	//load url
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().frame("iframeResult");
		
		WebElement doul = driver.findElement(By.xpath("//p[contains(text(),'paragraph')]"));
		
		Thread.sleep(3000);
		Actions obj= new Actions(driver);
		
		obj.doubleClick(doul).perform();
	}

}

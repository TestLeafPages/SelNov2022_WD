package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClickandHold {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
	//load url
		driver.get("https://jqueryui.com/selectable/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		WebElement ifr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(ifr);
		
		
		
		WebElement it1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement it3 = driver.findElement(By.xpath("//li[text()='Item 3']"));

		WebElement it5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		
		WebElement it2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		Actions obj= new Actions(driver);
		
		
		obj.keyDown(Keys.CONTROL).click(it1).pause(Duration.ofSeconds(1))
		.click(it3).pause(Duration.ofSeconds(1)).click(it5).
		pause(Duration.ofSeconds(1)).click(it2).
		keyUp(Keys.CONTROL).perform();
		
	}

}

package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnnestedFrame {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	//step2 launch browser
	ChromeOptions option= new ChromeOptions();
	option.addArguments("-disable-notifications");
	ChromeDriver driver= new ChromeDriver(option);
	
//load url
	driver.get("https://www.leafground.com/frame.xhtml");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
	
	WebElement fis = driver.findElement(By.xpath("//h5[contains(text(),' Nested')]/following-sibling::iframe"));
	
	//parent frame
	driver.switchTo().frame(fis);
	
	//child frame
	driver.switchTo().frame("frame2");
	
	
	
	driver.findElement(By.xpath("//button[@id='Click']")).click();
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().defaultContent();//----1st frame

}
}

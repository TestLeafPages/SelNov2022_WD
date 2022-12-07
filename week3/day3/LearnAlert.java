package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
	//load url
		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		
		//simple alert
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//accept
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		//confirm alert
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		driver.switchTo().alert().dismiss();
		
		String text2 = driver.findElement(By.id("result")).getText();
		//result
		System.out.println(text2);
		
		
		//prompt alert
		
		
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt104']/span)[2]")).click();
		
		driver.switchTo().alert().sendKeys("test leaf");
		driver.switchTo().alert().accept();
		
		String text3 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text3);
		
	}

}

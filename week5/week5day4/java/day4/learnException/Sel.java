package learnException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			//step2 launch browser
			ChromeDriver driver= new ChromeDriver();
			
		//load url
			driver.get("https://www.facebook.com/");

			//selenium wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			driver.manage().window().maximize();
			//Create New Account
			
			try {
				driver.findElement(By.linkText("Create New Accoun")).click();
			} catch (Exception e) {
				System.out.println(e);
				driver.findElement(By.linkText("Create New Account")).click();
			}
			
			
			Thread.sleep(2000);
			
			WebElement firstname = driver.findElement(By.name("firstname"));
			
			try {
				firstname.sendKeys("Dilip");
			} catch (Exception e) {
				System.out.println(e);
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
				wait.until(ExpectedConditions.stalenessOf(firstname));
				firstname.sendKeys("Dk");
			}
		}
	}



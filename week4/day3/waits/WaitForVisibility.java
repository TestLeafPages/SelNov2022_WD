package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForVisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0tmh77ab8r4y2si39mosyn8i9469703.node0");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//visiblitywait
//		driver.findElement(By.xpath("//span[text()='Click']")).click();
//		
//		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(1));
//		WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
//		String text = until.getText();
//		S
//		System.out.println(text);
//		
		
		
		//invisiblewait
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement display = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOf(display));
		
	//	wait.until(ExpectedConditions.numberOfWindowsToBe(2))
	}

}

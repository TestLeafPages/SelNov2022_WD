package week3.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearningList {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("https://www.facebook.com/login/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
//		List<WebElement> links2 = driver.findElements(By.tagName("a"));
//		
//		int link2 = links2.size();
//		System.out.println("total num of link "+ link2);
	
//		
//		for (int i = 0; i < links2.size(); i++) {
//			
//			WebElement word = links2.get(i);
//			String text = word.getText();
//			System.out.println(text);
//			
//		}
		
	File scr = driver.getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:/WeekDayBatch2/Java/snaps/link1.png");
	
	FileUtils.copyFile(scr, dest);
		
		Thread.sleep(2000);
		driver.close();

	}

}

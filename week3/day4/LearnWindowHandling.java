package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
			
			WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.leafground.com/window.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//click button
		
		driver.findElement(By.xpath("//h5[contains(text(),'Window Opens')]/following-sibling::button")).click();

		//getWindowHandle()---its hold one data
		String pwindowHandle = driver.getWindowHandle();
		System.out.println(pwindowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> windows=new ArrayList<String>(windowHandles);
		//.out.println(windows);
		
		System.out.println("total number window present: "+windows.size());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//using get method 
		driver.switchTo().window(windows.get(1));
		
		//3rd window open by 2nd window
		//driver.findElement(By.xpath(""));
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		List<String> windows1=new ArrayList<String>(windowHandles1);
		
		
		String title2 = driver.getTitle();
		System.out.println("second window name : "+title2);
		
		driver.switchTo().window(windows.get(0));
		
		driver.close();
		
		//driver.switchTo().window(windows.get(0));
		//no such window exception
		
	}

}

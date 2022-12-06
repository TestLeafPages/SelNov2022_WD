package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("https://erail.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("ms",Keys.ENTER);
		
		
		
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		Thread.sleep(2000);
		to.sendKeys("co",Keys.ENTER);
		
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		int size = names.size();
		System.out.println(size);

		
		List<String> trainsName =new ArrayList<String>();
		
		for (WebElement trains : names) {
			trainsName.add(trains.getText());
			
			System.out.println(trains.getText());
		}
			
			Set<String> tr= new LinkedHashSet<String>(trainsName);
			
			int size2 = tr.size();
			System.out.println(size2);
			
			if(size==size2) {
				System.out.println("no duplicates found");
			}else {
				System.out.println("duplicates found");
			}
			
		
		
		
	}

}

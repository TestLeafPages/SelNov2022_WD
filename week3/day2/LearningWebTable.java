package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//step2 launch browser
		ChromeDriver driver= new ChromeDriver();
		
	//load url
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node01jcq471uwcapfdf56lqa3civu448469.node0");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("one data :"+text);
		
		System.out.println("-------------------------------------------------");
		
		
		String text2 = driver.findElement(By.xpath("(//div[@class='ui-datatable-scrollable-body']/table//tr[1])[2]")).getText();
		
         System.out.println("print row values :"+text2);
System.out.println("----------------------------------------");

List<WebElement> data = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr/td[1]"));

int size = data.size();

System.out.println(size);


List<WebElement> data1 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[1]/td"));
int size2 = data1.size();
System.out.println(size2);


for(int i=1;i<=size;i++) {
for(int j=1;j<=size2;j++) {
	

	String text3 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr["+i+"]/td["+j+"]")).getText();
	
System.out.println(text3);
}
}

//for (WebElement webElement : data) {
//	String text3 = webElement.getText();
//	System.out.println(text3);
//}
driver.close();
	}

}

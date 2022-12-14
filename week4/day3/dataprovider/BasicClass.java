package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicClass {
	
	public	RemoteWebDriver driver;

	@Parameters({"browser","url","username","password"})
	
	@BeforeMethod
	public void precondition( String browser,String url,String username,String password) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		

		//Load the url
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Maximize the browser
		driver.manage().window().maximize();

		//inspect user name and send username text
		driver.findElement(By.id("username")).sendKeys(username);

		//inspect password and send password text
		driver.findElement(By.id("password")).sendKeys(password);

		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
	}
	
	@AfterMethod
	public void postcondition() {
		
		driver.close();
		
	}
}

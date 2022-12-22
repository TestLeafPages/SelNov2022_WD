package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDataCreateLead;

public class BaseClass {

	//for parallel run
	public  ChromeDriver driver;
	public String datafile;
	//
	

	@DataProvider(name="fetch",indices= {0})
	public String[][] fetchData() throws IOException {//row,clo
		String[][] data = ReadDataCreateLead.read(datafile);
		return data;
	}
//public static ChromeDriver driver;
	
	@BeforeMethod
	//@Given ("launch the browse and url and maximize")
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	

	
	
	
	
	
}

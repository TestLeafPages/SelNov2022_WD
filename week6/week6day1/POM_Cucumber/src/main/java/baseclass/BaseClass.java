package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDataCreateLead;

public class BaseClass extends AbstractTestNGCucumberTests {

	//for parallel run
private static final ThreadLocal<RemoteWebDriver> remote=new ThreadLocal<RemoteWebDriver>();
	public String datafile;
	//
	
	//using setter
	
	public void set() {
		remote.set(new ChromeDriver());
	}
	
	//Using getter
	
	public RemoteWebDriver getDriver() {
		return remote.get();
	}
	
	

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
		set();
		
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().manage().window().maximize();
		
	}
	
	@AfterMethod
	public void postcondition() {
		getDriver().close();
	}
	

	
	
	
	
	
}

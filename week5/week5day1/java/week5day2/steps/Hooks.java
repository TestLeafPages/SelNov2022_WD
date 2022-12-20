package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	//public static ChromeDriver driver;
	
	@Before
	@Given ("launch the browse and url and maximize")
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	
	@After
	public void postcondition() {
		driver.close();
	}
}

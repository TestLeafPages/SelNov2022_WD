package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDef {

	public ChromeDriver driver;
	
	@Given ("launch the browse and url and maximize")
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	
	@And ("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	
	@And ("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.name("PASSWORD")).sendKeys(password);

	}
	
	
	@When ("Click on LoginButton")
	public void clickLogin(){
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	
	@Then ("Verify that login successful or not")
	public void verifyMsg() {
		System.out.println("successful");
	}
	
	
	@But ("Verify that login successful1 or not")
	public void mas() {
		System.out.println("not successful");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

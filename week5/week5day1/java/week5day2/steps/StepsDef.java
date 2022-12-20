package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDef extends BaseClass {

	
//	
//	@Given ("launch the browse and url and maximize")
//	public void precondition() {
//		
//		WebDriverManager.chromedriver().setup();
//		
//		 driver= new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		
//	}
	
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
	
	
	@Then ("Verify that login successful")
	public void verifyMsg() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("home page displayed");
	}
	
	
//	@But ("Verify that login successful1 or not")
//	public void mas() {
//		boolean displayed1 = driver.findElement(By.id("errorDiv")).isDisplayed();
//		Assert.assertTrue(displayed1);
//		System.out.println("home not displayed");
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

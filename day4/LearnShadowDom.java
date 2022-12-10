package week3.day4;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class LearnShadowDom {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	//step2 launch browser
	ChromeOptions option= new ChromeOptions();
	option.addArguments("-disable-notifications");
	ChromeDriver driver= new ChromeDriver(option);
	driver.get("https://www.leafground.com/window.xhtml");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	
	
	//shadow root====shadowdom
		Shadow sh= new Shadow(driver);
		sh.findElementByXPath("//span[text()='Learning']").click();
		
		

	}

}

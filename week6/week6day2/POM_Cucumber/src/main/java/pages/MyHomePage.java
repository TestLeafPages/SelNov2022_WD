package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.And;

public class MyHomePage extends BaseClass {


	
	@And ("Click on Leads Button")
	public MyLeads clickLeadsButon() {
		getDriver().findElement(By.linkText("Leads")).click();
		
		
		return new MyLeads();
	}
}

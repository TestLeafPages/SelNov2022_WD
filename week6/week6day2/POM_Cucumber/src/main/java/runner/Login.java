package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.Loginpage;

public class Login extends BaseClass {

	
	@BeforeTest
	public void setData() {
		testCase="Login page";
		testDescripition="using extentreport to get result";
		testAuthor="Dilip";
		testCategory="sanity";
	}
	
	@Test
	public void rundata() throws IOException {
		
		Loginpage lp= new Loginpage();
		
		lp.enteruserName("Demosalesmanager").enterpassword("crmsfa").clickonLoginbutton()
		.clickOnCrmsfa();
		
		}
}

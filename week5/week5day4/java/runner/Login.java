package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Loginpage;

public class Login extends BaseClass {

	
	@Test
	public void rundata() {
		
		Loginpage lp= new Loginpage(driver);
		
		lp.enteruserName().enterpassword().clickonLoginbutton()
		.clickOnCrmsfa();
		
		}
}

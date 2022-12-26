package runner;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.Loginpage;

public class Login extends BaseClass {

	
	@Test
	public void rundata() {
		
		Loginpage lp= new Loginpage();
		
		lp.enteruserName("Demosalesmanager").enterpassword("crmsfa").clickonLoginbutton()
		.clickOnCrmsfa();
		
		}
}

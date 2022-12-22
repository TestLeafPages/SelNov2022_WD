package runner;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Loginpage;

public class Createlead extends BaseClass{

	
	
	@Test
	public void leads() {
		
		Loginpage lp=new Loginpage(driver);
		
		lp.enteruserName().enterpassword().clickonLoginbutton().verifypage()
		.clickOnCrmsfa().clickLeadsButon().clickonCreateLead()
		.enterCompanyName().enterFirstName().enterLastName().clickonCreateButton()
		.checkName();
	}
	
	
	
}

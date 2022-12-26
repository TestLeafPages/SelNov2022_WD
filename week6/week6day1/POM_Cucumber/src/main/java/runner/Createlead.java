package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.Loginpage;

public class Createlead extends BaseClass{

	
	@BeforeTest
	public void setValues() {
		datafile="CreateLead";
	}
	
	
	@Test(dataProvider="fetch")
	public void leads(String comName,String Fname,String Lname ) {
		
		Loginpage lp=new Loginpage();
		
		lp.enteruserName("Demosalesmanager").enterpassword("crmsfa").clickonLoginbutton().verifypage()
		.clickOnCrmsfa().clickLeadsButon().clickonCreateLead()
		.enterCompanyName(comName)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickonCreateButton()
		.checkName();
	}
	
	
	
}

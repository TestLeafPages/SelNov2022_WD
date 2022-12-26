package extentreport;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	@Test
	public void reportdata() throws IOException {
		/*ExtentHtmlreporter
ExtentReports
attach reporter
ExtentTest
mediaenititybuilder
		 * Steps:
			======
			1.Setup Physical report path
			2.Create object for extentreports
			3.Attach data with physical file
			4.Create a testcase and assigned test details
			5.Steps level status
			6.Mandatory step to stop. */
		
		
		//1. Setup Physical report path
		
		ExtentHtmlReporter repo= new ExtentHtmlReporter("./result/report.html");
		
		repo.setAppendExisting(true);
		
		
		//2.Create object for extentreports
		ExtentReports extent=new ExtentReports();
		
		
		//3.Attach data with physical file
		extent.attachReporter(repo);
		
		//4.Create a testcase and assigned test details
		ExtentTest test=extent.createTest("CreateLead", "Details taken  from excel");
		
		test.assignCategory("smoke");
		test.assignAuthor("Dilip");
		
		//5.Steps level status
		
		test.pass("enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/dark_thumbnail2.png").build());
		test.pass("enter password");
		test.pass("login");
		
ExtentTest test1=extent.createTest("EditLead", "Details taken  from excel");
		
		test1.assignCategory("sanity");
		test1.assignAuthor("priya");
		
		//5.Steps level status
		
		test1.pass("enter username ",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/device_default_thumbnail2.png").build());
		test1.pass("enter password");
		test1.pass("login");
		
		//6.mandatory 
		
		extent.flush();
		System.out.println("done");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

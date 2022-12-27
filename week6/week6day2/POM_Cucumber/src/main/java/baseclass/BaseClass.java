package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDataCreateLead;

public class BaseClass extends AbstractTestNGCucumberTests {

	//for parallel run
private static final ThreadLocal<RemoteWebDriver> remote=new ThreadLocal<RemoteWebDriver>();
	public String datafile;
	public ExtentReports extent;
	public String testCase,testDescripition,testAuthor,testCategory;
	public static ExtentTest test;
	//using setter
	
	public void set() {
		remote.set(new ChromeDriver());
	}
	
	//Using getter
	
	public RemoteWebDriver getDriver() {
		return remote.get();
	}
	
	

	@DataProvider(name="fetch",indices= {0})
	public String[][] fetchData() throws IOException {//row,clo
		String[][] data = ReadDataCreateLead.read(datafile);
		return data;
	}

	@BeforeSuite
	public void startReport() {
	
				ExtentHtmlReporter repo= new ExtentHtmlReporter("./result/report.html");
				repo.setAppendExisting(true);
			 extent=new ExtentReports();
				extent.attachReporter(repo);
	}
	
	@BeforeClass
	public void testcaseDetils() {
	 test=extent.createTest(testCase,testDescripition );
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	public void reportStep(String message,String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			test.pass(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
			
			throw new RuntimeException("see the report for details");
		}
	}
	
	public int takeSnap() throws IOException {
		
		int random =(int) (Math.random()*9999999);

		File scr = getDriver().getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/img"+random+".png");
		FileUtils.copyFile(scr, dest);
		return random;
	}
	
	
	
	
	
	
	@BeforeMethod
	//@Given ("launch the browse and url and maximize")
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		set();
		
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		
	}
	
	
	
	@AfterMethod
	public void postcondition() {
		getDriver().close();
	}
	
	
	@AfterSuite
public void stopReport() {
	extent.flush();
}
	
	
	
	
	
}

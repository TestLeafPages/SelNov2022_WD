package testannoations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void create() {
	  System.out.println("create");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }
  @BeforeMethod
  public void beforeMethod1() {
	  System.out.println("beforeMethod1");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @AfterMethod
  public void afterMethod1() {
	  System.out.println("afterMethod1");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("cbeforeClassreate");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }
  
  @Test
  public void create1() {
	  System.out.println("create1");

  }
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}

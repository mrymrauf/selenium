package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestSession {
  @Test//6
  public void f() {
	  System.out.println("this is test annotation");
  }
  @BeforeMethod//5
  public void beforeMethod() {
	  System.out.println("this is before method annotation");
  }

  @AfterMethod//7
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }

  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("this is before class annotation");
  }

  @AfterClass//8
  public void afterClass() {
	  System.out.println("this is after class annotation");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("this is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	  System.out.println("this is before suite annotation");
  }

  @AfterSuite//9
  public void afterSuite() {
	  System.out.println("this is after suite annotation");
	  
  }
  
  //another test
  @Test
  public void test6() {
	  System.out.println("this is another test annotation");
	  
  }

}

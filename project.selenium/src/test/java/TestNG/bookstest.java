package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazon_pages.HomePage;
import Amazon_pages.books;
import common.utilities;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class bookstest extends utilities {
	
	//public static WebDriver driver;
  @Test //(priority = 1)
  public void f() throws InterruptedException {

	  HomePage home=new HomePage(driver);
	  home.BooksClick();
	  String ur= driver.getCurrentUrl();
	  System.out.println(ur);
	 
	  System.out.println("this is before assert");
	  SoftAssert sk=new SoftAssert();
	  sk.assertEquals(ur, "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books");
	  
	  //hardassert
	  //Assert.assertEquals(ur, "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books");
	  
	  System.out.println("this is after assert");
	  //books books=new books(driver);
	  //books.linkClick();
	  
	  
	  
	  //how to find no of links in a webpage
	  int links=driver.findElements(By.tagName("a")).size();
	  System.out.println("total number of links" + links);
	  sk.assertAll();
	  int homelinks=driver.findElements(By.linkText("Amazon Home")).size();
	  System.out.println("amazon home count=" + homelinks);

  }
  
  @Test (priority = 2, dependsOnMethods = "f")
  public void searchverification() {
	  HomePage home=new HomePage(driver);
	  home.logoclick();
	  home.searchbox();
	  home.searchclick();
  }
  
  
}

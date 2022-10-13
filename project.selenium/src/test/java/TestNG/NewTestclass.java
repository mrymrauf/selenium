package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class NewTestclass {
	public static WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.COMMAND).sendKeys("a").build().perform();
		ob.keyDown(Keys.COMMAND).sendKeys("c").build().perform();
		ob.keyUp(Keys.COMMAND);
		Thread.sleep(1000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(1000);
		ob.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		String ur= driver.getCurrentUrl();
		  System.out.println(ur);
		 
		  System.out.println("this is before assert");
		  SoftAssert sk=new SoftAssert();
		  sk.assertEquals(ur, "https://www.amazon.com/");
		  int links=driver.findElements(By.tagName("a")).size();
		  System.out.println("total number of links" + links);
		  sk.assertAll();
		  
		
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}

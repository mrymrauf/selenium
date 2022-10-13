package TestNG;

import org.testng.annotations.Test;

import com.train.org.project.selenium.edgebrowser;

import pizzahutpages.cartpage;
import pizzahutpages.cheesepizzapage;
import pizzahutpages.homepagepizza;
import pizzahutpages.newpizzapage;
import pizzahutpages.pizzapage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Pizzahuttest {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  homepagepizza hmpz=new homepagepizza(driver);
	  hmpz.menuclick();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  hmpz.pizzaclick();
	  pizzapage pzp=new pizzapage(driver);
	  pzp.cheesepizzaclick();
	  pzp.deliveryclick();
	  pzp.addressenter();
	  pzp.cityenter();
	  pzp.stateenter();
	  pzp.zipenter();
	  pzp.searchclick();
	  pzp.contclick();
	  newpizzapage npzp=new newpizzapage(driver);
	  Thread.sleep(1000);
	  npzp.cheesepclick();
	  cheesepizzapage cpzp=new cheesepizzapage(driver);
	  Thread.sleep(1000);
	  cpzp.crustclick();
	  Thread.sleep(1000);
	  cpzp.personalclick();
	  cpzp.addtocart();
	  cartpage ctp=new cartpage(driver);
	  ctp.cartclick();
	  edgebrowser edge=new edgebrowser();
	  edge.Screenshots();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.pizzahut.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

}

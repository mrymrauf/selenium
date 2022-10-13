package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class utilities {
  public WebDriver driver;
  @Parameters({"browser", "website"})
  
  @BeforeClass
  public void Ibrowsers(String NameOfBrowser, String wb) {
		if (NameOfBrowser.equalsIgnoreCase("Chrome")) {
			String jk=System.getProperty("user.dir");
			System.out.println(jk);
			System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.get(wb);
			driver.manage().window().maximize();
		}else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/maryam/Downloads/edgedriver");
			driver=new EdgeDriver();
			driver.get(wb);
		}
		}
/*
  @AfterClass
  
  public void afterClass() throws IOException {
	  Screenshots();
  }
	  public void Screenshots() throws IOException {
			Date objects=new Date();
			System.out.println(objects);
			String fff= objects.toString().replace(" ", "_").replace(":", "_");
			System.out.println(fff);
		File HomeStPage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(HomeStPage, new File("/Users/maryam/Desktop/" + fff + "home.jpg"));	
		}
  */
  

}

package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class edgebrowser {
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Ibrowsers("Chrome");
		String titles= driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]")).getText();
		System.out.println(titles);
		Thread.sleep(1000);
		
		//classscreenshot.Mscreenshots(driver, "home1.jpg");
	}
	public static void Ibrowsers(String NameOfBrowser) {
		if (NameOfBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "/Users/maryam/Downloads/edgedriver");
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com");
		}
	}
	public void Screenshots() throws IOException {
		Date objects=new Date();
		System.out.println(objects);
		String fff= objects.toString().replace(" ", "_").replace(":", "_");
		System.out.println(fff);
	File HomeStPage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(HomeStPage, new File("/Users/maryam/Desktop/" + fff + "home.jpg"));	
	}

}

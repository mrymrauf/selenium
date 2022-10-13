package com.train.org.project.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowShist {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//Thread.sleep(1000); //it's a java wait time
		//implicit wait:
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//expilicit wait:
		WebDriverWait oi=new WebDriverWait (driver, null);
		oi.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Books")));
		
		WebElement kindles=driver.findElement(By.linkText("Books"));
		//kindles.click();
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		kindles.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowhandle= driver.getWindowHandles();
		Iterator<String> iterator=windowhandle.iterator();
		String Firstwindowhandle=iterator.next();
		String Secondwindowhandle=iterator.next();
		driver.switchTo().window(Secondwindowhandle);
		//Thread.sleep(6000);
		WebElement confidence=driver.findElement(By.id("p13n-asin-index-0"));
		confidence.click();
		
	}

}

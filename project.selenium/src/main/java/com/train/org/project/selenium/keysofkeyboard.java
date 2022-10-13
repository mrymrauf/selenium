package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keysofkeyboard {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.COMMAND).sendKeys("a").build().perform();
		ob.keyDown(Keys.COMMAND).sendKeys("c").build().perform();
		ob.keyUp(Keys.COMMAND);
		Thread.sleep(1000);
		ob.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(1000);
		ob.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		
	}

}

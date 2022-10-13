package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flights {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com/Flights");
		driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@aria-label='Oct 6, 2022']")).click();
	
		driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();
	}

}

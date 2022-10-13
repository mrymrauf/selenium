package com.train.org.project.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pizzahut {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.pizzahut.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root jss30']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='MuiGrid-root MuiGrid-item'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='MuiGrid-root MuiGrid-item MuiGrid-zeroMinWidth MuiGrid-grid-xs-true'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6'])[2]")).click();
		driver.findElement(By.id("w2-address")).sendKeys("3742 wertz dr");
		driver.findElement(By.id("w2-city")).sendKeys("Woodbridge");
		driver.findElement(By.id("w2-state")).sendKeys("VA");
		driver.findElement(By.id("w2-zip")).sendKeys("22193");
		driver.findElement(By.xpath("(//*[@type='submit'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='MuiButton-label'])[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='MuiGrid-root MuiGrid-item MuiGrid-zeroMinWidth MuiGrid-grid-xs-true'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[@class='MuiIconButton-label'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@role='radio'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@data-testid=\"add-to-cart-button\"])")).click();
		//classscreenshot.Mscreenshots(driver, "pizza.jpg");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wording {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String titles= driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]")).getText();
		System.out.println(titles);
		WebElement title=driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]"));
		title.click();
		
	}

}

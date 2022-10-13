package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draged {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//iframes
		driver.switchTo().frame(0);
		WebElement dragedit=driver.findElement(By.id("draggable"));
		WebElement droped=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragedit, droped).build().perform();
		driver.switchTo().parentFrame();
		WebElement Resizeable=driver.findElement(By.linkText("Resizeable"));
		Resizeable.click();
		
	
		
		
	}

}

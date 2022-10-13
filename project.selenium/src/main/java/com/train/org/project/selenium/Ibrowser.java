package com.train.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ibrowser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/maryam/Downloads/chromedriver");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	//Thread.sleep(5000);
	//driver.navigate().refresh();
	driver.manage().window().maximize();
	//driver.navigate().back();
	//Thread.sleep(5000);
	//driver.navigate().forward();
	//String window=driver.getWindowHandle();
	//System.out.println(window);
	//String kl=driver.getCurrentUrl();
	//System.out.println(kl);
	//String title=driver.getTitle();
	//System.out.println(title);
	WebElement UserField= driver.findElement(By.id("email"));
	UserField.sendKeys("peopletech");
	WebElement PassField= driver.findElement(By.name("pass"));
	PassField.sendKeys("123456");
	//WebElement LoginButton=driver.findElement(By.name("login"));
	//LoginButton.click();
	//WebElement Forgot=driver.findElement(By.partialLinkText("Forgot password"));
	//WebElement Forgot=driver.findElement(By.partialLinkText("Forgot password"));
	//Forgot.click();
	WebElement CreateAnAccount=driver.findElement(By.linkText("Create new account"));
	CreateAnAccount.click();
	Thread.sleep(1000);
	WebElement firstname=driver.findElement(By.name("firstname"));
	firstname.sendKeys("Maryam");
	WebElement lastname=driver.findElement(By.name("lastname"));
	lastname.sendKeys("Rauf");
	WebElement mobnum=driver.findElement(By.name("reg_email__"));
	mobnum.sendKeys("1234567");
	WebElement pass=driver.findElement(By.name("reg_passwd__"));
	pass.sendKeys("123456");
	WebElement Month=driver.findElement(By.id("month"));
	Select obj=new Select(Month);
	obj.selectByIndex(10);
	WebElement day=driver.findElement(By.id("day"));
	Select object =new Select(day);
	object.selectByValue("29");
	WebElement saal=driver.findElement(By.id("year"));
	Select sobj=new Select(saal);
	sobj.selectByVisibleText("1993");
	//Thread.sleep(1000);
	//WebElement girl=driver.findElement(By.name("sex"));
	//girl.click();
	//WebElement sign=driver.findElement(By.name("websubmit"));
	//sign.click();
	Thread.sleep(1000);
	//absolute xpath
	WebElement male=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"));
	male.click();
	//relative xpath with grouping and indexing
	//WebElement sign=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	//sign.click();
	//text xpath and we also used and here instead of grouping and indexing
	WebElement sign=driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']"));
	sign.click();
	
	}

}

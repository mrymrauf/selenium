package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
WebDriver driver;

@FindBy(name="email") WebElement emailfield;
@FindBy(name="pass") WebElement password;
@FindBy(name="login") WebElement loginbutton;


public void emailfield(String name) {
	emailfield.sendKeys(name);
}

public void passwordfield(String pssword) {
	password.sendKeys(pssword);
}

public void loginbuttonclick() {
	loginbutton.click();
}

public home(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}

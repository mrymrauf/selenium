package pizzahutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {

	@FindBy(xpath="//*[@data-testid='header-cart']") WebElement cart;
	WebDriver driver;
	public void cartclick () {
		cart.click();
	}
	
	public cartpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

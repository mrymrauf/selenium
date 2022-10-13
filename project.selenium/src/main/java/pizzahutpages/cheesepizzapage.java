package pizzahutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cheesepizzapage {

	@FindBy(id="Q3J1c3Q=-header") WebElement crust;
	@FindBy(xpath="//*[@data-testid='option-personal']") WebElement personal;
	@FindBy(xpath="//*[@data-testid='add-to-cart-button']") WebElement atc;
	WebDriver driver;
	
	public void addtocart() {
		atc.click();
	}

	public void personalclick() {
		personal.click();
	}
	public void crustclick() {
		crust.click();
	}
	
	public cheesepizzapage( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}



package pizzahutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newpizzapage {

	@FindBy(xpath="//*[@data-testid='localized-menu-tile-cheese-pizza']") WebElement cheesep;
	WebDriver driver;
	public void cheesepclick() {
		cheesep.click();
	}
	
	public newpizzapage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

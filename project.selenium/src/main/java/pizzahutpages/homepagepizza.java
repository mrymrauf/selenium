package pizzahutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagepizza {
	WebDriver driver;
	@FindBy(id= "menu") WebElement menu;
	@FindBy(xpath= "(//*[@class='MuiGrid-root MuiGrid-item'])[1]") WebElement pizza;
	
	
	public void menuclick() {
		menu.click();
	}
	
	public void pizzaclick() {
		pizza.click();
	}

	
	public homepagepizza (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}



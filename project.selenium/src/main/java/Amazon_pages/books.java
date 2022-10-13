package Amazon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class books {
	@FindBy(id ="p13n-asin-index-0") WebElement link;

	WebDriver driver;
	
	public void linkClick() {
		link.click();
	}
	public books (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

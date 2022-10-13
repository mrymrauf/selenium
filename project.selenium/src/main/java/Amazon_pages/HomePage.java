package Amazon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Books") WebElement bk;
	@FindBy(id = "nav-logo-sprites") WebElement logo;
	@FindBy(id = "twotabsearchtextbox") WebElement search;
	@FindBy(id = "nav-search-submit-button") WebElement searching;
	
	private WebDriver driver;
	
	public void searchclick() {
		searching.click();
	}
	
	public void searchbox() {
		search.sendKeys("Computer");
	}
	
	public void logoclick() {
		logo.click();
	}
	
	public void BooksClick() {
		bk.click();
	}
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}

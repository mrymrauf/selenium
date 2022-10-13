package pizzahutpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pizzapage {
	@FindBy(xpath="//*[@data-testid='menu-tile-container-cheese-pizza']") WebElement cpizza;
	@FindBy(xpath="//*[@data-testid='delivery-occasion-tab']") WebElement delivery;
	@FindBy(id="w2-address") WebElement address;

	@FindBy(id="w2-city") WebElement city;
	@FindBy(id="w2-state") WebElement state;
	@FindBy(id="w2-zip") WebElement zip;
	@FindBy(xpath="//*[@data-testid='search']") WebElement search;
	@FindBy(xpath="//*[@data-testid='store-tile-btn-0']") WebElement cont;
	
	WebDriver driver;
	
	public void contclick() {
		cont.click();
	}
	
	public void searchclick() {
		search.click();
	}
	public void zipenter () {
		zip.sendKeys("22193");
	}
	public void stateenter() {
		state.sendKeys("VA");
	}
	public void cityenter() {
		city.sendKeys("woodbridge");
	}
	
	public void addressenter() {
		address.sendKeys("3742 wertz dr");
	}
	
	public void deliveryclick() {
		delivery.click();
	}
	
	public void cheesepizzaclick() {
		cpizza.click();
	}
	
	
	public pizzapage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}

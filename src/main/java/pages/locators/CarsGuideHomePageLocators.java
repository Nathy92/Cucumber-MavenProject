package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy(how= How.LINK_TEXT,using="buy + sell")
	public WebElement buySellLink;

	@FindBy(how= How.LINK_TEXT,using="reviews")
	public WebElement reviewsLink;
	
	@FindBy(how= How.LINK_TEXT,using="news")
	public WebElement newsLink;
	
	
	@FindBy(how= How.LINK_TEXT,using="advice")
	public WebElement adviceLink;
	
	
	@FindBy(how= How.LINK_TEXT,using="pricing + specs")
	public WebElement pricingSpecsLink;
	
	//INSIDE "SELL + LINK" DROPDOWN
	@FindBy(how= How.XPATH,using="//a[text()='Search Cars']")
	public WebElement searchCarsDropDown;
	
	
	@FindBy(how= How.XPATH,using="//select[@id='makes']")
	public WebElement makeDropDown;
	
	@FindBy(how= How.XPATH,using="//select[@id='models']")
	public WebElement modelsDropDown;
	
	@FindBy(how= How.XPATH,using="//select[@id='locations']")
	public WebElement locationsDropDown;
	
	
	@FindBy(how= How.XPATH,using="//select[@id='priceTo']")
	public WebElement priceToDropDown;
	
	
	@FindBy(how= How.XPATH,using="//input[@id='search-submit']")
	public WebElement findMyNextCarBtn;
	
	
	
	

}

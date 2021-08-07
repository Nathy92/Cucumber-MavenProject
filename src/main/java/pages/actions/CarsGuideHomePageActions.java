package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void moveToBuySellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buySellLink).perform();
	}

	/*
	 * Search Actions
	 */
	public void clickOnSearchCarsMenu() {
		carsGuideHomePageLocators.searchCarsDropDown.click();
	}

	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(carsGuideHomePageLocators.makeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);

	}

	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(carsGuideHomePageLocators.modelsDropDown);
		selectCarModel.selectByVisibleText(carModel);

	}

	public void selectCarLocation(String carLocation) {
		Select selectCarLocation = new Select(carsGuideHomePageLocators.locationsDropDown);
		selectCarLocation.selectByVisibleText(carLocation);

	}

	public void selectCarPrice(String carPrice) {
		Select selectCarPrice = new Select(carsGuideHomePageLocators.priceToDropDown);
		selectCarPrice.selectByVisibleText(carPrice);

	}

	public void clickFindMyNextCarBtn() {
		carsGuideHomePageLocators.findMyNextCarBtn.click();

	}

	public void reviewsMenu() {

	}

	public void newsMenu() {

	}

	public void adviceMenu() {

	}

	public void pricingSpecsMenu() {

	}

}

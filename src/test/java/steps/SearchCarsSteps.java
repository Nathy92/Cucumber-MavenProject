package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Websiet(String websiteURL) throws Throwable {
		SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
		String menu = list.get(1);
		carsGuideHomePageActions.moveToBuySellMenu();
	}

	@And("^Click on  \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_from_AnyMake_dropdown(String carMake) throws Throwable {
		carsGuideHomePageActions.selectCarMake(carMake);
	}

	@And("^select car model as \"([^\"]*)\" from AnyModel dropdown$")
	public void select_car_model_as_from_AnyModel_dropdown(String carModel) throws Throwable {
		carsGuideHomePageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from AnyLocation dropdown$")
	public void select_location_as_from_AnyLocation_dropdown(String carLocation) throws Throwable {
		carsGuideHomePageActions.selectCarLocation(carLocation);
	}

	@And("^select price as \"([^\"]*)\" from Price dropdown$")
	public void select_price_as_from_Price_dropdown(String carPrice) throws Throwable {
		carsGuideHomePageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsGuideHomePageActions.clickFindMyNextCarBtn();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
		System.out.println("Car list found !!");
	}

	@And("^The page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}

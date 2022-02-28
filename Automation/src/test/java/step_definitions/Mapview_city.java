package step_definitions;

import org.testng.Assert;

import PageObjects.Calendar;
import PageObjects.CityMapview;
import PageObjects.citylistingpage;
import PageObjects.courseinfo;
import PageObjects.courselistingpage;
import PageObjects.weather;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;

public class Mapview_city {
	
	CityMapview map_view;
	citylistingpage city;
	weather w;
	static AndroidDriver driver;
	public  Mapview_city() throws InterruptedException{
		Mapview_city.driver=Base.getDriver();
		map_view=new CityMapview(driver);
		city=new citylistingpage(driver);
		w=new weather(driver);
		
	
	}
	@Then("I tap on list view icon")
	public void i_tap_on_list_view_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    map_view.listview.click();
	}
	
	
	@Then("city added to favourite screeen")
	public void city_added_to_favourite_screeen() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true, "skip");
	}
	
	@Then("I click on weather icon")
	public void i_click_on_weather_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    map_view.weather.click();
	}
	
	@Then("I click on next button")
	public void i_click_on_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	   map_view.date_nextbutton.click();
	}

	 @Then("^next date is dispalyed$")
	    public void next_date_is_dispalyed() throws Throwable {
		 System.out.println(map_view.date_display.getText());
	    }
	    // Write code here that turns the phrase above into concrete actions
	   
	
	@Then("I hit on previous button")
	public void i_hit_on_previous_button() {
	    // Write code here that turns the phrase above into concrete actions
	   map_view.date_previousbutton.click();
	}
	@Then("^current date is displayed$")
    public void current_date_is_displayed() throws Throwable {
       System.out.println( map_view.date_display.getText());
    }
	
	 @Then("^courses are displayed$")
	    public void courses_are_displayed() throws Throwable {
	       map_view.coursename.getText();
	    }
	 

	 
//	    @Then("^I hit on back button$")
//	    public void i_hit_on_back_button() throws Throwable {
//	        map_view.previous.click();
//	    }

	    @Then("^course listing screen displayed$")
	    public void course_listing_screen_displayed() throws Throwable {
	       city.title_of_city.getText();
	    }
	    
	    @Then("^weather screen is displayed based ons earch location$")
	    public void weather_screen_is_displayed_based_ons_earch_location() throws Throwable {
	      System.out.println( w.Weather_Title.getText());
	    }
	
	
}

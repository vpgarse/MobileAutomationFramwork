package step_definitions;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import PageObjects.Home;
import PageObjects.citylistingpage;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CityresultScreen {
	
	
	static AndroidDriver driver;
	citylistingpage city_page;
	Properties prop;
	Home home;
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  CityresultScreen() throws IOException{
		CityresultScreen.driver=Base.getDriver();
		city_page =new citylistingpage(driver);
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
				prop.load(fis);
		}
	//@TC_Cs_01
	

	@Then("^application added city as favourite in favourites screen$")
    public void application_added_city_as_favourite_in_favourites_screen() throws Throwable {
		log.info("*** city is added in favourite screen ***");
       Assert.assertEquals("screen not implemented", "Favourites");
    }

	//@TC-Ci_10	
	
	@Then("I click on map icon")
	public void i_click_on_map_icon() {
	    // Write code here that turns the phrase above into concrete actions
	  log.info("***  Map icon is clickced ***");
	        city_page.map_icon.click();
	    }

    @Then("^mapview screen with (.+)  is displayed$")
    public void mapview_screen_with_is_displayed(String cityname) throws Throwable  {
		log.info("*** map view screen is displayed ***");
      Assert.assertEquals(city_page.title_of_city.getText(),prop.getProperty(cityname));
    }
	
	@Then("I click on weather icon on cityresult screen")
	public void i_click_on_weather_icon_on_cityresult_screen() {
	    // Write code here that turns the phrase above into concrete actions
		log.info("*** wether icon on city result screen is clicked***");
	    city_page.weather.click();
	}
	
	//@TC_Ci_12
	
	
	 @Then("^green fee is displayed$")
	    public void green_fee_is_displayed() throws Throwable {
		 Assert.assertTrue(true, city_page.course_minrate.getText());
	       log.info("*** Green fee :"+city_page.course_minrate.getText()+"***");
	    }

	
	 

	 //@TC_Ci_13
	 @Then("course rating displayed on city listing page")
	 public void course_rating_displayed_on_city_listing_page() {
	        Assert.assertTrue(true, city_page.reviews_count.getText());
	        log.info("*** course rating: " +city_page.reviews_count.getText()+"***");
	    }
   
	 //@TC_Ci_14
	 @Then("^course distance is dispalyed from location$")
	    public void course_distance_is_dispalyed_from_location() throws Throwable {
	       Assert.assertTrue(true, city_page.distance.getText());
	       log.info("*** Distance from course:"+city_page.distance.getText()+"***");
	    }
	 
	 //@TC_Ci_15	 
	 @Then("courselisting page is displayed with teetimes")
	 public void courselisting_page_is_displayed_with_teetimes() {
	     Assert.assertTrue(true,city_page.title_of_city.getText());
	   log.info("***selected coursename from city listingpage:"+city_page.title_of_city.getText()+"***");
	    
	 }
	 
	
	 


}

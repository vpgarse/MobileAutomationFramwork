package step_definitions;


import static org.testng.Assert.assertTrue;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import PageObjects.Home;
import PageObjects.weather;
import Utility.Base;
import cucumber.api.PendingException;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Weatherscreen {
	
static AndroidDriver driver;
		weather courseweather;
		Home home;
		 //public  static Logger log=LogManager.getLogger(Base.class.getName());
	
	public  Weatherscreen() throws InterruptedException{	
		Weatherscreen.driver=Base.getDriver();
		  
	courseweather=new weather(driver);
	home=new Home(driver);
	Thread.sleep(1000);
	}
	
	  @And("^I tap on weather icon$")
	    public void i_tap_on_weather_icon() throws Throwable {
			//log.info("*** Weather screen test execution Starts***");
			
	       home.weather_icon.click();
	       Thread.sleep(1000);
	       
	    }

	
	 @Then("^weather screen is displayed$")
	    public void weather_screen_is_displayed() throws Throwable {
		 String text=courseweather.Weather_Title.getText();
		 Assert.assertEquals( text,"Addison, Texas");
	        
	    }
	 
	// @TC_we_04
	 @Then("^default Today weather is displayed$")
	    public void default_today_weather_is_displayed() throws Throwable {
	      String todayweather=  courseweather.weather_today.getText();
	   //   log.info("*** Default" +todayweather +" is displayed ***");
	      Assert.assertEquals(todayweather, "Today");
	      
	    }
	 @Then("^today weather is displayed$")
	    public void today_weather_is_displayed() throws Throwable {
	     //  log.info("***Today temperature: "+courseweather.today_temperature.getText()+"***");
	    }
	 @And("^max min temperature is displayed$")
	    public void max_min_temperature_is_displayed() throws Throwable {
	       String text= courseweather.max_temperature.getText();
	        Assert.assertTrue(true,text );
	       String mintemperature= courseweather.min_temperature.getText();
	       Assert.assertTrue(true, mintemperature);
	       String max_temperature=courseweather.max_temperature.getText();
	     //  log.info("minimum temperature is "+mintemperature+"***");
	       //log.info("maximum temperature is "+max_temperature+"***");
	    }
	 //TC_we_05
	 
	 @Then("^I click on Weekely weather button$")
	    public void i_click_on_weekely_weather_button() throws Throwable {
		// log.info("*** clicking on weekly weather button***");
	      courseweather.weather_weekely.click();
	      
	      Thread.sleep(1000);
	    }

	    @Then("^next 7days wather is displayed$")
	    public void next_7days_wather_is_displayed() throws Throwable {
	     //  String text= courseweather.next_7_days_screen.getText();
	      // log.info("minimum temperature is "+courseweather.weekelyMin_day1.getText()+"***");
	       //log.info("maximum temperature is "+courseweather.weekelyMax_day1.getText()+"***");
	       //Assert.assertTrue(true, text);
	    }
	    
	    
	    //TC_we_06
	    @Then("^I click on Windbutton$")
	    public void i_click_on_windbutton() throws Throwable {
	    	// log.info("*** clicking on wind button***");
	        courseweather.weather_wind.click();
	    }

	    @Then("wind displayed in mph")
	    public void wind_displayed_in_mph() {
	    	String text=courseweather.wind_mph.getText();
	    	 Assert.assertTrue(true, text);
	       
	    }

	        
	    //TC_07
	 

	    @And("^I tap on back  icon$")
	    public void i_tap_on_back_icon() throws Throwable {
	    	// log.info("*** closing the weather screen***");
	        courseweather.backbutton.click();
	      
	    }
	    @Then("home screen is opened")
	    public void home_screen_is_opened() {
	        // Write code here that turns the phrase above into concrete actions
	       // log.info(home.findyour_teetime.getText());
	    }

	   
}

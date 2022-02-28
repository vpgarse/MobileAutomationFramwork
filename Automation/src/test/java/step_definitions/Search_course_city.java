package step_definitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import PageObjects.Searchlocation_Page;
import PageObjects.courselistingpage;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Search_course_city {
	Properties prop;
static AndroidDriver driver;
Searchlocation_Page se;
courselistingpage courselisting;
public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  Search_course_city() throws IOException{
	Search_course_city.driver=Base.getDriver();
	prop=new Properties();
	String FileName = System. getProperty("user. dir")+"\\src\\test\\java\\Utility\\global.properties";
	System.out.println("FileName:" +FileName);
	FileInputStream fis=new FileInputStream(FileName);
	//FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
	 
	prop.load(fis);
			se=new Searchlocation_Page(driver);
			courselisting=new courselistingpage(driver);
	}
	
	//TC_15	
	@When("^I click on Search box$")
    public void i_click_on_search_box() throws Throwable {
		
		se.Searchby_Course_City.click();
    }

	  @And("^I enter (.+)$")
	    public void i_enter(String cityname) throws Throwable{
	     
		
		se.Searchby_Course_City.sendKeys(prop.getProperty(cityname));
		//Thread.sleep(1000);
		
    }
	
	 @And("^I select Course by suggestion box$")
	    public void i_select_course_by_suggestion_box() throws Throwable {
		 
		se.Search_suggestion.click();
		 //se.Search_suggestion_zipcode.click();
		 Thread.sleep(1000);
	    }
	
	 @Then("^selected (.+) displayed in the location field$")
	    public void selected_displayed_in_the_location_field(String item) throws Throwable {

		 	
    	
    	String text=se.Search_field_value.getText();
    	Assert.assertEquals(item, text);
    	//Thread.sleep(1000);
    	
		
    } 
    
	  @Then("^displayed (.+) with tee times  listing$")
	    public void displayed_with_tee_times_listing(String coursename) throws Throwable{
		 Assert.assertTrue(courselisting.title_of_course.getText().contains(prop.getProperty(coursename)));
		  
	    }

	 @When("^I search the course by  (.+)$")
	    public void i_search_the_course_by(String coursename) throws Throwable {
	    	 se.Searchby_Course_City.sendKeys(prop.getProperty(coursename));
	    }
 

	
	//TC_18
	@And("^I tap on Current location$")
	   public void i_tap_on_current_location() throws Throwable
	  {
		
	        se.Current_location.click();
	       
	   }
	
	 @Then("^current location displayed on location field$")
	    public void current_location_displayed_on_location_field() throws Throwable 
	 {
		
		 log.info(se.Search_field_value.getText());
		Assert.assertEquals("Addison,Texas", se.Search_field_value.getText());
	  }

	 @Then("^\"([^\"]*)\" message in search screen  is displayed$")
	    public void something_message_in_search_screen_is_displayed(String strArg1) throws Throwable {
	        Assert.assertTrue(se.no_results_found.getText().contains(strArg1));
	    }
	 
}

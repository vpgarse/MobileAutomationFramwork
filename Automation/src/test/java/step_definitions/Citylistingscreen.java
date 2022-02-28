package step_definitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import org.apache.logging.log4j.LogManager;

import PageObjects.Home;
import PageObjects.Searchlocation_Page;
import PageObjects.citylistingpage;
import PageObjects.teetimeslisting;
import Utility.Base;
//import cucumber.api.PendingException;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Citylistingscreen {
	
	static AndroidDriver driver;
	citylistingpage city_page;
	
	Home home;
	Searchlocation_Page zipcode;
	teetimeslisting teetimelisting_page;
	Properties prop;
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
	 public  Citylistingscreen() throws IOException{
		 Citylistingscreen.driver=Base.getDriver();
		 city_page=new citylistingpage(driver);
		 home=new Home(driver);
		 zipcode=new Searchlocation_Page(driver);		 
		 teetimelisting_page=new teetimeslisting(driver);
		 prop=new Properties();
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				  "\\src\\test\\java\\Utility\\global.properties");
			//FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\android_automation\\src\\test\\java\\Andriod\\Automation\\global.properties");
					prop.load(fis);
	 }
	
	 @And("^I hit on search button$")
	    public void i_hit_on_search_button() throws Throwable {
	        home.search.click();
	        log.info("*** search button is clicked ***");
	        System.out.println("*** search button is clicked ***");
	    }
	
	 @Then("^(.+) name should display with the courses avaialbility$")
	    public void name_should_display_with_the_courses_avaialbility(String cityname) throws Throwable {
        String city_page_title=city_page.title_of_city.getText();
        log.info(city_page_title);
        if(city_page_title==cityname) {
        Assert.assertTrue(city_page.title_of_city.getText().contains(prop.getProperty(cityname)));
       }
      else {
        	log.info("zipcode location"+ city_page.title_of_city.getText());
        	 
        }
        
    }


	 	@Then("I hit on course")
	    public void i_hit_on_course() throws Throwable {
	 		city_page.Navigatetotheavailablecalendar(driver);
	 		city_page.course_name.click();
	    }
	 	  @Then("^course tee times list display with (.+)$")
	 	    public void course_tee_times_list_display_with(String holes) throws Throwable {
	 	
	 		Assert.assertTrue((teetimelisting_page.teetimelisting_holes.getText().contains(prop.getProperty(holes))));
	 	    }


	    @Then("^tee times listing page  display with (.+)$")
	    public void tee_times_listing_page_display_with(String players) throws Throwable {
	       String player_text=teetimelisting_page.teetimelisting_players.getText();
	       if(player_text== "1-4"){
	      Assert.assertTrue(player_text.contains(prop.getProperty(players)));
	       log.info("*** tee time list dispalyed with players count: "+ player_text+"***");
	       }
	      
	       else {
	           
	    	   Assert.assertFalse(player_text.contains(prop.getProperty(players)));
	    	   //System.out.println();
	    	   log.info("*** tee time list dispalyed with players count: "+ player_text+"***");
	       
	    }
	    }
	    
	    @Then("^(.+) teetime list is displaying$")
	    public void teetime_list_is_displaying(String course) throws Throwable {
	       String teetimepage_title=teetimelisting_page.teetimelisting_title.getText();
	       Assert.assertEquals(course, teetimepage_title);
	       log.info("*** Tee time list is dispalyed ***");
	    }
	    
	    
	    
	   
	    
	    

	    
}

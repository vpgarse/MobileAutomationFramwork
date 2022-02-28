package step_definitions;

import PageObjects.Calendar;
import PageObjects.Coursereviews;
import PageObjects.Home;
import PageObjects.citylistingpage;
import PageObjects.courseinfo;
import PageObjects.courselistingpage;
import PageObjects.weather;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class CourseresultScreen {
	
	static AndroidDriver driver;
	courselistingpage course_page; 
	citylistingpage city_page;
	Calendar calendar;
	weather temp;
	courseinfo info;
	Coursereviews review;
	public  CourseresultScreen() throws InterruptedException{
		CourseresultScreen.driver=Base.getDriver();
		course_page=new courselistingpage(driver);
		city_page=new citylistingpage(driver);
		calendar=new Calendar(driver);
		temp=new weather(driver);
		review=new Coursereviews(driver);
				info=new courseinfo(driver);
		
	
	}
	
	//@TC_Cs_01

    @And("^I tap on favourite icon$")
    public void i_tap_on_favourite_icon() throws Throwable {
       course_page.favourite_courselistingpage.click();
    }
    
    @Then("^application added in course automatically in favourite screen$")
    public void application_added_in_course_automatically_in_favourite_screen() throws Throwable {
		
       Assert.assertFalse("skip", false);
    }
    
    //TC_Cs_10
    @Then("I  click on date")
    public void i_click_on_date() {
        // Write code here that turns the phrase above into concrete actions
       city_page.calendar_icon.click();
    }

    @Then("^calendar screen displayed$")
    public void calendar_screen_displayed() throws Throwable {
        String t=calendar.Select_a_date.getText();
        Assert.assertEquals("Select a date",t );
    }

   
    //@TC_11
    @And("^I click on filter icon$")
    public void i_click_on_filter_icon() throws Throwable {
        city_page.filter.click();
    }
    
    @Then("^filter screen is displayed$")
    public void filter_screen_is_displayed() throws Throwable {
       Assert.assertTrue("skip", false);
    }

   
    
    //@TC_12
    @Then("^weather icon is displayed$")
    public void weather_icon_is_displayed() throws Throwable {
        String text=temp.weather_today.getText();
        Assert.assertEquals("Today", text);
    }

    @And("^I click on weather icon on courseresult screen$")
    public void i_click_on_weather_icon_on_courseresult_screen() throws Throwable {
    	city_page.weather.click();
    }

    //TC_13
    
    @And("^I click on info icon$")
    public void i_click_on_info_icon() throws Throwable {
        course_page.course_info.click();
    }    
    
    @Then("^course info screen is displayed$")
    public void course_info_screen_is_displayed() throws Throwable {
       String text=info.title_of_courseinfo.getText();
       Assert.assertEquals("Course Info", text);
       }
    
    
    //@TC_cs_14
    @And("^I click on alert icon on course listing page$")
    public void i_click_on_alert_icon_on_course_listing_page() throws Throwable {
       course_page.alert_courselistingpage.click();
    }
    
    @Then("^alert screen is displayed$")
    public void alert_screen_is_displayed() throws Throwable {
    	Assert.assertTrue("skip", false);
    }
    
   
  
    //@Tc_CS-15
    
    @Then("^validated green fee$")
    public void validated_green_fee() throws Throwable {
    	
    	Assert.assertTrue(course_page.greenfee_course.getText(), true);
       System.out.println(course_page.greenfee_course.getText());
    }
   
    //@TC_CS_16
    @Then("^avaialble players are displayed$")
    public void avaialble_players_are_displayed() throws Throwable {
       Assert.assertTrue(course_page.players.getText(), true);
       System.out.println(course_page.players.getText());
    }
    
    //@TC_18
    @Then("^tee time time is displyed$")
    public void tee_time_time_is_displyed() throws Throwable {
        Assert.assertTrue(course_page.teetime_slot.getText(), true);
        System.out.println(course_page.teetime_slot.getText());
    }
    
    
    //@TC_19
    @Then("^holes are displayed$")
    public void holes_are_displayed() throws Throwable {
        Assert.assertTrue(course_page.hole.getText(), true);
        System.out.println(course_page.hole.getText());
    }
    
    //@TC_20
    @Then("^booking screen is dispalyed$")
    public void booking_screen_is_dispalyed() throws Throwable {
      	Assert.assertTrue("skip", false);
    }

    @And("^I click on tee time card$")
    public void i_click_on_tee_time_card() throws Throwable {
    	//course_page.teetime_slot.click();
    	course_page.Navigatetotheavailablecalendar(driver);
    	course_page.teetime_slot.click();
    	
    	
    }
    
   // @TC_cs_23
    @Then("I tap on review option")
    public void i_tap_on_review_option() {
    // Write code here that turns the phrase above into concrete actions
    info.review.click();
    }

    @Then("^review screen is displayed$")
    public void review_screen_is_displayed() throws Throwable {
    	
    	String text=review.course_review_title.getText();
        Assert.assertEquals("Course Reviews", text);
    }
    
    @Then("^Avialable provider sites is dispalyed$")
    public void avialable_provider_sites_is_dispalyed() throws Throwable {
        Assert.assertTrue(course_page.sites.getText(), true);
        System.out.println(course_page.sites.getText());
    }
}


package step_definitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import PageObjects.Calendar;
import PageObjects.Coursereviews;
import PageObjects.Home;
import PageObjects.SignIn;
import PageObjects.Writeareview;
import PageObjects.citylistingpage;
import PageObjects.courseinfo;
import PageObjects.courselistingpage;
import PageObjects.weather;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Course_ReviewsScreen {
	
	static AndroidDriver driver;
	Coursereviews review;
	Home home;
	SignIn signin;
	Writeareview  post;
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  Course_ReviewsScreen() throws InterruptedException{
		Course_ReviewsScreen.driver=Base.getDriver();		
		review=new Coursereviews(driver);
		home=new Home(driver);
		signin=new SignIn(driver);
		post=new Writeareview (driver);
	
	}
	 @And("^I hit on Sort icon$")
	    public void i_hit_on_sort_icon() throws Throwable {
		 log.info("*** Sort icon functinality***");
	        review.Sortby.click();
	    }
	
	 @Then("^Sort by screen is displayed$")
	    public void sort_by_screen_is_displayed() throws Throwable {
	       String text=review.Sortbytitle.getText();
	       Assert.assertEquals("Sort by:", text);
	       log.info("***  sort by screen is displayed***");
	    }

	// @TC_CR_2
	 
	 @Then("^Most recent review displayed$")
	    public void most_recent_review_displayed() throws Throwable {
	       log.info(review.review_helpful.getText());
	    }

	 @Then("hit on Most Recent button")
	 public void hit_on_Most_Recent_button() {
	     // Write code here that turns the phrase above into concrete action
	        review.Recent.click();
	        log.info("*** clicking on most recent button***");
	    }
	 
	    
	    //TC_CR_3
	    @Then("^Most favourite review displayed$")
	    public void most_favourite_review_displayed() throws Throwable {
	        log.info("***Most favourite review***"+review.reviewrating_bar.getTagName());
	        
	    }

	    @Then("hit on Most Favourble  button")
	    public void hit_on_Most_Favourble_button() {
	        review.Most_Favorable.click();
	        log.info("*** clicking on most favourable button***");
	    }

	    //TC_CR-4

	    @Then("hit on Most Critical  button")
	    public void hit_on_Most_Critical_button() {
	    	log.info("*** clicking on most Critical button***");
	        review.Most_critical.click();
	    }
	    @Then("^Most Critical review displayed$")
	    public void most_critical_review_displayed() throws Throwable {
	    	  log.info("***Most criical review:***"+review.reviewrating_bar.getTagName());
	    }
	    
	    //TC_CR_5
	    
	    @Then("hit on Most Helpful  button")
	    public void hit_on_Most_Helpful_button() {
	    	log.info("*** clicking on most helpful button***");
	    	review.Most_Helpful.click();
	    }
	    @Then("^Most helpful review displayed$")
	    public void most_helpful_review_displayed() throws Throwable {
	     log.info("Most helpfule review:"+review.reveiw_message.getText());
	    }

	    
	    //TC_CR_6
	    @Then("hit on MostEstablished button")
	    public void hit_on_MostEstablished_button()  {
	       log.info(review.review_helpful.getText());
	    }

	    @Then("Most establishes review displayed")
	    public void most_establishes_review_displayed(){
	    	log.info("*** clicking on most established button***");
	      review.Establish.click();
	    }
	    
	    //TC_CR_7
	    @Then("^Overall rating is displayed of course$")
	    public void overall_rating_is_displayed_of_course() throws Throwable {
	        log.info("Course Rating:"+review.courserating.getText());
	    }

	   //TC_CR_8
	    @Then("course rating displayed")
	    public void course_rating_displayed() {
	        // Write code here that turns the phrase above into concrete actions    
	       log.info(review.coursereviews.getText());
	    }
	    //TC_CR_9
	    @Then("^review card display$")
	    public void review_card_display() throws Throwable {
	       review.reveiw_card.getText();
	       log.info("review card display");
	       Assert.assertEquals( "Was this review helpful?", review.reveiw_card.getText());
	    }

	    @And("^I hit on more option$")
	    public void i_hit_on_more_option() throws Throwable {
	    	log.info("hitting on More option in course reveiw screen");
	        review.more.click();
	    }
	    //TC_CR_10
	    @Then("I hit on yes")
	    public void i_hit_on_yes() {
	        // Write code here that turns the phrase above into concrete actions
	    	log.info("hitting on Yes option in course reveiw screen");
	       review.yes.click();
	    }
	    @Then("^confirmation message will display$")
	    public void confirmation_message_will_display() throws Throwable {
	    	Assert.assertEquals("Your report has been submitted", review.confirmmessage.getText());
	    // Assert.assertEquals("Your feedback has been submitted",  review.confirmmessage.getText());
	    }

	   //TC_CR_11
	    @Then("I hit on No")
	    public void i_hit_on_No() {
	        // Write code here that turns the phrase above into concrete actions
	    	log.info("hitting on No option in course reveiw screen");
	        review.No.click();
	    }
	    //TC_CR_12
	    @Then("I hit on Report It")
	    public void i_hit_on_Report_It() {
	        // Write code here that turns the phrase above into concrete actions
	   
	       review.report.click();
	    }
	    //TC_CR_13
	    @Then("I hit on less")
	    public void i_hit_on_less() throws Throwable {
	    	log.info("hitting on less option in course reveiw screen");
	        review.less.click();
	    }
	    @Then("^review will display in short$")
	    public void review_will_display_in_short() throws Throwable {
	       Assert.assertEquals("more", review.more.getText());
	    }
	    
	    //TC_CR_14
	    
	    @Then("^error message is displayed$")
	    public void error_message_is_displayed() throws Throwable {
	        String text=review.errormessage.getText();
	        Assert.assertEquals("Accessing this without signing in is not supported yet, once we develop the sign in page we will show the sign in wall here. For now sign in from another screen before testing this.", text);
	    }

	    @And("^I tap on Write A review  option$")
	    public void i_tap_on_write_a_review_option() throws Throwable {
	    	log.info("hitting on Write A review option in course reveiw screen");
	        review.Write_A_Review.click();
	    }
	    
	    //TC_CR_15

	    @Then("^I hit on Ok$")
	    public void i_hit_on_ok() throws Throwable {
	        review.OK.click();
	    }
	    
	   
	   	    
	    @And("^I tap on Home screen$")
	    public void i_tap_on_home_screen() throws Throwable {
	    	log.info("hitting on Home icon");
	       home.homepage_search.click();
	    }
	    @Then("^Write A review screen is open$")
	    public void write_a_review_screen_is_open() throws Throwable {
	      String text= post.WriteReview_title.getText();
	       Assert.assertEquals("Write A Review", text);
	    }
	   

	    //TC_19
	    @Then("I hit on stars to rate the course")
	    public void i_hit_on_stars_to_rate_the_course() {
	        // Write code here that turns the phrase above into concrete actions
	    	log.info("hitting on Stars for rating in  course reveiw screen");
	        post.reviewrating_tab.click();
	    }
	    
	    @Then("I hit on Post a Review")
	    public void i_hit_on_Post_a_Review() {
	        // Write code here that turns the phrase above into concrete actions
	    	log.info("hitting on Post A review in course reveiw screen");
	       post.PostReview.click();
	    }
	    
	   
	    //TC_20
	    @And("^I have added (.+)$")
	    public void i_have_added(String title) throws Throwable {
	    
	     //  post.reviewinfo.click();
	       post.reviewinfo.sendKeys(title);
	    }
	    
	    @Then("^error message is displayed for title$")
	    public void error_message_is_displayed_for_title() throws Throwable{
	       String text= review.errormessage.getText();
	      Assert.assertEquals("Please provide a title", text);
	    }
	   
	    
	    @Then("^errormessage is displayed for rating$")
	    public void errormessage_is_displayed_for_rating() throws Throwable {
	    	 String text= review.errormessage.getText();
	    	 Assert.assertEquals("Please provide a rating", text);
	    	 
	    }


	    @Then("^\"([^\"]*)\"$")
	    public void something(String strArg1) throws Throwable {
	       Assert.assertTrue(review.errormessage.getText().contains(strArg1));
	    }
	    
	    @Then("^\"([^\"]*)\"  is displayed$")
	    public void something_is_displayed(String strArg1) throws Throwable {
	       Assert.assertTrue(review.confirmmessage.getText().contains(strArg1));
	    }
	    @Then("^I verify the write reveiw option is \"([^\"]*)\"$")
	    public void i_verify_the_write_reveiw_option_is_something(String strArg1) throws Throwable {
	    	log.info("write a revew option"+strArg1);
	    }
	    
	    @Then("^review has already submitted$")
	      public void review_has_already_submitted() throws Throwable {
	         log.info("reveiw has alreday been submitted");
	      }
	    @Then("^review is displayed$")
	    public void review_is_displayed() throws Throwable {
	        
	        log.info(review.coursereviews.getText());
	    }

}

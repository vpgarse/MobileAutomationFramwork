package step_definitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import PageObjects.Home;
import PageObjects.SignIn;
import PageObjects.bookings;
import PageObjects.payments;
import Utility.Base;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Bookings {
	static AndroidDriver driver;
	SignIn login;
	bookings booking;
	
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
		public  Bookings() throws InterruptedException{
			Bookings.driver=Base.getDriver();		
			login=new SignIn(driver);
			booking=new bookings(driver);
		}
	
	 @When("^I hit on Bookings$")
	    public void i_hit_on_bookings()  { //not required "throws Throwable" vs Throw
	        login.bookings.click();
	    }

	    @Then("^bookings screen displayed$")
	    public void bookings_screen_displayed() throws Throwable {
	       String text= booking.bookings_title.getText();
	       log.info(text);
	       Assert.assertEquals(text, "Bookings");
	    }

	    @Then("^Upcoming bookings screen dispalyed$")
	    public void upcoming_bookings_screen_dispalyed() throws Throwable {
	       String text=booking.title_Upcoming_booking.getText();
	       log.info(text);
	       Assert.assertEquals(text, "Upcoming Bookings");
	    }

	    @And("^I hit on Upcoming bookings$")
	    public void i_hit_on_upcoming_bookings() throws Throwable {
	       booking.Upcoming_booking.click();
	    }
	    
	    @Then("^completed bookings screen dispalyed$")
	    public void completed_bookings_screen_dispalyed() throws Throwable {
	    	String text=booking.title_completed_booking.getText();
		       log.info(text);
		       Assert.assertEquals(text, "Completed Bookings");
	    }

	    @And("^I hit on Completed bookings$")
	    public void i_hit_on_completed_bookings() throws Throwable {
	       booking.Completed_booking.click();
	    }
	    
	    @Then("^cancelled bookings screen dispalyed$")
	    public void cancelled_bookings_screen_dispalyed() throws Throwable {
	    	String text=booking.Cancelled_Bookings_title.getText();
		       log.info(text);
		       Assert.assertEquals(text, "Cancelled Bookings");
	    }

	    @And("^I hit on canceeled bookings$")
	    public void i_hit_on_canceeled_bookings() throws Throwable {
	       booking.cancelled_booking.click();
	    }
	    
	    @When("^I hit on any one of cancelled booking$")
	    public void i_hit_on_any_one_of_cancelled_booking() throws Throwable {
	        booking.cancelled_teetime.click();
	    }

	    @Then("^booking details should display$")
	    public void booking_details_should_display() throws Throwable {
	       String text= booking.amountpaid.getText();
	       //Assert.assertEquals
	    }
	    @When("^I hit on any one of Completed booking$")
	    public void i_hit_on_any_one_of_completed_booking() throws Throwable {
	        booking.completedbooking_teetime.click();
	    }
	    @When("^I hit on any one of upcoming booking tee time$")
	    public void i_hit_on_any_one_of_upcoming_booking_tee_time() throws Throwable {
	       booking.upcoming_teetime.click();
	    }

}

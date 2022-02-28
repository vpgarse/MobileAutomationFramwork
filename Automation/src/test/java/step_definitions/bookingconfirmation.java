package step_definitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import PageObjects.Home;
import PageObjects.RateType;
import PageObjects.SignIn;
import PageObjects.Signup;
import PageObjects.bookingcheckoutpage;
import PageObjects.bookinngoptions;
import PageObjects.confirmationpage;
import Utility.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class bookingconfirmation {
	
	static AndroidDriver<MobileElement> driver;
	String amountdueatcourse;
	Properties prop;
	bookingcheckoutpage booking_checkout;
	bookinngoptions booking_options;	
	Home home;
    String players;
    String greenfee;
    confirmationpage confirm;
	public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  bookingconfirmation() throws InterruptedException, IOException{
		bookingconfirmation.driver=Base.getDriver();		
		
		booking_checkout=new bookingcheckoutpage(driver);		
		booking_options =new bookinngoptions(driver);
		home=new Home(driver);
		confirm=new confirmationpage(driver);		
		prop=new Properties();		
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
	}
	
    
    @Then("^home screen is displayed$")
    public void home_screen_is_displayed() throws Throwable {
    	home.findyour_teetime.getText();
       
    }
    @Then("^(.+) displayed with amount as Amount paid, Amount Due at Course and Paymenthod, booking details$")
    public void displayed_with_amount_as_amount_paid_amount_due_at_course_and_paymenthod_booking_details(String coursename) throws Throwable {
       Assert.assertTrue(confirm.course_title.getText().contains(coursename));
       amountdueatcourse= confirm.Amount_dueatcourse.getText()+"\t :" +confirm.Amount_due_value.getText();
       if(!amountdueatcourse.isEmpty()) {
     	 
     	  log.info(amountdueatcourse);
       }
      
       String amountpaidatcourse= confirm.Amount_paid.getText()+"\t :" +confirm.Amount_paid_value.getText();
      if(!amountpaidatcourse.isEmpty()) {
       log.info( amountdueatcourse+"\n" + amountpaidatcourse);
      }
 
       String bookingdetails=confirm.Booking_details.getText();
       if(!bookingdetails.isEmpty()) {
    	   String hole=confirm.holeamenity.getText();
           String cart=confirm.cartamenity.getText();
           String ratetype=confirm.rateamenity.getText();
           String paidstatus=confirm.paymentamenity.getText();
           System.out.println(bookingdetails+"\n" + hole+"\n "+cart+"\n" +ratetype+"\n" + paidstatus);
          log.info( bookingdetails+"\n" + hole+"\n "+cart+"\n" +ratetype+"\n" + paidstatus);
       }
     
       
    }


   

    @Then("^I click on   done button$")
    public void i_click_on_done_button() throws Throwable  {
    	confirm.Done.click();
        
    }

}

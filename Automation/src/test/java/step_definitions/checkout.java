package step_definitions;



import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;

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
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;


public class checkout {
	static AndroidDriver<MobileElement> driver;
	Signup register;
	SignIn signin;
	Properties prop;
	bookingcheckoutpage booking_checkout;
	bookinngoptions booking_options;
	RateType rate;
	Home home;
    String players;
    String greenfee;
    confirmationpage confirm;
	public  static Logger log=LogManager.getLogger(Base.class.getName());
	// public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  checkout() throws InterruptedException, IOException{
		checkout.driver=Base.getDriver();		
		register=new Signup(driver);
		signin=new SignIn(driver);
		booking_checkout=new bookingcheckoutpage(driver);		
		booking_options =new bookinngoptions(driver);
		home=new Home(driver);
		confirm=new confirmationpage(driver);		
		rate=new RateType(driver);
		prop=new Properties();		
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
	}
	
    @When("^I click on any one of available rates$")
    public void i_click_on_any_one_of_available_rates() throws Throwable {
        rate.available_ratetype1.click();
    }

    @Then("^provider screen is displayed$")
    public void provider_screen_is_displayed() throws Throwable {
    	System.out.println(booking_options.booking_options.getText());
     log.info(booking_options.booking_options.getText());
    }

    @Then("^checkout screen is displayed$")
    public void checkout_screen_is_displayed() throws Throwable {
    	System.out.println(booking_checkout.review_teetime.getText());
      log.info(booking_checkout.review_teetime.getText());
    }

    @And("^I click on provider tee time rate$")
    public void i_click_on_provider_tee_time_rate() throws Throwable{
    	   String text=booking_options.booking_rate.getText();
    	   System.out.println(text);
 
        booking_options.logo.click();
    }

    @And("^I hit on  Home screen$")
    public void i_hit_on_home_screen() throws Throwable {
        home.homepage_search.click();
    }
    
    @When("^I accept the terms and conditions$")
    public void i_accept_the_terms_and_conditions() throws Throwable {
    	booking_checkout.terms_conditions.click();
    }

    @Then("navigating to {string}")
    public void navigating_to(String string) {
       Assert.assertTrue(confirm.booking_confirmation.getText().contains(string));
    	
    }

    @And("^validated course name on checkout screen $")
    public void validated_course_name_on_checkout_screen() throws Throwable {
    	booking_checkout.course_name.getText();
    }

    @And("^I click on Book now$")
    public void i_click_on_book_now() throws Throwable {
        booking_checkout.booknow_complete.click();
    }
    
    @And("^players count and  green fee amount is displayed$")
    public void players_count_and_green_fee_amount_is_displayed() throws Throwable {
    	players =booking_checkout.teeoff_player.getText();
    	Dimension size=driver.manage().window().getSize();
    	int x=size.getWidth()/2;
        int starty=(int)(size.getHeight()*0.60);
        int endy=(int)(size.getHeight()*0.10);
        new TouchAction(driver).press(point(x,starty)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endy,x)).release().perform();
    	
    	greenfee=  booking_checkout.greenfee_amount.getText();
    }

    
    @When("^I hit on players count plus icon$")
    public void i_hit_on_players_count_plus_icon() throws Throwable {    	
        booking_checkout.tv_increment.click();
    }

    @Then("^Green fee amount is incremented$")
    public void green_fee_amount_is_incremented() throws Throwable {
    	Dimension size=driver.manage().window().getSize();
    	int x=size.getWidth()/2;
        int starty=(int)(size.getHeight()*0.60);
        int endy=(int)(size.getHeight()*0.10);
        new TouchAction(driver).press(point(x,starty)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endy,x)).release().perform();
      Thread.sleep(1000);
        String gf=booking_checkout.greenfee_text.getText()+booking_checkout.greenfee_amount.getText();
       log.info(gf);

//Assert.assertTrue(gf.contains(greenfee+greenfee));
    }
    
    @Then("^Green fee amount , Supremegolf fee , Estimated saletax , Total amount due and Total due now is displayed$")
    public void green_fee_amount_supremegolf_fee_estimated_saletax_total_amount_due_and_total_due_now_is_displayed() throws Throwable {
//    	Dimension size=driver.manage().window().getSize();
//    	int x=size.getWidth()/2;
//        int starty=(int)(size.getHeight()*0.60);
//        int endy=(int)(size.getHeight()*0.10);
//        new TouchAction(driver).press(point(x,starty)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endy,x)).release().perform();      
    	MobileElement el = (MobileElement) driver
    		    .findElementByAndroidUIAutomator("new UiScrollable("
    		        + "new UiSelector().scrollable(true)).scrollIntoView("                      
    		        + "new UiSelector().textContains(\"ending in \"));");
    	String gf=booking_checkout.greenfee_text.getText()+"\t :"+booking_checkout.greenfee_amount.getText();
      String sgf=booking_checkout.supremegolf_fee.getText()+"\t :"+booking_checkout.supremegolf_amount.getText();
      String est=booking_checkout.Estimated_salestax.getText()+"\t :"+booking_checkout.estimatedsalestax_amount.getText();
      String totalamntdue=booking_checkout.Total_amount_due.getText()+"\t :"+booking_checkout.totaldue_amount.getText();
      String Totalduenow=booking_checkout.total_due.getText()+"\t :"+booking_checkout.totalduenow_amount.getText();
      System.out.println(gf+"\n"+sgf+"\n"+est+"\n"+totalamntdue+"\n"+  Totalduenow);
     log.info(gf+"\n"+sgf+"\n"+est+"\n"+totalamntdue+"\n"+  Totalduenow);
   
    }


    @Then("^last four digits of card displayed$")
    public void last_four_digits_of_card_displayed() throws Throwable {

    	MobileElement el = (MobileElement) driver
    		    .findElementByAndroidUIAutomator("new UiScrollable("
    		        + "new UiSelector().scrollable(true)).scrollIntoView("                      
    		        + "new UiSelector().textContains(\"ending in \"));");
    	
        String cardnumber=booking_checkout.paymentmenthod.getText();
        System.out.println(cardnumber);
       log.info(cardnumber);
    }
    @And("^I hit on change  button$")
    public void i_hit_on_change_button() throws Throwable {
     booking_checkout.change.click();
       
    }

    @Then("errormessage {string}  is displayed")
    public void errormessage_is_displayed(String string) {
   Assert.assertTrue( booking_checkout.errormessage.getText().contains(string));
    }


    @And("^I hit on add card button$")
    public void i_hit_on_add_card_button() throws Throwable {
    	MobileElement el = (MobileElement) driver
    		    .findElementByAndroidUIAutomator("new UiScrollable("
    		        + "new UiSelector().scrollable(true)).scrollIntoView("                      
    		        + "new UiSelector().textContains(\"Add \"));");
        booking_checkout.Addcard.click();
    }

}

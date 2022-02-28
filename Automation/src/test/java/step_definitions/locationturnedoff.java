//package step_definitions;
//
//
//
//import java.io.IOException;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import PageObjects.Home;
//import PageObjects.Searchlocation_Page;
//import Utility.Base;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import junit.framework.Assert;
//
//public class locationturnedoff {
//	static AndroidDriver<MobileElement> driver;
//	Searchlocation_Page  location;
//	Home home;
//	public  static Logger log=LogManager.getLogger(Base.class.getName());
//	public  locationturnedoff() throws IOException{
//		//Base. executeABD("adb shell settings put secure location_providers_notallowed -gps ");
//		 locationturnedoff.driver=Base.getDriver();
//		location=new Searchlocation_Page (driver);
//		home=new Home(driver);
//		}
//	@Given("shellCommand to turn off location")
//	public void shellcommand_to_turn_off_location() throws Throwable {
//		 
//	System.out.println("location tunedoff");
//	    }
//
//	@Then("Then verified location field")
//	public void then_verified_location_field() {
//	    	
//	      String text= location.text_value.getText();
//	      log.info(text);
//	      
////	       Assert.assertEquals("Search by city, course or zip", text);
//	    }
//	    
//	    @Then("^alert message is displayed$")
//	    public void alert_message_is_displayed() throws Throwable {
//	       log.info( home.errormessage.getText());
//	    }
////	    @Then("^turnon location$")
////	    public void turnon_location() throws Throwable {
////	    	Base. executeABD("adb shell settings put secure location_providers_allowed +gps");
////	    	Thread.sleep(1000);
////	    }
//
//}

package step_definitions;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import PageObjects.Home;
import PageObjects.RateType;
import PageObjects.SignIn;
import PageObjects.payments;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ratetype {
	static AndroidDriver driver;
	SignIn login;
	Home home;
	payments payment;
	RateType rate;
	Properties prop;
	public  ratetype() throws InterruptedException, IOException{
		ratetype.driver=Base.getDriver();		
		login=new SignIn(driver);
		home=new Home(driver);
		payment=new payments(driver);
		rate=new RateType(driver);
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
	}
	@Then("{string} screen is displayed")
	public void screen_is_displayed(String string) throws InterruptedException {
		Assert.assertTrue(rate.bookings_options.getText().contains(string));
		Thread.sleep(1000);
        
    }
	
	 @Then("^I verified \"([^\"]*)\" player  displayed by default$")
	    public void i_verified_something_player_displayed_by_default(String strArg1) throws Throwable{
		// String text=rate.player_value.getText();
		 Assert.assertTrue(rate.player_value.getText().contains(strArg1));
		
    }
	
	 @Then("^I verified \"([^\"]*)\" Holes displayed by deafult$")
	    public void i_verified_something_holes_displayed_by_deafult(String strArg1) throws Throwable {
		
		 
		String text=rate.eighteen_holes.getAttribute("checked");
		if (text==strArg1) {
			//System.out.println("Test passed:" +text);
			Assert.assertTrue(rate.eighteen_holes.getText().contains(strArg1));
			
			}
		else {
			
			Assert.assertTrue(rate.nine_holes.getText().contains(strArg1));
					
		}
			
	 }
	 
	 @When("^I hit on  plus icon to increase the players count$")
	    public void i_hit_on_plus_icon_to_increase_the_players_count() throws Throwable {
		 for(int i=1;i<=6;i++)
		 {
	        rate.countplus.click();
		 }
	    }
	 @When("I hit on minus icon to decrease the players")
	 public void i_hit_on_minus_icon_to_decrease_the_players() {
	     // Write code here that turns the phrase above into concrete actions
	     
		  for(int i=6;i>=1;i--)
			 {
		        rate.countminus.click();
			 }
	    }


	    @Then("^verified max players$")
	    public void verified_max_players() throws Throwable {
	       System.out.println(rate.player_value.getText());
	    }
	    
	    @Then("verified min players count")
	    public void verified_min_players_count() {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println(rate.player_value.getText());;
	    }
	    
	    @Then("^I verified Cart as \"([^\"]*)\" selecetd default value$")
	    public void i_verified_cart_as_something_selecetd_default_value(String strArg1) throws Throwable {
	    	String text=rate.cart_ride.getAttribute("checked");
			if (text==strArg1) {
				//System.out.println("Test passed:" +text);
				Assert.assertTrue(rate.cart_ride.getText().contains(strArg1));
				
				}
			else {
				
				Assert.assertTrue(rate.cart_walk.getText().contains(strArg1));
						
			}
				
	    }
	    
	    @When("^I pick hole as (.+)$")
	    public void i_pick_hole_as(String holes) throws Throwable {
	    	//String text=getAttribute("checked");
	    	if(rate.eighteen_holes.getText().equals(prop.getProperty(holes))) {
	    		System.out.println(rate.eighteen_holes.getText());
	    	}
	    	
	    if(rate.nine_holes.getText().equals(prop.getProperty(holes))) {
	    		
	    	
	    	}

	    else {
	    	rate.nine_holes.click();

	   
	    }
	    
	

	    }

	    
	    @Then("rate types are displayed")
	    public void rate_types_are_displayed() {
	        // Write code here that turns the phrase above into concrete actions
	      
	      rate.ratevalue();
	     System.out.println(rate.available_ratetype1.getText());
	     
	      }
	    @Then("^verified  the  (.+) value$")
	    public void verified_the_value(String player) throws Throwable {
//	    	if(player==rate.player_value.getText()) {
	      System.out.println(rate.player_value.getText());
	    //	}
//	    	else {
//	    		System.out.println("no result found");
//	    	}
	    }
	    
	     @Then("^verified the field (.+) option$")
	    public void verified_the_field_option(String hole) throws Throwable {
	    	String text=rate.eighteen_holes.getText();
	    	if(text==hole) {
	        Assert.assertTrue(rate.eighteen_holes.getText().contains(prop.getProperty(hole)));
	    }
	    	else {
	    		Assert.assertTrue(rate.nine_holes.getText().contains(prop.getProperty(hole)));
	    	}
	    }
	   

	     @And("^rate type prices also displayed$")
	     public void rate_type_prices_also_displayed() throws Throwable{
	   System.out.println( rate.ratevalue.getText());
	         
	     }

}

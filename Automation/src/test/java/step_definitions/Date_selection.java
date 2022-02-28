package step_definitions;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;

import PageObjects.Calendar;
import PageObjects.Home;
import Utility.Base;
import cucumber.api.PendingException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Date_selection {
	
	static AndroidDriver driver;
	Calendar c;
	Properties prop;
	public  Date_selection() throws IOException{
		Date_selection.driver=Base.getDriver();
		c= new Calendar(driver);
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
		}
	
	 @When("^I select next button from calendar$")
	    public void i_select_next_button_from_calendar() throws Throwable {
		    c.next_button.click();
	    }

	 @And("^I select following date $")
	    public void i_select_following_date() throws Throwable {
	        throw new PendingException();
	    }
	
	 

	    @Then("^Selected date displayed on Home screen$")
	    public void selected_date_displayed_on_home_screen() throws Throwable {
	    	Calendar c=new Calendar(driver);
	    	System.out.println(c.text_value.getText());
	    	//c.nextmonth_calendarscreen.getText();
	    	//Assert.assert
	    }
	    
	    



	    @And("^I hit on current Date from calendar$")
	    public void i_hit_on_current_date_from_calendar() throws Throwable {	      
	    	c.current_day.click();
	    
	    	
	    	
	
	    	
	    	
	    }

	    @Then("^(.+) is displayed on home screen$")
	    public void is_displayed_on_home_screen(String date) throws Throwable {
	      String text=c.text_value.getText();
	     Assert.assertTrue(text.contains(prop.getProperty(date)));
	     
//	      else {
//	    	text=text+i;
//	    	date=date+i;
//	    	// Assert.assertTrue(text.contains(prop.getProperty(date)));
//	    	 Assert.assertTrue(text.contains(prop.getProperty(date)));
//	      }
	     
	      
	      
	    }


}

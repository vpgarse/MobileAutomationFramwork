package step_definitions;

import org.testng.Assert;

import PageObjects.Playonthecourse;
import PageObjects.SuggestACouse;
import Utility.Base;
import cucumber.api.PendingException;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Suggest_A_Course_Screen {
	
	static AndroidDriver driver;
	public  Suggest_A_Course_Screen(){
		Suggest_A_Course_Screen.driver=Base.getDriver();
		}
		
	
	 @And("^I hit on suggest a course$")
	    public void i_hit_on_suggest_a_course() throws Throwable {
		 Playonthecourse c=new Playonthecourse(driver);
		 //driver.hideKeyboard();
		 c.Suggest_A_Course.click();
	    }

	 @And("^I fill the form with  (.+),(.+), (.+) and (.+)$")
	    public void i_fill_the_form_with_and(String name, String city, String state, String country) throws Throwable {
	     SuggestACouse s=new SuggestACouse(driver);
	    // s.name.click();
		 s.name.sendKeys(name);
		// s.City.click();
		 s.City.sendKeys(city);
		// s.State.click();
		 s.State.sendKeys(state);
	//	s.country.click();
		 s.country.sendKeys(country);
		 
    }

    @Then("^Suggest A Course page is displayed$")
    public void suggest_a_course_page_is_displayed() throws Throwable {
    	SuggestACouse s=new SuggestACouse(driver);
    	Assert.assertEquals("Suggest A Course",s.Title_Suggest_A_Course_page.getText());
    }
    
    @And("^I hit on Submit a course$")
    public void i_hit_on_submit_a_course() throws Throwable {
    	SuggestACouse s=new SuggestACouse(driver);
    	s.Submitcourse.click();
    }


    @Then("^course details are submitted$")
    public void course_details_are_submitted() throws Throwable {
    	SuggestACouse s=new SuggestACouse(driver);
    	Assert.assertEquals("Your Course Has Been Submitted!",s.course_submission.getText());
    }

   

    

}

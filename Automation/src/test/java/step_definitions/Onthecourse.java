package step_definitions;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Home;
import PageObjects.Playonthecourse;
import PageObjects.RangeFinder;
import Utility.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Onthecourse {
	
	 static AndroidDriver driver;
	 
	 
	
	public  Onthecourse(){
		Onthecourse.driver=Base.getDriver();
		}
	
	
			@Then("I hit on golfcart icon")
			public void i_hit_on_golfcart_icon() 
			{
				Home home=new Home(driver);
					
					 home.playonthecourse.click();
				    
			}

			@Then("search on the course screen displayed")
			public void search_on_the_course_screen_displayed() throws InterruptedException 
			{
				 Playonthecourse c=new Playonthecourse(driver);
			   Assert.assertEquals( "Find Your Course" ,c.Find_your_course.getText());
			   Thread.sleep(1000);
			}
		
			 @When("^I hit on search box$")
			 public void i_hit_on_search_box() throws Throwable 
			 {
				 Playonthecourse c=new Playonthecourse(driver);
				 c.search_course_Onthecourse.click();
			 }

			 @And("^I search with (.+)$")
			    public void i_search_with(String coursename) throws Throwable {
				Playonthecourse c=new Playonthecourse(driver);
				 c.search_course_Onthecourse.sendKeys(coursename);
				 Thread.sleep(1000);
				 c.course_suggestion_Onthecourse.click();
			 }


			@Then("Course GPS screeen is displayed")
			
			public void course_GPS_screeen_is_displayed() 
			{
				 Playonthecourse c=new Playonthecourse(driver);
				 c.Course_GPS_Screen.getText();
			    
			}
			 @Then("^Recent tab is  displaying default$")
			    public void recent_tab_is_displaying_default() throws Throwable {
				 Playonthecourse c=new Playonthecourse(driver);
				 Assert.assertEquals("Recent",c.Recent_tab.getText());
			    }
			 
			 @Then("Suggested tab is displaying")
			 public void suggested_tab_is_displaying() {
				 Playonthecourse c=new Playonthecourse(driver);
				 Assert.assertEquals("Suggested", c.Suggested.getText());
			 }
			 	
			 @Then("previous serach result displayed in Recent tab")
			 public void previous_serach_result_displayed_in_Recent_tab() throws InterruptedException {
				 Playonthecourse c=new Playonthecourse(driver);
				
				 List <MobileElement > l=driver.findElements(By.xpath("//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'searchResultRecycler')]"));
					l.size();
					for(int j=0;j<l.size();j++) {
						System.out.println(l.get(j).getText());
						Thread.sleep(1000);
						
					}
			    }
			 
			 //@TC_POC_08
			  @And("^I hit on Course GPS screen$")
			    public void i_hit_on_course_gps_screen() throws Throwable {
			    	 Playonthecourse c=new Playonthecourse(driver);
			    	 c.Course_GPS_Screen.click();
			    	 
			    	 
			    }
			 
			  @Then("range finder screen is displayed")
			  public void range_finder_screen_is_displayed() throws InterruptedException {	
			
				 
				  System.out.println("rangefinder is displayed");		  
			  
			  	 
			    }
			  @And("^I click on Course GPS Settings$")
			    public void i_click_on_course_gps_settings() throws Throwable {
			       
			     RangeFinder range=new RangeFinder(driver);
			    range.settings.click();	
			  }


			

			  
}

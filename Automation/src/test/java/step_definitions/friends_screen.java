package step_definitions;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import PageObjects.SignIn;
import PageObjects.friends;
import Utility.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class friends_screen {
	
	
	static AndroidDriver driver;
	friends friend;
	SignIn signin;
	Properties prop;
	public  friends_screen() throws InterruptedException, IOException{
		friends_screen.driver=Base.getDriver();
		friend=new friends(driver);
		signin=new SignIn(driver);
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
	}
		
	@Then("I click on friends")
	public void i_click_on_friends() {
	    // Write code here that turns the phrase above into concrete actions
	     signin.Friends.click();
	    }

	@Then("friend screen is displayed")
	public void friend_screen_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	       friend.Friends_title.getText();
	    }

	  //TC_FR_2
	@Then("I click on Add friend")
	public void i_click_on_Add_friend() {
	    // Write code here that turns the phrase above into concrete actions
	  friend.Addfriend.click();
	}
	@Then("Addfriend screen is displayed")
	public void addfriend_screen_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   friend.change_photo.getText();
	}

	@And("^I click on (.+) and (.+)$")
    public void i_click_on_and(String firstname, String lastname) throws Throwable {
       
       friend.firstname.sendKeys(prop.getProperty(firstname));
       friend.lastname.sendKeys(prop.getProperty(lastname));
    }
    @Then("I hit on Done")
    public void i_hit_on_Done() {
        // Write code here that turns the phrase above into concrete actions
        friend.done.click();
    }
	
    
    @Then("confirmation message displyed")
    public void confirmation_message_displyed()  {
	       String text= friend.confirm_message.getText();
	        Assert.assertEquals(text, "Yours friend was successfully created. Thanks you!");
	    }

	    @Then("^friend added successfully to list$")
	    public void friend_added_successfully_to_list() throws Throwable {
	      System.out.println(friend.friends_list_name.getText());
	    		  }


	 
	    @And("^I hit ok")
	    public void i_hit_ok() throws Throwable {
	       friend.OK.click();
	    }
	    
	    
	    //@TC_FR_3
	    
	    @And("^I send (.+) and (.+)$")
	    public void i_send_and(String firstname, String lastname) throws Throwable {
	        
	    	friend.firstname.sendKeys(firstname);
	        friend.lastname.sendKeys(lastname);
	    }


@Then("invalid invalid firstname should display")
public void invalid_invalid_firstname_should_display() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals(friend.invalid_firstname.getText(),"Invalid first name." );
}

@Then("invalid invalid lastname should display")
public void invalid_invalid_lastname_should_display() {
    // Write code here that turns the phrase above into concrete actions
	 Assert.assertEquals(friend.invalid_lastname.getText(),"Invalid last name." );
}

	    
	    //TC_FR_4

	    @Then("^I click on change photo$")
	    public void i_click_on_change_photo() throws Throwable {
	        friend.change_photo.click();
	    }

	    @Then("^change photo drop down displayed$")
	    public void change_photo_drop_down_displayed() throws Throwable {
	        String text=friend.title_sheet_title.getText();
	        Assert.assertEquals(text, "Change photo from");
	    }
	    
	    //Tc_FR_5
	    @Then("I select Camera")
	    public void i_select_Camera() {
	        // Write code here that turns the phrase above into concrete actions
	       friend.change_photo_camera.click();
	    }
	    @Then("camera screen is displayed")
	    public void camera_screen_is_displayed() {
	       System.out.println("camera opened");
	    }
	    
	    //TC_FR_6
	    @Then("^Gallery in phone is displayed$")
	    public void gallery_in_phone_is_displayed() throws Throwable {
	        System.out.println("Gallary opened");
	    }

	    @And("^I select Gallery$")
	    public void i_select_gallery() throws Throwable {
	      friend.change_photo_gallery.click();
	    }
	    
	    
	    //TC_FR_7
	    @And("^I hit on cancel$")
	    public void i_hit_on_cancel() throws Throwable {
	     friend.btn_cancel.click();
	    }
	    
	    @Then("change photo drop down is closed")
	    public void change_photo_drop_down_is_closed() {
	        // Write code here that turns the phrase above into concrete actions
	    
	       Assert.assertEquals(friend.change_photo.getText(), "Change photo");
	    }

	    //TC_FR_8
	    @Then("^friend profile is displayed$")
	    public void friend_profile_is_displayed() throws Throwable {
	    	Assert.assertEquals("Change photo", friend.change_photo.getText());
	    }

	    @Then("^I hit on Remove friend$")
	    public void i_hit_on_remove_friend() throws Throwable {
	       friend.Removefriend.click();
	    }
	    @Then("confirmation message of remove friend displyed")
	    public void confirmation_message_of_remove_friend_displyed() {
	        //friend.confirm_message.click();
	        Assert.assertEquals(friend.confirm_message.getText(), "Your friend was successfully removed. Thanks you!");
	    }

	    @Then("^friend is removed from the friends list$")
	    public void friend_is_removed_from_the_friends_list() throws Throwable {
	        System.out.println(friend.friends_list_name.getText());
	    }
	    
	    @And("^I  hit on friend from friends list$")
	    public void i_hit_on_friend_from_friends_list() throws Throwable {
	      friend.friends_list_name.click();
	    }

	    
	    @Then("^alertmessages are displaying$")
	    public void alertmessages_are_displaying() throws Throwable {
	     friend.invalid_firstname.getText().contains("Invalid first name. ");
	     friend.invalid_lastname.getText().contains("Invalid last name.");
	    }
	    
}




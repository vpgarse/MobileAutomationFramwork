package step_definitions;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;

import PageObjects.Coursereviews;
import PageObjects.Home;
import PageObjects.Profile;
import PageObjects.SignIn;
import PageObjects.Signup;
import PageObjects.editprofileScreen;
import Utility.Base;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MySG_Profile {
	
	static AndroidDriver driver;
	Home home;
	SignIn signin;
	Profile myprofile;
	Signup signup;
	editprofileScreen edit;
	Properties prop;
	public  MySG_Profile() throws InterruptedException, IOException{
		MySG_Profile.driver=Base.getDriver();
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
				prop.load(fis);
		home=new Home(driver);
		signin=new SignIn(driver);
		myprofile=new Profile(driver);
		edit=new editprofileScreen(driver);
		signup=new Signup(driver);
		
	}
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
	
	 @Then("^hit on View Profile  button$")
	    public void hit_on_view_profile_button() throws Throwable {
		 log.info("Hitting on view profile");
	       myprofile.view_profile.click();
	    }

	    @Then("^user profile is displayed$")
	    public void user_profile_is_displayed() throws Throwable {
	        System.out.println(myprofile.username.getText());
	    }

	    
	    
	    //TC_PR_3
	    @Then("^Player stats are displayed$")
	    public void player_stats_are_displayed() throws Throwable {
	        System.out.println(myprofile.player_stats.getText());
	        
	    }
	    
	    //@TC_PR_4
	    
	    @And("^I hit on edit button$")
	    public void i_hit_on_edit_button() throws Throwable {
	       myprofile.edit.click();
	    }
	    
	    
	    @Then("^Edit profile screen is displayed$")
	    public void edit_profile_screen_is_displayed() throws Throwable {
	       String text= edit.Edit_Account.getText();
	       log.info(text);
	       // Assert.assertEquals("Change photo",text );
	    }

	    //@TC_PR_5
	    
	    @And("^I hit on Skill level$")
	    public void i_hit_on_skill_level() throws Throwable {
	        edit.skill_level.click();
	        Thread.sleep(1000);
	    }

	   
	   
	    @Then("^skill levels are displayed$")
	    public void skill_levels_are_displayed() throws Throwable {
	      String text=edit.skill_level.getText();
	      Assert.assertEquals("Skilllevels:", text);
	     
	    } 
	   
	    @And("^I select  (.+)$")
	    public void i_select(String skilllevel) throws Throwable {
	       switch(skilllevel){
	       
	       case "Beginner":edit.beginner.click();
	       Thread.sleep(1000);
	       		break;
	       case "Intermediate" : edit.intermediate.click();
	       		break;
	       case "Advanced": edit.Advanced.click();
	       		break;
	       case "Expert": edit.Expert.click();
	       		break;
	       default: 
				break;
	       }     
	       
	       }
	    
	    
	    @Then("^selected (.+) is displayed in skilllevel field$")
	    public void selected_is_displayed_in_skilllevel_field(String skilllevel) throws Throwable{
	        // Write code here that turns the phrase above into concrete actions
	    	log.info(edit.skilllevel_value.getText());
	    	//Assert.assertEquals(skilllevel, edit.skilllevel_value.getText());
	    	
	    	Assert.assertTrue(edit.skilllevel_value.getText().contains(skilllevel));
	    	
	    
	    	
	    	
	        }
	    
	    
		//@TC_PR_6	    
	    
	    
	    @And("^I hit on Frequency$")
	    public void i_hit_on_frequency() throws Throwable {
	       edit.frequency.click();
	    }

	    @And("^I pick a  (.+) value from dropdown$")
	    public void i_pick_a_value_from_dropdown(String frequency) throws Throwable {
	       
	    	switch(frequency) {
	    	case "Few times a week": edit.Few_times_a_week.click();
	    			break;
	    	case "Once a week": edit.Once_a_week.click();
	    			break;
	    			
	    	case "Once a month": edit.Once_a_month.click();
	    			break;
	    			
	    	case "Once every three months": edit.Once_every_three_months.click();
	    		 break;
	    		
	    	case "Twice a year": edit.Twice_a_year.click();
	    		 break;
	    		 
	    	case "Once a year": edit.Once_a_year.click();
	    		break;
	    	
	    	
	    	}
	    }
	    @Then("^selected (.+)  is displayed  in frequency field$")
	    public void selected_is_displayed_in_frequency_field(String frequency) throws Throwable {
	       Assert.assertTrue(edit.frequency_value.getText().contains(frequency));
	    }

	    
	  //  @TC_PR_7

	    @And("^I hit on Handicap$")
	    public void i_hit_on_handicap() throws Throwable {
	       edit.handicap.click();	  
	       }
	    
	      
	   

	    


	    @When("^I enter the handicap field with  (.+)  $")
	    public void i_enter_the_handicap_field_with(String handicapvalue) throws Throwable {
	     
	       edit.remove_handicaptext.click();
	       edit.handicap_select.sendKeys(prop.getProperty(handicapvalue));
	    }
	    
	    @Then("I click on update handicap")
	    public void i_click_on_update_handicap() {
	        // Write code here that turns the phrase above into concrete actions
	       
	        edit.update_handicap.click();
	    }
	    @Then("handicap level displayed in handicap field")
	    public void handicap_level_displayed_in_handicap_field() {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println(edit.handicap_value.getText());
	    }

	    //TC_PR_8	    
	    

	    @And("^I hit on Focus$")
	    public void i_hit_on_focus() throws Throwable {
	       edit.Focus.click();
	    }
	    @Then("^Focus  dropdown is displayed$")
	    public void focus_dropdown_is_displayed() throws Throwable {
	    	
	    	//System.out.println(edit.Focus.getText());
	      Assert.assertEquals("Focus:", edit.Focus.getText());
	    }
	   
	    @And("^I have selected (.+)$")
	    public void i_have_selected(String options) throws Throwable {

	        switch (options) {
	        case "Recreation": edit.Recreation.click();
	        	break;
	        case "Business": edit.Business.click();
	        	break;
	        case "Pro": edit.Pro.click();
	        	break;
	        case "Sport": edit.Sport.click();
	        	break;
	        default:
	        	break;
	        	
	        	
	        }
	        	
	    }

	    @Then("^selected focus (.+) is dispalyed in focus field$")
	    public void selected_focus_is_dispalyed_in_focus_field(String options) throws Throwable {
	       Assert.assertTrue(edit.focus_value.getText().contains(options));
	       // System.out.println(edit.focus_value.getText());
	    }

	    
	    @Then("hit on Done button")
	    public void hit_on_Done_button() {
	        // Write code here that turns the phrase above into concrete actions
	        edit.Done.click();
	    }

	    //TC_PR_10
	    @When("^I hit on plus icon in edit account screen$")
	    public void i_hit_on_plus_icon_in_edit_account_screen() throws Throwable {
	       
	       edit.plusicon.click();
	    }


	    @Then("^\"([^\"]*)\" from screen is dipslayed$")
	    public void something_from_screen_is_dipslayed(String strArg1) throws Throwable {
	       
	    	assertTrue(edit.Change_photo_from.getText().contains(strArg1));
	       //System.out.println(edit.Change_photo_from.getText());
	    }
	  

	    @Then("^selected photo screen is displayed$")
	    public void selected_photo_screen_is_displayed() throws Throwable {
	       
	    	  System.out.println("camera/gallery open");
	   	   
	    }

	    @Then("^I have choosen (.+)$")
	    public void i_have_choosen(String optionofphoto) throws Throwable {
	      switch(optionofphoto) {
	        case "Camera": edit.Camera.click();
	        	break;
	        case "Gallery": edit.Gallery.click();
	        	break;
	        default:
	        	break;	
	        }
	    }

	  

	    @And("^I click on  zipcode close button$")
	    public void i_click_on_zipcode_close_button() throws Throwable {
	        edit.remove_locationtext.click();
	    }
	  
	   
	    	
	    @When("^I enter in zipcode field with (.+) $")
	    public void i_enter_in_zipcode_field_with(String newzipcode) throws Throwable {
	    	   //edit.editlocation_input.sendKeys(prop.getProperty(newzipcode));
	    	edit.remove_locationtext.sendKeys(prop.getProperty(newzipcode));
	    	//edit.location_input.sendKeys(prop.getProperty(newzipcode));
	    }

	    @Then("^location is updated $")
	    public void location_is_updated() throws Throwable {
	      edit.location.getText();
	    }

	    @And("^I click on update location button $")
	    public void i_click_on_update_location_button() throws Throwable {
	    	edit.Update_location.click();
	    }



	    //TC_PR_12 to TC_PR_15
	    
	    @And("^ I hit on cancel $")
	    public void i_hit_on_cancel() throws Throwable {
	        edit.Cancel.click();
	    }
	    
	    //TC_PR_16
	    @When("^I hit on back button$")
	    public void i_hit_on_back_button() throws Throwable {
	        edit.backbutton.click();
	    }
	    
	    @Then("^Profile screen is dispalyed$")
	    public void profile_screen_is_dispalyed() throws Throwable {
	        System.out.println(myprofile.username.getText());
	    }
	    
	    //TC_PR_17
	    @When("^I click on Password screen$")
	    public void i_click_on_password_screen() throws Throwable {
	    	Dimension size=driver.manage().window().getSize();
	          int x=size.getWidth()/2;
	          int starty=(int)(size.getHeight()*0.60);
	          int endy=(int)(size.getHeight()*0.10);
	          new TouchAction(driver).press(point(x,starty)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endy,x)).release().perform();
	      edit.password.click();
	    }

	    @Then("^Password update screen  is opened$")
	    public void password_update_screen_is_opened() throws Throwable {
	    // log.info( edit.Current_password.getText());
	    }
	    
	    
	    @And("^I fill in  password screen with  (.+),(.+) and (.+) values$")
	    public void i_fill_in_password_screen_with_and_values(String currentpassword, String newpassword, String confirmnewpassword) throws Throwable {
	       
	        edit.Current_password.sendKeys(prop.getProperty(currentpassword));
	        edit.New_password.sendKeys(prop.getProperty(newpassword));
	        edit.ConfirmNew_password.sendKeys(prop.getProperty(confirmnewpassword));
	    }
	    

	    @Then("^Password is updated with new changes$")
	    public void password_is_updated_with_new_changes() throws Throwable {
	      log.info(edit.pwd_field.getText());
	    }

	    @And("^I hit on Update Password$")
	    public void i_hit_on_update_password() throws Throwable {
	      edit.Update_Password.click();
	    }
	    
	    @And("^I click on Email to edit the email$")
	    public void i_click_on_email_to_edit_the_email() throws Throwable {
	       edit.edit_email.click();
	    }
	    @And("^I click on (.+) to edit$")
	    public void i_click_on_to_edit(String emailfield) throws Throwable {
	        edit.emailedittext.sendKeys(emailfield);
	        driver.hideKeyboard();
	    }

	    @And("^I click on update email$")
	    public void i_click_on_update_email() throws Throwable {
	       edit.Update_Email.click();
	    }
	   
	    @When("^I fill the name field with (.+) and (.+)$")
	    public void i_fill_the_name_field_with_and(String fname, String lname) throws Throwable {
	       edit.fnameedittext.sendKeys(prop.getProperty(fname));
	       edit.lnameedittext.sendKeys(prop.getProperty(lname));
	       driver.hideKeyboard();
	    }

	    @Then("^updated name is displayed in profile screen$")
	    public void updated_name_is_displayed_in_profile_screen() throws Throwable {
	     log.info(edit.editname.getText());
	    }

	    @And("^I click on Name to edit the name$")
	    public void i_click_on_name_to_edit_the_name() throws Throwable {
	        edit.editname.click();
	    }

	    @And("^I hit  update the name$")
	    public void i_hit_update_the_name() throws Throwable {
	        edit.Update_Name.click();
	    }

	    @And("^I hit logout$")
	    public void i_hit_logout() throws Throwable {
	       myprofile.Log_out.click();
	    }
	    @Then("I tap on yes")
	    public void i_tap_on_yes() {       

	       
	        myprofile.yes.click();  
	        }

	    @Then("^\"([^\"]*)\" message is displayed$")
	    public void something_message_is_displayed(String strArg1) throws Throwable {
	    	String text=myprofile.confirm_message.getText();
	    			//log.info(text);
	    	Assert.assertEquals(strArg1, text);
	    	assertTrue(myprofile.confirm_message.getText().contains(strArg1));
	    }
	  

	    @Then("{string} is displayed on my SG screen")
	    public void is_displayed_on_my_SG_screen(String string) {
	       
	        
	     
	    	assertTrue (signup.Register_account.getText().contains(string));
	    }
	    

	    @Then("^captured account name$")
	    public void captured_account_name() throws Throwable {
	      log.info(edit.editname.getText());
	    }
	    
	    
	    @Then("^I hit on location field$")
	    public void i_hit_on_location_field() throws Throwable {
	    	Dimension size=driver.manage().window().getSize();
	          int x=size.getWidth()/2;
	          int starty=(int)(size.getHeight()*0.60);
	          int endy=(int)(size.getHeight()*0.10);
	          new TouchAction(driver).press(point(x,starty)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(endy,x)).release().perform();
	       edit.location.click();
	    }

	    @Then("^zipcode  should display$")
	    public void zipcode_should_display() throws Throwable {
	      log.info( edit.location_input.getText());
	    }
	    

	    @Then("^displayed (.+) in location field$")
	    public void displayed_in_location_field(String zipcode) throws Throwable{
	      
	        
	 
	        Assert.assertTrue(edit.location_input.getText().contains(prop.getProperty(zipcode)));
	    }
}

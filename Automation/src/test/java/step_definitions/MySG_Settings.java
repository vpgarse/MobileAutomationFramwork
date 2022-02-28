package step_definitions;

import PageObjects.Settings;
import PageObjects.SignIn;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySG_Settings {
	
	static AndroidDriver driver;
	Settings settings;
	SignIn signin;
	public  MySG_Settings() throws InterruptedException{
		MySG_Settings.driver=Base.getDriver();
		settings=new Settings(driver);
		signin=new SignIn(driver);
		
	}
	//@TC_SE_1
	 @Then("^settings screen is displayed$")
	    public void settings_screen_is_displayed() throws Throwable {
	       System.out.println(settings.settings_title.getText());
	    }

	    @And("^I hit on Settings$")
	    public void i_hit_on_settings() throws Throwable {
	        signin.Settings.click();
	    }
	
	    //@TC_SE_2
	    @Then("^user agreement static page is displayed$")
	    public void user_agreement_static_page_is_displayed() throws Throwable {
	        
	    }

	    @And("^I hit on User Agreement$")
	    public void i_hit_on_user_agreement() throws Throwable {
	        settings.user_agreement.click();
	    }
	    
	    
	    //@TC_SE_3
	    @Then("^privacy policy static page is displayed$")
	    public void privacy_policy_static_page_is_displayed() throws Throwable {
	        
	    }

	    @And("^I hit on Privacy policy$")
	    public void i_hit_on_privacy_policy() throws Throwable {
	        settings.Privacypolicy.click();
	    }

	    //TC_SE_4
	    @Then("^FAQ's page is displayed$")
	    public void faqs_page_is_displayed() throws Throwable {
	       
	    }

	    @And("^I hit on HelpandFAQ's$")
	    public void i_hit_on_helpandfaqs() throws Throwable {
	        settings.Help_FAQ.click();
	    }
	    
	    //TC_SE_5
	    @Then("^My SG screen is displayed$")
	    public void my_sg_screen_is_displayed() throws Throwable {
	        
	    }

	    

	    
}

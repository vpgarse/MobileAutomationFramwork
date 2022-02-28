package step_definitions;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Home;
import PageObjects.SignIn;
import PageObjects.Signup;
import PageObjects.signinfacebook;
import PageObjects.signinwithgoogle;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class signin {
	static AndroidDriver driver;
	SignIn login;
	Home home;
	Signup signup;
	Properties prop;
	signinwithgoogle google_signin;
	signinfacebook facebook_signin;
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  signin() throws InterruptedException, IOException{
		signin.driver=Base.getDriver();		
		login=new SignIn(driver);
		home=new Home(driver);
		signup=new Signup(driver);
		google_signin =new signinwithgoogle(driver);
		facebook_signin=new signinfacebook(driver);
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				  "\\src\\test\\java\\Utility\\global.properties");
		//FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
				prop.load(fis);
	}
	 @And("I tap on My SG")
	    public void i_tap_on_My_SG() {
	        // Write code here that turns the phrase above into concrete action {
	    	log.info("hitting on my SG ");
	       home.My_SG.click();
	    }
	 @Then("^sign in page is displayed$")
	    public void sign_in_page_is_displayed() throws Throwable {
	       String text= login.title_Signin.getText();
	       Assert.assertEquals(text, "Sign in to your existing profile."); //Log in to your account
	       
	    }
	
	 @And("I hit on Sign In")
	    public void i_hit_on_Sign_In() {
	    	log.info("hitting on Sign in");

	        // Write code here that turns the phrase above into concrete action
	        login.signin.click(); //click on 'Login' option of 'Already with us'
	    }
	 
	    
	 @When("I log in with  (.+) and  (.+)$")
	    public void i_log_in_with_and(String email, String password) throws Throwable {
	       
	        
	       login.email.sendKeys(prop.getProperty(email));
	      login.password.sendKeys(prop.getProperty(password));
	       driver.hideKeyboard();
	       
	       
	    }

	 

	    
	    @And("I select login$")
	    public void i_select_login() throws Throwable {
	    	login.signin_button.click();
	    }


	    @Then("My SG dahboard is displayed$")
	    public void my_sg_dahboard_is_displayed() throws Throwable {
	    	Thread.sleep(1500);	
    	try{
	    	if(login.checkbox_welcome.isDisplayed()) {
	    		String s=login.checkbox_welcome.getAttribute("checked");
	    		if(s=="false") {
	    		    	login.checkbox_welcome.click();
	    		}
	    		    	login.bookurftt_button.click();
	    	}
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
	    	
	    	WebDriverWait wait = new WebDriverWait(driver,50);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Where are you golfing?']"))); //Find your tee time
	    	//wait.until(ExpectedConditions.profile_name); //Find your tee time
			wait.until(ExpectedConditions.visibilityOf(login.profile_name));
	    	Thread.sleep(1500);	
	    	
	        log.info(login.profile_name.getText());
	    }
	    

	    @Then("validation message is displayed$")
	    public void validation_message_is_displayed() throws Throwable {
	     log.info(login.errormessage.getText());
	    }

	 

	    @When("^I hit on forgot password$")
	    public void i_hit_on_forgot_password() throws Throwable {
	       login.forgotpassword.click();
	    }

	    @Then("^Forgot password screen opened$")
	    public void forgot_password_screen_opened() throws Throwable {
	      log.info(login.forgotpassword_title.getText());
	    }

	    @Then("^Password reset message will display$")
	    public void password_reset_message_will_display() throws Throwable {
	       log.info("password reset message");
	    }

	    @When("I hit on Reset Password screen")
	    public void i_hit_on_Reset_Password_screen() {
	        login.resetpwd.click();
	    }
	    @When("^I hit on  email Field (.+)$")
	    public void i_hit_on_email_field(String existingemail) throws Throwable {
	        login.email_for_forgotpwd.sendKeys(prop.getProperty(existingemail));
	    }
	
	    @When("^I hit on Sign up button$")
	    public void i_hit_on_sign_up_button() throws Throwable {
	       login.SignUp.click();
	    }

	    @Then("^Sign up screen is displayed$")
	    public void sign_up_screen_is_displayed() throws Throwable {
	    log.info(signup.title_signup.getText());
	    }
	    
	    @Then("^email or password error message is dispalyed$")
	    public void email_or_password_error_message_is_dispalyed() throws Throwable {
	      log.info(login.email_message_eror.getText());
	    }
	    @Then("^My SG Screen is displayed$")
	    public void my_sg_screen_is_displayed() throws Throwable {
	        log.info(login.title_sg.getText());
	    }
	    
	    @When("^I hit on continue with google$")
	    public void i_hit_on_continue_with_google() throws Throwable {
	      google_signin.googl_signin.click();
	    }

	    @Then("^ChooseAccount Page dispalyed$")
	    public void chooseaccount_page_dispalyed() throws Throwable {
	        google_signin.Titleof_Googleaccount.getText();
	    }
	    @When("^I click on email which already displaying$")
	    public void i_click_on_email_which_already_displaying() throws Throwable  {
	       google_signin.Default_Email.click();
	    }
	    
	    @When("^I click on Use another account Page$")
	    public void i_click_on_use_another_account_page() throws Throwable {
	        google_signin.add_AnotherAccount.click();
	    }
	    @When("^I use google (.+) and click on Next$")
	    public void i_use_google_and_click_on_next(String email) throws Throwable {
	    	   google_signin.Email.sendKeys(prop.getProperty(email));
	    	   google_signin.Next.click();;
	       }

	    @And("^I use google  (.+) and I click on Next$")
	    public void i_use_google_and_i_click_on_next(String password) throws Throwable {
	        google_signin.Password.sendKeys(prop.getProperty(password));
	        google_signin.Next.click();
	    }
	   
	 

	    @And("^I click on I agree button$")
	    public void i_click_on_i_agree_button() throws Throwable {
	    	if(google_signin.IAgree.isDisplayed()) {
	    	
	       google_signin.IAgree.click();
	    	}
	       Thread.sleep(1000);
	    }


	    @When("^I hit on continue with Facebook$")
	    public void i_hit_on_continue_with_facebook() throws Throwable {
	       facebook_signin.facebook_signin.click();
	    }

	    @When("^I tap on the email which already displaying$")
	    public void i_tap_on_the_email_which_already_displaying() throws Throwable {
	       facebook_signin.account_exits.click();
	    }


	    @Then("^facebook account page is displaying$")
	    public void facebook_account_page_is_displaying() throws Throwable {
	        facebook_signin.createnewaccount.getText();
	    }



	    @When("^I type (.+) and (.+)$")
	    public void i_type_and(String phoneoremail, String password) throws Throwable{
	       
	    	//facebook_signin.tap.click();
	        facebook_signin.phone_email.sendKeys(prop.getProperty(phoneoremail));
	        driver.navigate().back();
	        facebook_signin.password.sendKeys(prop.getProperty(password));
	    }

	    @And("^I click on Loginto another account$")
	    public void i_click_on_loginto_another_account() throws Throwable {
	       facebook_signin.logintoanotheraccount.click();
	    }

	    @And("^I hit on facebooklogin$")
	    public void i_hit_on_facebooklogin() throws Throwable {
	       facebook_signin.login.click();
	    }
	   

	    
}

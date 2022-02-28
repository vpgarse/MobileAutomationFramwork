package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignIn {

	
	public SignIn(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xapth for mY SG page title text
	@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
	public WebElement title_sg;
	
	//xpath for sign in header
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_onboarding_subtitle')]") ////android.widget.TextView[contains(@resource-id,'tv_title')]"
	public WebElement title_Signin;
	
	//xpath for sign in
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_onboarding_sign_in')]") ////android.widget.Button[contains(@resource-id,'btn_onboarding_sign_in')]
	public WebElement signin;
	
	//xpath for email
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your email address']") ////android.widget.EditText[@text='example@email.com']
	public WebElement email;
	
	
	//xpath for password
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your password']") ////android.widget.EditText[@text='••••••••']
	public WebElement password;
	
	//xpath for sign_button
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_sign_in')and (@text='Sign in')]")
	public WebElement signin_button;
	
	//xpath for WelcomeToSupremeGolf page(CheckBox of to receive emails)
		@AndroidFindBy(xpath="//android.widget.CheckBox[contains(@resource-id,'cb_email_opt_in')]") //(Enhancement) and (@checked='false')
		public WebElement checkbox_welcome;
		
	//xpath for WelcomeToSupremeGolf page(Book your first tee time button)
		@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_welcome')]and (@text='Book your first tee time')") //(Enhancement)
		public WebElement bookurftt_button;	
	
	//xpath for profilename
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_user_greeting')]") //(@resource-id,'tv_dashboard_user_greeting')
	public WebElement profile_name;
	
	//xpath for settings
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	public WebElement Settings;
	
	//xpath for rewards
	@AndroidFindBy(xpath="//android.widget.TextView[@text='My Rewards']")
	public WebElement Rewards;
	
	//xpath for friends
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Friends']")
	public WebElement Friends;
	
	//xpath for Bookings
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Bookings']")
	public WebElement bookings;
	
	
	
	//xpath for signup don'thave account
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'btn_sign_in_to_sign_up')]")
	public WebElement signup;
	
		//xpath fro errormessage
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_form_bottom_message')]")
	public WebElement errormessage;
	
	//xpath for payment methods
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment Methods']")
	public WebElement paymentmethods;
	
	
	//xapth for forgot password
	@AndroidFindBy(xpath="//android.widget.Button[@text='Forgot Password?']")
	public WebElement forgotpassword;
	
	//xapth for Signup
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Don’t have an account? Create Account']") //Satya[@text='Start with email']//android.widget.Button[@text='Sign Up']"
	public WebElement SignUp;
	
	//xpath for Forgot password_title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Forgot Your Password?']") //android.widget.TextView[@text='Forgot password']
	public WebElement forgotpassword_title;
	
	//xpath for email address
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your email address']") ////android.widget.EditText[@text='example@email.com']
	public WebElement email_for_forgotpwd;
	
	//xapth for reset password
	@AndroidFindBy(xpath="//android.widget.Button[@text='Send me reset instructions']") //Send me reset instructions [@text='Reset Password']
	public WebElement resetpwd;
	
	//xpath for email or owd error
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
	public WebElement email_message_eror;
}

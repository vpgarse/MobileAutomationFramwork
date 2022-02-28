package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Signup {
	
	public Signup(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	//xpath for Sign up
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_onboarding_sign_up')]")
	public WebElement Register_account;
	
	//xpath for Signup title
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_onboarding_title')]") ////android.widget.TextView[contains(@resource-id,'tv_title')]
	public WebElement title_signup;
	
		//xpath for Sign up Firstnme
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your first name']") //.EditText[@text='First name']
		public WebElement FirstName;
		
		//xpath for Sign up LastName
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your last name']") //.EditText[@text='Last name']
		public WebElement LastName;
		
		//xpath for zipcode
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your zip code']") //.EditText[@text='12345']
		public WebElement zipcode;
		
		//xpath for referalcode
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your code']") //.EditText[@text='Your code']
		public WebElement referalcode;
		
		//xpath for email
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter your email address']") //.EditText[@text='example@email.com']
		public WebElement email;
		
		//xpath for password
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Choose your password']") //widget.EditText[@text='••••••••']
		public WebElement Password;
		
		//xpath for accept terms&conditions
		@AndroidFindBy(xpath="//android.widget.CheckBox[contains(@resource-id,'cb_email_opt_in')]") //(@resource-id,'cb_sign_up_accept_terms_and_conditions')
		public WebElement checkbox_terms_conditions;
		
		
		//xpath for show the password
		@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_show_password')]") //.TextView[contains(@resource-id,'tv_show_password')]
		public WebElement Show_password;
		
		//xapth for create account
		@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_sign_up')]") 
		public WebElement Create_account;
		
		//xpath for Login 
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_already_have_an_account_question')]") //.Button[(@resource-id,'btn_sign_up_to_sign_in')
		public WebElement login;
		
		//xpath for back button
		@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
		public WebElement backbutton;
		
		//xpath for email validation 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='This email address is already taken.']")
		public WebElement email_validation;
		
}

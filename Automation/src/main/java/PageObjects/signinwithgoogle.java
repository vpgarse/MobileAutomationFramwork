package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class signinwithgoogle {
	
	//xpath forsignin with google 
	public signinwithgoogle(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign in with Google']") //Button[@text='Continue with Google']
	public WebElement googl_signin;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'google_login_button')]")
	public WebElement SigninWithGoogle;
	//xpath for choose ana ccount
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'main_title')]")
	public WebElement Titleof_Googleaccount;
	
	//xpath for Useanother 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add another account']")
	public WebElement add_AnotherAccount;

	//xpathfor email
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='identifierId']")
	public WebElement Email;
	
	//xpath for Create account
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='android.widget.Button']")
	public WebElement CreateAccount;
	
	
	//xapth for next button	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Next']")
	public WebElement Next;
	
	//xapth for password
	@AndroidFindBy(xpath="//android.widget.EditText")
	public WebElement Password;
	
	//xpath for passwordnext
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'passwordNext')]")
	public WebElement PasswordNext;
	
	
	//xpath for I Agree
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='signinconsentNext']")
	public WebElement IAgree;
	
	
	//xapth for Error meessage
	@AndroidBy(xpath="//androidx.appcompat.widget.N[contains(@resource-id,'parentPanel')]")
	public WebElement errormessage;
	
	//xpath for errortext
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/message']")
	public WebElement errortext;
	
	//xpath for ok 
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	public WebElement Okaey;
	
	
	//xapth for Crete GoogleAccount	
	@AndroidFindBy(xpath="//android.view.View[@resource-id=headingText]")
	public WebElement Create_Google_account;
	
	//xpath to choose account which displays 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'account_display_name')]")
	public WebElement Default_Email;
	
}

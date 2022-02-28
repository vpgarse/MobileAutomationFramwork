package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class signinfacebook {
	
	public signinfacebook(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for facebok sign inbutton
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign in with Facebook']") //Button[@text='Continue with Facebook']
	public WebElement facebook_signin;
	
	//xpath to pick already account added	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index='0']")
	public WebElement account_exits;
	
	//xpath for login another account
	@AndroidFindBy(xpath="//android.widget.Button[@text='Log Into Another Account']")
	public WebElement logintoanotheraccount;
	
	//xapth for Creaet new account	
	@AndroidFindBy(xpath="//android.widget.Button[@text='CREATE NEW FACEBOOK ACCOUNT']")
	public WebElement createnewaccount;
	
	//xpath for clickable
	@AndroidFindBy(xpath="android.widget.EditText[@clickable='true']")
	public WebElement tap;
	//xpath for phoneor email
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Phone or email']")
	public WebElement phone_email;
	
	//xpath for Passwrd
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	public WebElement password;
	
	//xpath for login
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']")
	public WebElement login;
	
}

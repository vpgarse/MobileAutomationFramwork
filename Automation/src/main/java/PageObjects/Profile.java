package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Profile {
	

	public Profile(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	//xpath for profile name
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_dashboard_user_greeting')]")
	public WebElement profile_name;

	//xpath for View profile icon
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_dashboard_view_profile')]")
	public WebElement view_profile;
	
	
	//xpath for  user name on profile screen
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_user_name')]")
	public WebElement username;
	
	
	//xpath for Edit button
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_edit_account')]")
	public WebElement edit;
	
	
	//xpath for Player status
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_profile_stats')]")
	public WebElement player_stats;
	
	
	//xpath for  selected skilllevel 
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']")
	public WebElement skilllevel_selected;
	
	
	//xpath for selected frequency
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']")
	public WebElement frequency_selected;
	
	//xpath for selected frequency
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']")
	public WebElement handicap_selected;
		
	//xpath for About field value
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'rv_profile_about')]")
	public WebElement About_field_value;
	
	
	//xpath for logout
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign out']")
			public WebElement Log_out;
			
	//xpath for Confirm message for logout			
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Are you sure you want to sign out?']")
			public WebElement confirm_message;
			
			//xpath for Yes
			@AndroidFindBy(xpath="//android.widget.Button[@text='Yes']")
			public WebElement yes;
			
			//xpath for Cancel
			@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
			public WebElement Cancel;
			
}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class editprofileScreen {
	

	public editprofileScreen(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//xpath for edit accouunt ttle
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Edit Account']")
	public WebElement Edit_Account;
		//xpath for change photo 
		@AndroidFindBy(xpath="//android.widget.ImageView[@index='1']")
		public WebElement plusicon;
		
		//xpath for skilllevel
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Skill level']")
		public WebElement skill_level;
		
		//xpath for frequency
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Frequency']")
		public WebElement frequency;
		
		//xpath for handicap
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Handicap']")
		public WebElement handicap;
		
		
		//xpath for handicap
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Location']")
		public WebElement location;
		
		//xpath for Focus
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Focus']")
		public WebElement Focus;
		
		
		//xpath for title of skilllevel dropdown
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Skill level']")
		public WebElement title_skilllevel;
		
		//xpath for title of frequncy dropdown
		
		
		//xpath for beginner
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']")
		public WebElement beginner;
		
		//xpath for intermediate
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Intermediate']")
		public WebElement intermediate;
		
		//xpath for advanced
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Advanced']")
		public WebElement Advanced;
		
		//xpath for expert
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Expert']")
		public WebElement Expert;
				
		//xpath for cancel button		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Cancel']")
		public WebElement Cancel;
		
		//xpath for Few times a week
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Few times a week']")
		public WebElement Few_times_a_week;
		
		
		//xpath for Once a week
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Once a week']")
		public WebElement Once_a_week;
		
		//xpath for Once a month
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Once a month']")
		public WebElement Once_a_month;
		
		//xpath for once every three months		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Once every three months']")
		public WebElement Once_every_three_months;
		
		//xpath for Twice a year
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Twice a year']")
		public WebElement Twice_a_year;
		
		//xpath for Once a year
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Once a year']")
		public WebElement Once_a_year;
		
		//xpath for Recreation
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Recreation']")
		public WebElement Recreation;
		
		//xpath for Business
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Business']")
		public WebElement Business;
		
		//xapth for Pro
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Pro']")
		public WebElement Pro;
		
		//xpath for Sport
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Sport']")
		public WebElement Sport;
		
		//xpath for change photo from
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Change photo from']")
		public WebElement Change_photo_from;
		
		
		//xpath for Camera 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Camera']")
		public WebElement Camera;
		
		//xapth for Gallery
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Gallery']")
		public WebElement Gallery;
		
		//xpath for Done
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Done']")
		public WebElement Done;
		
		//xpath for back button
		@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
		public WebElement backbutton;
		
		//xpath for selected value of skilllevel
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='1']")
		public WebElement skilllevel_value;
		
		//xpath for select value of frequency
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']/android.widget.TextView[@index='1']")
		public WebElement frequency_value;
		
		//xpath for select value of handicap
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']/android.widget.TextView[@index='1']")
		public WebElement handicap_value;
		
		//xpath for select value of focus
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='5']/android.widget.TextView[@index='1']")
		public WebElement focus_value;
		
		
		//xpath for handicap text box
		@AndroidFindBy(xpath="android.view.ViewGroup[contains(@resource-id,'input_handicap')]/android.widget.EditText[contains(@resource-id,'et_value')]")
		public WebElement handicap_select;
		
		//xpath for update handicap
		@AndroidFindBy(xpath="android.widget.Button[@text='Update Handicap']")
		public WebElement update_handicap;
		
		
		//xpath for handicap remove butttton
		@AndroidFindBy(xpath="android.widget.ImageView[contains(@resource-id,'iv_empty')]")
		public WebElement handicap_remove;
		
		
		//xpath for password
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Password']")
		public WebElement password;
		
		//xpath for current password
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter current password']")
		public WebElement Current_password;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter new password']")
		public WebElement New_password;
		
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Confirm new password']")
		public WebElement ConfirmNew_password;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Update Password']")
		public WebElement Update_Password;
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']")
		public WebElement edit_email;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Update Email']")
		public WebElement Update_Email;
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.EditText[@index='1']")
		public WebElement emailedittext;
		
		
		//xpath for edit name
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.TextView[contains(@resource-id,'tv_value')]")
		public WebElement editname;
		
		//xpath for editfirstname
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.EditText[@index='1']")
		public WebElement fnameedittext;
		
		//xapth for editlname
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='5']/android.widget.EditText[@index='1']")
		public WebElement lnameedittext;
		
		//xapth for update name
		@AndroidFindBy(xpath="//android.widget.Button[@text='Update Name']")
		public WebElement Update_Name;
		
		//xpath for password updated field
		@AndroidFindBy(xpath="//android.widget.TextView[@text='******']")
		public WebElement pwd_field;
		
		//xapth for empty handicap value
		@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_empty')]")
		public WebElement remove_handicaptext;
		
		
		//xpath for location  empty button
		@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_empty')]")
		public WebElement remove_locationtext;
		
		
		//xpath for input text field
		@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_value')]")
		public WebElement location_input;
		
		
		//xpath for input text field
		@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'input_zipcode')]/android.widget.EditText[contains(@resource-id,'et_value')]")
		public WebElement editlocation_input;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text='Update Location']")
		public WebElement Update_location;
}


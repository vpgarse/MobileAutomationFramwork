package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home {
	
	public Home(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
//	
	
	//xpath for  Supremegolf icon text
		@AndroidFindBy(xpath="//android.widget.ImageView[@index='0']")
		public WebElement Supremegolf_text;
		
		
		
		
		//Xpath for Find your Teetime
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Find your tee time']") //'Where are you golfing?'//android.widget.TextView[@text='Find your tee time']"
		public WebElement findyour_teetime;
		
		//xpath for location
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Location']")
		public WebElement location;
		
		
		//xpath for Date
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Date']")
		public WebElement date;
		
		
		//xpath for Players	
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Players']")
		public WebElement players;
		
		
		//xpath for Holes
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Holes']")
		public WebElement holes;
		
		
		//xpath for search
		@AndroidFindBy(xpath="//android.widget.Button[@text='Search']")
		public WebElement search;
		
		
		//xpath play on the course
		@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id,'nav_play')]")
		public WebElement playonthecourse;
		
		
		//xpath for Favourites	
		@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id,'nav_favorites')]")
		public WebElement favourites;
		
		
		//xpath for alerts
		@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id, 'nav_alerts')]")
		public WebElement alerts;
		
		
		//xpath for mySG
		@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id,'nav_dashboard')]") //nav_my_sg
		public WebElement My_SG;
		
		//xpath for Search button
		@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_search')]")
		public WebElement Search_button;
		
		
		//xpath for weather icon
		@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'iv_weather_icon')]")
		public WebElement weather_icon;
		
		
		//xpath for homepage search
		@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id,'nav_search')]")
		public WebElement homepage_search;
		
		//xpath for error message
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
		public WebElement errormessage;
}

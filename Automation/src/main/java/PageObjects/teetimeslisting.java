package PageObjects;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class teetimeslisting {
	AndroidDriver<MobileElement> driver;

	public teetimeslisting(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//xpath for Title of courselisting page
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']")
	public WebElement teetimelisting_title;
	
	//xpath for back button
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement teetimelisting_back;
	
	//xpath for filtericon
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_filter')]")
	public WebElement teetimelisting_filter;
	
	//xpath for holes
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_holes')]")
	public WebElement teetimelisting_holes;
	

	//xpath for players
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_players')]")
	public WebElement teetimelisting_players;
	
	//xpath for alert on course listingpage
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_alert')]")
	public WebElement teetimelisting_alert;
	
	
	//xpath for favourite
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_favorite')]")
	public WebElement teetimelisting_favourite;
	
	
	//xpath for info 
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_info')]")
	public WebElement teetimelisting_icon;
	
	
	//xpath for weather
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_weather')]")
	public WebElement teetimelisting_weather;
	
	//xpath for date
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_date_picker_calendar')]")
	public WebElement teetimelisting_calendar;
	
//	//xpath for nextbutton on calendar	
//	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_next')]")
//	public WebElement teetimelisting_next;
//	
//	
//	//xpath for previous button on calendar
//	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_previous')]")
//	public WebElement teetimelisting_previous;
//	
	
	//xpath for provider site numbers
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_sites')]")
	public WebElement teetimelisting_providers;
	
	//xpath for list of tee times
	
	
	
	
}

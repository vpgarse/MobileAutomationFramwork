package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CityMapview {
	
	
	public CityMapview(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for filter icon
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_filter')]")
	public WebElement filter;
	
	//xpath for Favourite icon
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_favorite')]")
	public WebElement favourite;

	
	//xpath for list view	
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_swipe_view')]")
	public WebElement listview;
	
	//xpath for calendar previous button
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_previous')]")
	public WebElement date_previousbutton;
	
	//xpath for calendar next button
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_next')]")
	public WebElement date_nextbutton;
	
	//xpath for weathericon
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_weather')]")
	public WebElement weather;
	
	//xpath for Course  name
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_name')]")
	public WebElement coursename;
	
	//xpath for  reviews count
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_reviews_count')]")
	public WebElement review_count;
	
	//xpath for distance
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_distance')]")
	public WebElement distance;
	
	
	//xpath for price	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_min_rate')]")
	public WebElement price;
	
	
	//xpath for calendar
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_date_picker_calendar')]")
	public WebElement calendar;
	
	//xpath for date dispaly
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_date_picker_calendar')]")
	public WebElement date_display;
	
	//xpath for back button
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement previous;
	
	//xpath for 
}

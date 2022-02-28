package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class citylistingpage {
	
	
	
	public citylistingpage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for city title
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']") 
	public WebElement title_of_city;
	
	//xpath for back button on city listing page
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']") 
	public WebElement back_button;
	
	//xpath for filter icon
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_filter')]") 
	public WebElement filter;
	
	//xpath for favourites	icon on course listing page
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_favorite')]") 
	public WebElement favourites_icon;
	
	
	//xpath for map icon on city listing page
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_swipe_view')]") 
	public WebElement map_icon;
	
	//xpath for calendar screen
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_date_picker_calendar')]") 
	public WebElement calendar_icon;
	
	//xpath for course name on city listing page
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_name')]")
	public WebElement course_name;
	
	
	//xpath for reviews count
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_reviews_count')]")
	public WebElement reviews_count;
	
	//xpath for course minrate 
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_min_rate')]")
	public WebElement course_minrate;
	
	
	//xpath for distance filter
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_distance')]")
	public WebElement distance;
	
	
	//xpath for weather icon
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_weather')]")
	public WebElement weather;
	
	
	//xpath for next button on calendar
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_next')]")
	public WebElement nextbutton_datepicker;
	
	//xpath for previous button
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_previous')]")
	public WebElement previousbutton_datepicker;
	
	
	public void Navigatetotheavailablecalendar(AndroidDriver driver) {
		try{
	if(driver.findElement(By.xpath("//android.widget.TextView[@text='No Results.']")) != null)
			{
				driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'btn_date_picker_next')]")).click();
				Navigatetotheavailablecalendar(driver);
				
			}
		}
	catch(Exception e) {		
		
		
	}
		
	}
	
	
	
	
	
}

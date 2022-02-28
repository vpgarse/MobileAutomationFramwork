package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class weather {
	
	
	public weather(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
			//xpath for title of weather screen 
			@AndroidFindBy(xpath="//android.widget.TextView[@index='1']") 
			public WebElement Weather_Title;
			
			//xpath for  Today weather  button			
			@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_weather_today')]")
			public WebElement weather_today;
			
			//xpath for weekly weather button 
			@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_weather_weekly')]")
			public WebElement weather_weekely;
			
			//xpath for wind button on weather screen
			@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_weather_wind')]")
			public WebElement weather_wind;
			
			//xpath for today weather temperature
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_temperature')]")
			public WebElement today_temperature;
			
			//xapth for weather status
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_status')]")
			public WebElement weather_status;
			
			//xpath for max view temperature
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_temperature_max')]")
			public WebElement max_temperature;
			
			//xpath for min view temperature
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_temperature_min')]")
			public WebElement min_temperature;
			
			
			//xpath for next hour			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']")
			public WebElement cuurent_nexthour;
			
			//xpath for current to next 2 hours
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']")
			public WebElement cuurent_Twohours;
			
			
			//xpath for current to next 3 hours
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']")
			public WebElement cuurent_Threehours;
			
			//xpath for current to next 4 hours
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']")
			public WebElement cuurent_fourhours;
			
			//xpath for current to next 5 hours
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']")
			public WebElement cuurent_fivehours;
			
			//xpath for next hour temperature
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.TextView[contains(@resource-id,'tv_weather_today_item_temperature')]")
			public WebElement temperature_nexthour;
			
			//xpath for next 2hours temperature
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.TextView[contains(@resource-id,'tv_weather_today_item_temperature')]")
			public WebElement temperature_2hour;
						
			//xpath for next 3hours temperature
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.TextView[contains(@resource-id,'tv_weather_today_item_temperature')]")
			public WebElement temperature_3hour;
			//xpath for next hour temperature
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']/android.widget.TextView[contains(@resource-id,'tv_weather_today_item_temperature')]")
			public WebElement temperature_4hour;
			
			//xpath for next 4hour temperature
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']/android.widget.TextView[contains(@resource-id,'tv_weather_today_item_temperature')]")
			public WebElement temperature_5hour;
			
			
			//xpath for back button on weather screen
			@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
			public WebElement backbutton;
			
			//xpath for next 7 days screen 
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_weekly_next_days')]")
			public WebElement next_7_days_screen;
			
			//xpath for wind measurement
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_wind_item_wind_speed')]")
			public WebElement wind_mph;
			
			//xpath for weekly temp max 
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day1;
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day2;
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day3;			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day4;
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day5;			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='5']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day6;			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='6']/android.widget.TextView[contains(@resource-id,'tv_max_temperature')]")
			public WebElement weekelyMax_day7;
			//xpat for min
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day1;
			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day2;
			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day3;
			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day4;
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day5;
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='5']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day6;
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='6']/android.widget.TextView[contains(@resource-id,'tv_min_temperature')]")
			public WebElement weekelyMin_day7;
			
			
			//xpath for minimumwind
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_wind_item_wind_speed')]")
			public WebElement min_wind;
			
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_weather_wind_item_direction')]")
			public WebElement direction;
			
}

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

public class Calendar {
	
	static AndroidDriver driver;
	public Calendar(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for Calendar title
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Select a date']")
		 public WebElement Select_a_date ;

		//xpath for daypicker
		
		@AndroidFindBy(xpath="//android.view.View[contains(@resource-id,'month_view')]/android.view.View")
		 public WebElement daypicker ;
		
		
		//xpath for current date
		
		@AndroidFindBy(xpath="//android.view.View[contains(@resource-id,'month_view')]/android.view.View[@index='6']")
		public WebElement currentdate;
		
		//xpath for next button on calendar screen
		@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'next')]")
		public WebElement next_button;
		
		//xpath for next month date validation
		@AndroidFindBy(xpath="//android.view.View[@content-desc='01 December 2019']")
		public WebElement nextmonth_calendarscreen;
		
		
		//xpath for current day
		@AndroidFindBy(xpath="//android.view.View[contains(@resource-id,'month_view')]/android.view.View[@checked='true']")
		public WebElement current_day;
		

		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'tv_value')]")
    	public WebElement text_value;
	
	
				
				
				
					
	
		
		
}

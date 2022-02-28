package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Searchlocation_Page {
	
	public Searchlocation_Page(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
			//Xpath for Search a location 
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Search a location']")
			public WebElement Search_location;
			
			//xpath for search field value
			@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_value')]")
			public WebElement Search_field_value;
			
			//Xpath for Search 
			@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_autocomplete')]")
			public WebElement Searchby_Course_City ;
			
			//xpath for current location
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Current Location']")
			public WebElement Current_location;
			
			//xpath for suggestion course or zipcode or city
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.ImageView[contains(@resource-id,'iv_icon')]")
			public WebElement Search_suggestion; 
			
			//xapth for zipcode suggestion
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']")
			public WebElement Search_suggestion_zipcode; 
			
		
			//xpath for noresults found 
			@AndroidFindBy(xpath="//android.widget.TextView[@text='No results found']")
			public WebElement no_results_found;
			//xpath for location field
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'tv_value')]")
	    	public WebElement text_value;
			
			
			//xpath for title of course lis
}

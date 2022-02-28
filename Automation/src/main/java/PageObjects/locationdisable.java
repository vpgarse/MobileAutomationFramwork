package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class locationdisable {
	
	public locationdisable(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for settings
		@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.sec.android.app.launcher:id/iconview_imageView']")
		public WebElement settings_device;
		

		//xpath for search 
		@AndroidFindBy(xpath="//android.widget.Button[@index='0']")
		public WebElement search;
		//xpath for serch box
		@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.android.settings.intelligence:id/search_src_text']")
		public WebElement search_location;
		
		//xpath for location
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Location']")
		public WebElement location;
		
		//xpath for toggle button
		@AndroidFindBy(xpath="//android.widget.Switch[@resource-id='android:id/switch_widget']")
		public WebElement toggle;
		
		
		

}

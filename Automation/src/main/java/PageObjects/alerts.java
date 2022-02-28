package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class alerts {
	
	public alerts(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for alert title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Alerts']")
	public WebElement Alert_title;
	
	//xpath for  sort icon
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_filter')]")
	public WebElement sort_icon;
	
	//xpath for No alerts set
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_alerts_no_result_title')]")
	public WebElement sort_filter;
	
	//xpath for Search saved alert
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Search for an alert']")
	public WebElement search_alert;
	
	//xpath for saved alert list
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'rv_alerts'])")
	public WebElement alert_list;
	
	//xpath for first courselisted in alert
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_alert'])")
	public WebElement alert_saved_course;
	
	//xpath for alert options
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_bottom_sheet_title'])")
	public WebElement alert_options_title;
	
	//xpath for daily Alert
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Daily']")
	public WebElement Alert_daily;
	
	//xpath for Hourly alert
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Daily']")
	public WebElement Alert_daily1;
	

}

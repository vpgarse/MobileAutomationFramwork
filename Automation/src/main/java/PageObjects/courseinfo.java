package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class courseinfo {
	
	public courseinfo(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']") 
	public WebElement title_of_courseinfo;
	
	//xpath for review screen
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_reviews_count')]")
	public WebElement review;

}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Settings {
	
	public Settings(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

		//xpath for settings title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	public WebElement settings_title;
	
		//xpath for  settings
		@AndroidFindBy(xpath="//android.widget.TextView[@text='User agreement']")
		public WebElement user_agreement;
		
		//xpath for privacypolicy
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Privacy policy']")
		public WebElement Privacypolicy;
		
		//xpath for Help&Faq
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Help & FAQ']")
		public WebElement Help_FAQ;
		
		
	
}

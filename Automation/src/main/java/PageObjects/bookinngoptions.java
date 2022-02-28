package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class bookinngoptions {
	
	public bookinngoptions(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Booking Options']")
	public WebElement booking_options;
	
	//xpath for providerbookingteetime	
	@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_provider_logo')]")
	public WebElement logo;
	
	//xpath for rate	
	@AndroidFindBy(xpath="//androidx.cardview.widget.CardView/android.view.ViewGroup[@index='0']/android.widget.TextView[contains(@resource-id,'tv_rate')]")
	public WebElement booking_rate;
	
	//xpath for booking fee	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_booking_fee')]")
	public WebElement booking_fee;
	
	
	//xpath for punch out for other providers	
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'rv_punch_out_providers')]")
	public WebElement punchout;
	
	//xpath for provider option one	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']")
	public WebElement provideroption_one;
	
	//xpath for tee off teetime
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_off_time')]")
	public WebElement teeoff_teetime;
	
	//xpath for date
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_date')]")
	public WebElement teeoff_date;
	
	//xpath for book directly with provider
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Book directly with provider']")
	public WebElement bookdirecly_provider;
	
	//xpath for 
	
	
}

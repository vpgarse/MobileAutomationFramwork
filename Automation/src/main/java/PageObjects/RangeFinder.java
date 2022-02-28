package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RangeFinder {
	
	public RangeFinder(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath="//android.widget.CheckBox[contains(@resource-id,'btnShowScorecard')]")
	public WebElement RangeFinder_Screen;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SCORECARD']")
	public WebElement scorecard;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@resource-id='com.supremegolf.app.stage:id/btnSettings']")
	public WebElement settings;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btnRightArrow')]")
	public WebElement rightarrow;
	
	@AndroidFindBy(xpath="//android.view.View[@index='1']")
	public WebElement personicon;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Google Map']")
	public WebElement googlemap;

	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'txtTotalYards')]")
	public WebElement yards;
	
}

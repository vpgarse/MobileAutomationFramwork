package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Writeareview {
	
	public Writeareview(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Write A Review']")
	public WebElement WriteReview_title;
	
	@AndroidFindBy(xpath="//android.widget.RatingBar[contains(@resource-id,'rb_review_rating')]")
	public WebElement reviewrating_tab;
	
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_review_title')]")
	public WebElement reviewinfo;
	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_post_review')]")
	public WebElement PostReview;
	
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_review_helpful')]")
	public WebElement yes;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_review_not_helpful')]")
	public WebElement No;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_play_again_question')]")
	public WebElement wouldyouplay_Again;
	
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement back_button;
}

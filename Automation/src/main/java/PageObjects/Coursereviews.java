package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Coursereviews {
	
	public Coursereviews(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for course_reviews
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Course Reviews']")
	public WebElement course_review_title;
	
	
	//xpath for Sort by icon
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_sort')]")
	public WebElement Sortby;
	
	//xpath for overall rating	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_rating')]")
	public WebElement courserating;
	
	
	//xpath for reveiws count
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_reviews_count')]")
	public WebElement coursereviews;
	//xpath for write a review
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_write_review')]")
	public WebElement Write_A_Review;
	
	//xpath for review date	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_review_date')]")
	public WebElement review_helpful;
	
	
	//xpath for more
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_expand_review')]")
	public WebElement more;
	
	//xapth for sortby title
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_bottom_sheet_title')]")
	public WebElement Sortbytitle;
	
	//xpath for Most Reccent
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Most Recent']")
	public WebElement Recent;
	
	//xpath for Most Favorable
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Most Favorable']")
	public WebElement Most_Favorable;
	
	
	//xpath for MostCritical
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Most Critical']")
	public WebElement Most_critical;
	
	
	
	//xpath for Most helpful
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Most Helpful']")
	public WebElement Most_Helpful;
	
	
	//xpath for Most established
	@AndroidFindBy(xpath="//android.widget.TextView[@text,'Most Established')]")
	public WebElement Establish;
	
	//xpath for cance
	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
	public WebElement Cancel;
	
	//xpath for reviewrating bar
	@AndroidFindBy(xpath="//android.widget.RatingBar[contains(@resource-id,'rb_review_rating')]")
	public WebElement reviewrating_bar;
	
	
	//xpath for reviewmessage
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_review_comments')]")
	public WebElement reveiw_message;
	
	
	//xpath for playerwould youlike to playagain in review card
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_review_helpful_question')]")
	public WebElement reveiw_card;
	
	
	//xpath for yes
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_helpful_review')]")
	public WebElement yes;
	
	
	//xpath for No
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_not_helpful_review')]")
	public WebElement No;
	
	
	//xpath for reportit
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_report_review')]")
	public WebElement report;
	
	//xpath for less
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_expand_review')]")
	public WebElement less;
	
	//xpath for confirm message
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
	public WebElement confirmmessage;
	
	
	//Xpath for errormessage
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
	public WebElement errormessage;
	
	//xpath for OK 
	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'button1')]")
	public WebElement OK;
	
	
	
}

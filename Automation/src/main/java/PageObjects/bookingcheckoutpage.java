package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class bookingcheckoutpage {
	
	public bookingcheckoutpage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for review tee time
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Review Tee Time']")
	public WebElement review_teetime;
	
	//xpath for coursename in checkout screen
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_course_name')]")
	public WebElement course_name;
	
	//xpath for teeoff teetime	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_off_time')]")
	public WebElement teeoff_teetime;
	
	//xpath for tvdate	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_date')]")
	public WebElement teeoff_teedate;
	
	//xpath for players
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Players']")
	public WebElement players;
	
	//xpath for playercount
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_counter_value')]")
	public WebElement teeoff_player;
	
	//xpath for booking details	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Booking details']")
	public WebElement booking_details;
	
	//xpath for supremegolfrewards
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_rewards_section_title')]")
	public WebElement supremegolf_rewards;
	
	//xpath for rewards
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_rewards_section_title')]")
	public WebElement supremegolf_rewardsamount;
	
	//xpath for rewards ponints
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_rewards_section_title')]")
	public WebElement supremegolf_rewardspoints;
	
	//xpath for total due
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_total_due_now')]")
	public WebElement total_due;
	
	//xpath for acceptterms&conditions	
	@AndroidFindBy(xpath="//android.widget.CheckBox[contains(@resource-id,'cb_accept_terms_and_conditions')]")
	public WebElement terms_conditions;
	
	
	//xpath book now
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_book_now')]")
	public WebElement booknow_complete;
	
	//xpath for cancellation policy
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_booking_cancel_policy')]")
	public WebElement cancellation_policy;
	
	//xpath for increment operator
	@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_counter_plus')]")
	public WebElement tv_increment;
	
	//xpath for decrement operator
	@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_counter_minus')]")
	public WebElement tv_decrement;
	
	//xpath for green fee text
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Green fees (subtotal)']")
	public WebElement greenfee_text;
	
	//xpath for greenfeamount
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_receipt_item_amount')]")
	public WebElement greenfee_amount;
	
	
	//xpath for supremegolf fee
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Supreme Golf Fee']")
	public WebElement supremegolf_fee;
	
	//xpath for supremegolffee amount
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.TextView[contains(@resource-id,'tv_receipt_item_amount')]")
	public WebElement supremegolf_amount;
	
	
	//xpath for estimated sales tax
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Estimated Sales Tax']")
	public WebElement Estimated_salestax;
	
	//xapth for sales tax amount
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.TextView[contains(@resource-id,'tv_receipt_item_amount')]")
	public WebElement estimatedsalestax_amount;
	
	//xpath for total amount due
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Total Amount Due']")
	public WebElement Total_amount_due;
	
	//xapth for total amount due amount
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']/android.widget.TextView[contains(@resource-id,'tv_receipt_item_amount')]")
	public WebElement totaldue_amount;
	
	//xpath for card last four digits
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']/android.widget.TextView[contains(@resource-id,'tv_receipt_payment_method')]")
	public WebElement paymentmenthod;
	
	//xpath for change payment method
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Change']")
	public WebElement change;
	
	//xpath for total due now 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Total Due Now']")
	public WebElement totaldue;
	
	//xpath for total due now amount
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_total_due_now')]")
	public WebElement totalduenow_amount;
	
	//xpath for add card 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add']")
	public WebElement Addcard;
	
	//xpath for erroremessage
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
	public WebElement errormessage;
}

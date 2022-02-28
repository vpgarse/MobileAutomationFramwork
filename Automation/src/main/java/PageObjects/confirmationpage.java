package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class confirmationpage {
	
	public confirmationpage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for booking confirmation
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Booking Successful']")
	public WebElement booking_confirmation;
	
	//xpath for  course name	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_booking_title')]")
	public WebElement course_title;
	
	//xpath for booking number
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_booking_number')]")
	public WebElement booking_number;
	
	//xpath for Amount paid 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Amount Paid']")
	public WebElement Amount_paid;
	
	//xpath for amountpaidvalue
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_booking_amount_paid_value')]")
	public WebElement Amount_paid_value;
	
	//xpath for amountduevalue
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_booking_amount_due_value')]")
	public WebElement Amount_due_value;
	
	//xpath for Amount Due at course
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Amount Due at course']")
	public WebElement Amount_dueatcourse;
	
	//xpath for payment method
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment Method']")
	public WebElement Payment_method;
	
	//xpath for Booking details
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Booking details']")
	public WebElement Booking_details;
	
	//xpath for booking details 
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'rv_booking_details')]")
	public WebElement amenities_all;
	
	//xpath for time amenity
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[@index='0']")
	public WebElement timeamenity;
	//xpath for player amenities
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[@index='1']")
	public WebElement playeramenity;
	
	//xpath for hole amenities
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[@index='2']")
	public WebElement holeamenity;

	//xpath for carttype_amenities
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[@index='3']")
	public WebElement cartamenity;
	
	//xpath for carttype_amenities
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[@index='4']")
	public WebElement rateamenity;
	
	//xpath for payment status
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.TextView[@index='5']")
	public WebElement paymentamenity;
	
	
	
	
	//xpath for Done
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Done']")
	public WebElement Done;
	
}

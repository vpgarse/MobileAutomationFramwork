package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class bookings {
	
	public bookings(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Bookings']")
	public WebElement bookings_title;
	
	//xpath for upcoming boooking
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Upcoming']")
	public WebElement Upcoming_booking;
	
//xpath for Completed
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Completed']")
	public WebElement Completed_booking;
	
	//xpath for  Cancelled
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Cancelled']")
	public WebElement cancelled_booking;
	
	//xpath for title of upcoming bookings title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Upcoming Bookings']")
	public WebElement title_Upcoming_booking;
	
	//xpath for upcoming booking tee time
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'cl_item_booking')]")
	public WebElement upcoming_teetime;
	
	
	//xpath for completed bookings title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Completed Bookings']")
	public WebElement title_completed_booking;
	
	//xpath for completed booking tee time
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'cl_item_booking')]")
	public WebElement completedbooking_teetime;
	
	//xpath for Amount paid
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Amount Paid']")
	public WebElement amountpaid;
	
	//xpath for cancelled booking title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Cancelled Bookings']")
	public WebElement Cancelled_Bookings_title;
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'cl_item_booking')]")
	public WebElement cancelled_teetime;
	
	
	
}

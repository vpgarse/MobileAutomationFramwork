package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RateType {

	public RateType(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for booking options title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Booking Options']")
	public WebElement bookings_options;

	
	//xpath for  Teetime
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Tee Time:']")
	public WebElement Teetime_text;
	
	//xpath for time dispalyed in  booking options screeen
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_off_time')]")
	public WebElement time_teeoff;
	
	//xpath for time dispalyed in  booking options screeen
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_date')]")
		public WebElement teeoff_date;
		
		//xpath for course options
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_filter_title')]")
		public WebElement teeoff_courseoptions;
		
		//xpath for players
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Players']")
		public WebElement Teeoff_players;
		
		//xpath for  decrement operator		
		@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_counter_minus')]")
		public WebElement countminus;
		
		//xpath for increment opeartor
		@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_counter_plus')]")
		public WebElement countplus;
		
		//xpath for player value		
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_counter_value')]")
		public WebElement player_value;
		
		
		//xpath for holes
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Holes']")
		public WebElement Teeoff_holes;
		
		//xpath for 9holes
		@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_9_holes')]")
		public WebElement nine_holes;
		
		//xpath for 18 holes
		@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_18_holes')and @checked='true']")
		public WebElement eighteen_holes;
		
		//xpath for cart
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Cart']")
		public WebElement Teeoff_cart;
		
		//xpath for walk 
		@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_cart_walk')]")
		public WebElement cart_walk;
		
		//xpath for cart
		@AndroidFindBy(xpath="//android.widget.RadioButton[contains(@resource-id,'rb_cart_ride')]")
		public WebElement cart_ride;
		
		//xapth for chooose your ratetype
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Choose your rate type']")
		public WebElement choose_ratetype;
		
		//xpath for available rates
		@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'rv_rates')]")
		public WebElement available_ratetype;
		
		//xapth for rate avaialble 1		
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.TextView[contains(@resource-id,'tv_rate_text')]")
		public WebElement available_ratetype1;
		
		//xapth for radiobutton on hole
		@AndroidFindBy(xpath="//android.widget.RadioGroup[contains(@resource-id,'rg_holes_options')]")
		public WebElement holes_radiooptions;
		
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_no_rates_available')]")
		public WebElement norate;
		
		public void ratevalue() {
			try{
				
				//if(available_ratetype1!=null) {
				if(available_ratetype!=norate)
						{
			
							System.out.println(available_ratetype1.getText());
							//ratevalue(driver);
							
						}
					 
			
			}				
			
		catch(Exception e) {			
			System.out.println(norate.getText());		
			eighteen_holes.click();				
			}				
		}
		
		@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='rb_18_holes' and @checked='true']")
		public WebElement checked_holes ;
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_rate_value')]")
		public WebElement ratevalue;
}
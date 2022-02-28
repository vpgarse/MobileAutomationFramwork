package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class payments {
	
	

	public payments(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	//xpath for title of the payment screen
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment Methods']") 
	public WebElement title_payments;
	
	//xpath for Add payment
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_add_payment_method')]") 
	public WebElement Add_payments;
	
	//xpath for if no payment added
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add your first payment method']") 
	public WebElement Add_your_firstPayment_text;
	
	//xpath for  title of add payment method
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add payment method']") 
	public WebElement Add_paymentspage_title;
	
	//xpath for creditordebitcard
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Credit or Debit Card']") 
	public WebElement Creditcard;
	
	
	//xpath for google pay
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Google Pay']") 
	public WebElement googlepay;
	
	//xpath for title of addcard 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add card']") 
	public WebElement Addcard;
	
	//xpath for Firstname
	@AndroidFindBy(xpath="//android.widget.EditText[@text='First']") 
	public WebElement Firstname;
	
	//xpath for lastname
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Last']") 
	public WebElement Lastname;
	
	//xpath for card number
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter card number']") 
	public WebElement Cardnumber;
	
	
	//xpath for expiration date
	@AndroidFindBy(xpath="//android.widget.EditText[@text='MM/YYYY']") 
	public WebElement expirationdate;
	
	
	//xpath for cvv
	@AndroidFindBy(xpath="//android.widget.EditText[@text='123']") 
	public WebElement CVV;
	
	//xpath for zipcode
	@AndroidFindBy(xpath="//android.widget.EditText[@text='12345']") 
	public WebElement zipcode;
	
	//xpath for save
	@AndroidFindBy(xpath="//android.widget.Button[@text='Save']") 
	public WebElement save;
	
	//xpath for edit card 
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'cl_item_payment_method_option')]/android.widget.TextView[@index='1']")
	public WebElement Paymentmethods;
	
	
	//xapth for invalid lastname	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid last name.']")
	public WebElement invlid_lastname;
	
	
	//xpath for invalid cardnumber 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid card number.']")
	public WebElement invlid_cardnumber;
	
	//xpath for expirationd ate invalid
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid date.']")
	public WebElement invlid_date;
	
	//xpath for cvv  invalid
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid cvv.']")
	public WebElement invlid_cvv;
		
	//xpath for zipcode
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Required zip code.']")
	public WebElement invlid_zipcode;
	
	
	//xpath for zipcode
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid first name.']")
		public WebElement invlid_firstname;
		
	//xpath for google pay
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Google Pay']")
		public WebElement google_pay;
		
		
		//xpath for edit payment 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Edit Payment Method']")
		public WebElement editpaymentsheader;
		
		//xpath for edit 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Edit']")
		public WebElement editpayments;
		
		//xpath for firstnameedit
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_first_name')]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
		//@AndroidFindBy(xpath="//android.widget.TextView[@text='First name']")
		public WebElement editpayments_fname;
		
		
		//xpath for lastname edit
		@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_last_name')]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
		public WebElement editpayments_lname;
		
		//xpath for expiration date
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_expiration_date')]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
		public WebElement editpayments_expirydate;
		
		//xpath for Zipcode
		@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_zip_code')]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
		public WebElement editpayments_zipcode;
		
		//xpath for delete
		@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_delete_card')]")
		public WebElement delete;
		
		//xpath for confirm message
		@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
		public WebElement confirmessage;
		//xpath for ok
		@AndroidFindBy(xpath="//android.widget.Button[@text='OK']")
		public WebElement okay;
		
		
		//xpath for back button
		@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
		public WebElement back_buton;
}

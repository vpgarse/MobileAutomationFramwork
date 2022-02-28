package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class friends {
	
	public friends(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for title of friends screen
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Friends']")
	public WebElement Friends_title;
	
	//xpath for back button
	@AndroidFindBy(xpath="//android.widget.ImageButton[@index='0']")
	public WebElement back_button;
	
	//xpath for '+ icon'
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'iv_add_friend')]")
	public WebElement plusicon;
	
	//xpath for add friend
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_add_friend')]")
	public WebElement Addfriend;
	
	//xpath for freinds list
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'rv_friends')]/android.view.ViewGroup[contains(@resource-id,'android.view.ViewGroup')]")
	public WebElement Freindslist;
	
	//xpath for firstname
	@AndroidFindBy(xpath="//android.widget.TextView[@text='First name']")
	public WebElement firstname;
	//xpath for Lastname
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Last name']")
	public WebElement lastname;
	
	//xpath for done
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'menu_done')]")
	public WebElement done;
	
	//xpath for change photo	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_change_photo')]")
	public WebElement change_photo;
	
	//xpath for chnage photo from camera
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_camera')]")
	public WebElement change_photo_camera;
	
	//xpath for chnage photo from Gallery
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_gallery')]")
	public WebElement change_photo_gallery;
	
	//xpath  for cancel	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_cancel')]")
	public WebElement btn_cancel;
	
	//xpath for remove photo 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_remove_friend')]")
	public WebElement Removefriend;
	
	//xpath for cofirmation message
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'message')]")
	public WebElement confirm_message;
	
	//xpath for OK button
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'button1')]")
	public WebElement OK;
	
	//xpath for titleof dropdown
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_bottom_sheet_title')]")
	public WebElement title_sheet_title;
	
	 //xpath for first item in teh freinds list
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_name')]")
	public WebElement friends_list_name;
	
	//xpath for invald firstname
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid first name.']")
	public WebElement invalid_firstname;
	
	//xpath for invalid last name
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid last name.']")
	public WebElement invalid_lastname;
	
	
}

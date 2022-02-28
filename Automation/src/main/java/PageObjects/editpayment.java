package PageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class editpayment {
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'ll_edit_text_container')]/android.widget.EditText[@index='1']")
	public WebElement edit_firstname;

	
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_last_name')]/android.widget.EditText[@index='1']")
	public WebElement edit_lastname;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_number')]/android.widget.EditText")
	public WebElement edit_card;
	
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_cvv')]/android.widget.EditText[@index='1']")
	public WebElement edit_cvv;
	
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[contains(@resource-id,'et_card_zip_code')]/android.widget.EditText[@index='1']")
	public WebElement edit_zipcode;
	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'btn_delete_card']")
	public WebElement edit_Delete;
	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@resource-id,'menu_edit']")
	public WebElement edit;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Edit Payment Method']")
	public WebElement edit_title;
}

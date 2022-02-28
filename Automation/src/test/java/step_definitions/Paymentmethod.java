package step_definitions;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import PageObjects.Home;
import PageObjects.SignIn;
import PageObjects.payments;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Paymentmethod {
	
	static AndroidDriver driver;
	SignIn login;
	Home home;
	payments payment;
	 public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  Paymentmethod() throws InterruptedException{
		Paymentmethod.driver=Base.getDriver();		
		login=new SignIn(driver);
		home=new Home(driver);
		payment=new payments(driver);
	}
	
	
	@Then("^Payment methods screeen displayed$")
    public void payment_methods_screeen_displayed() throws Throwable {
		payment.title_payments.getText();
    }

    @And("^I hit on Payment Methods$")
    public void i_hit_on_payment_methods() throws Throwable {
    	 login.paymentmethods.click();
    }
    
    @Then("^Add payment method screeen is displayed$")
    public void add_payment_method_screeen_is_displayed() throws Throwable {
      payment.Add_paymentspage_title.getText();
    }

    @And("^I click on Add button$")
    public void i_click_on_add_button() throws Throwable {
    	 payment.Add_payments.click();
    }
    @Then("^add card page is displayed$")
    public void add_card_page_is_displayed() throws Throwable {
      log.info(payment.Addcard.getText());
    }

    @Then("I click on Credit or Debit Card")
    public void i_click_on_Credit_or_Debit_Card() {
        // Write code here that turns the phrase above into concrete actions
       payment.Creditcard.click();
    }

    @When("^I fill \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_fill_somethingsomething_something_something_something_and_something(String first, String last, String cardnumber, String expirydate, String cvv, String zipcode) throws Throwable {
      payment.Firstname.sendKeys(first);
      payment.Lastname.sendKeys(last);
      payment.Cardnumber.sendKeys(cardnumber);
      payment.expirationdate.sendKeys(expirydate);
      payment.CVV.sendKeys(cvv);
      payment.zipcode.sendKeys(zipcode);
      driver.hideKeyboard();
    }

    @Then("^card is added to Payment methods$")
    public void card_is_added_to_payment_methods() throws Throwable {
     System.out.println(payment.Paymentmethods.getText());
    }

    @And("^I hit on save$")
    public void i_hit_on_save() throws Throwable {
       payment.save.click();
    }


    @When("^I fill the invalid data of \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"")
    public void i_fill_the_invalid_data_of_somethingsomething_something_something_and_something(String first, String last, String cardnumber, String expirydate, String cvv) throws Throwable {
        payment.Firstname.sendKeys(first);
        payment.Lastname.sendKeys(last);
        payment.Cardnumber.sendKeys(cardnumber);
        payment.expirationdate.sendKeys(expirydate);
        payment.CVV.sendKeys(cvv);
        driver.hideKeyboard();
    }
    
    @Then("^captured error messages$")
       public void captured_error_messages() throws Throwable {
//    	System.out.println(payment.invlid_firstname.getText());
//    	System.out.println(payment.invlid_lastname.getText());
//    	System.out.println(payment.invlid_cardnumber.getText());
    	log.info(payment.invlid_firstname.getText());
       log.info(payment.invlid_lastname.getText());
      log.info  (payment.invlid_cardnumber.getText());
        log.info(payment.invlid_date.getText());
        log.info(payment.invlid_cvv.getText());
        log.info(payment.invlid_zipcode.getText());
    }
    
    @Then("^google pay is added as primary payment method$")
    public void google_pay_is_added_as_primary_payment_method() throws Throwable {
     // log.info( payment.google_pay.getText());
    }

    @And("^I click on  google pay$")
    public void i_click_on_google_pay() throws Throwable {
     payment.googlepay.click();  
    }


    @Then("^Edit Payment method screen is displayed$")
    public void edit_payment_method_screen_is_displayed() throws Throwable {
      //  log.info(payment.editpaymentsheader.getText());
    }

    @And("^I click on  card listed in the Payment methods$")
    public void i_click_on_card_listed_in_the_payment_methods() throws Throwable {
        payment.Paymentmethods.click();
    }
    
    @When("^I modified details  (.+),(.+), (.+) and (.+)$")
    public void i_modified_details_and(String firstname, String lastname, String expirationdate, String zipcode) throws Throwable {
       payment.editpayments_fname.sendKeys(firstname);
       payment.editpayments_lname.sendKeys(lastname);
       payment.editpayments_expirydate.sendKeys(expirationdate);
       payment.editpayments_zipcode.sendKeys(zipcode);
    }

    @Then("^modified card details are saved$")
    public void modified_card_details_are_saved() throws Throwable {
    	log.info(payment.Paymentmethods.getText());
    }

    @When("I hit on Edit button")
    public void i_hit_on_Edit_button() {
        // Write code here that turns the phrase above into concrete actions
      
        payment.editpayments.click();
    }
    @Then("^card is removed from payment methods$")
    public void card_is_removed_from_payment_methods() throws Throwable {
    	log.info(payment.confirmessage.getText());
    	payment.okay.click();
    	log.info(payment.Paymentmethods.getText());
     
    }

    @And("^I hit on delete card$")
    public void i_hit_on_delete_card() throws Throwable {
        payment.delete.click();
    }
    @Then("I tap on back button")
    public void i_tap_on_back_button() {
       payment.back_buton.click();
    }

    @Then("^payment methods screen is displayed$")
    public void payment_methods_screen_is_displayed() throws Throwable {
       payment.Paymentmethods.getText();
    }
    @Then("I hit on Add your first payment method")
    public void i_hit_on_Add_your_first_payment_method(){
      payment.Add_your_firstPayment_text.click();
    }
    @Then("invlid card error message should display")
    public void invlid_card_error_message_should_display() throws InterruptedException {
    	Thread.sleep(1000);
    	String text=payment.confirmessage.getText();
   //  log.info(text);     
     Assert.assertEquals(text, "Please enter valid card ");
    }
    

    @When("^I fill the letters in  (.+) field$")
    public void i_fill_the_letters_in_field(String zipcode) throws Throwable{
       payment.zipcode.sendKeys(zipcode);
      // driver.hideKeyboard();
    }

    @Then("^zipcode field displayed with letters$")
    public void zipcode_field_displayed_with_letters() throws Throwable {
     //  log.info(payment.zipcode.getText());
    }

}

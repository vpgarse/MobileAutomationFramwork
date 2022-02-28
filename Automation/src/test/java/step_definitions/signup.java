package step_definitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import PageObjects.SignIn;
import PageObjects.Signup;
import Utility.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signup {
	static AndroidDriver<MobileElement> driver;
	Signup register;
	SignIn signin;
	Properties prop;
	public  static Logger log=LogManager.getLogger(Base.class.getName());
	public  signup() throws InterruptedException, IOException{
		signup.driver=Base.getDriver();		
		register=new Signup(driver);
		signin=new SignIn(driver);
	//	prop=Base.property_validation();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				  "\\src\\test\\java\\Utility\\global.properties");
		
		
		prop=new Properties();
		//FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
	}
	
	 @And("^I hit on Sign up$")
	 public void i_hit_on_sign_up() throws Throwable {
		 log.info("hitting on Regster for free button");
	        register.Register_account.click();
	    }

	 @Then("^Registartion page is displayed$")
	    public void registartion_page_is_displayed() throws Throwable {
	      log.info(register.title_signup.getText());
	    }
	 


	 @When("^I fill \"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_fill_something_something_something_something_and_something(String firstname, String lastname, String email, String passsword, String zipcode) throws Throwable{
		 register.FirstName.sendKeys(prop.getProperty(firstname));
		 register.LastName.sendKeys(prop.getProperty(lastname));
		 Random randomGenerator = new Random();  
		 int randomInt = randomGenerator.nextInt(1000);  
		 
		 register.email.sendKeys(prop.getProperty(email)+randomInt+"@gmail.com");
		 driver.hideKeyboard();
		 register.Password.sendKeys(prop.getProperty(passsword));
		 register.zipcode.sendKeys(prop.getProperty(zipcode));		 
		 driver.hideKeyboard();
	 }
	 @And("^I agree termsandconditions checkbox$")
	    public void i_agree_termsandconditions_checkbox() throws Throwable {
	       register.checkbox_terms_conditions.click(); //Satya_Sep21 due to Enhancement
	    }

	   
	  @And("^I hit on Createaccount$")
	  public void i_hit_on_createaccount() throws Throwable {
	       register.Create_account.click();
	    }
	  
	   
	    @Then("^termsandconditions page is displayed$")
	    public void termsandconditions_page_is_displayed() throws Throwable {
	        
	    }

	    @And("^I hit on Termssandconditions link$")
	    public void i_hit_on_termssandconditions_link() throws Throwable {
	       
	    }
	  

	    @Then("I hit on Login")
	    public void i_hit_on_Login()  {
	    	scrollAndClick("Already with us? Login");
	       //register.login.click();
	    }
	  
	    
	    @When("^I fill  email Field (.+)$")
	    public void i_fill_email_field(String existingemail) throws Throwable{
	        register.email.sendKeys(prop.getProperty(existingemail));
	        driver.hideKeyboard();
	    }

	    @Then("^email exits validataion message is displaying$")
	    public void email_exits_validataion_message_is_displaying() throws Throwable {
	       System.out.println( register.email_validation.getText());
	    }

	    @Then("^Sign in page is displayed$")
	    public void sign_in_page_is_displayed() throws Throwable {
	       System.out.println( signin.title_Signin.getText());
	    }

	    public void scrollAndClick(String visibleText) {
	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	           
	       }
	    
			/*
			 * public static boolean swipeToBottom() { org.openqa.selenium.Dimension dim =
			 * driver.manage().window().getSize(); int height = dim.getHeight(); int width =
			 * dim.getWidth(); int x = width/2; int top_y = (int)(height*0.80); int bottom_y
			 * = (int)(height*0.20); System.out.println("coordinates :" + x + "  "+ top_y +
			 * " "+ bottom_y); //ts.longPress(x, top_y).moveTo(x,
			 * bottom_y).release().perform(); //swipeScreen(x, top_y, x, bottom_y); return
			 * true; }
			 * 
			 * public static void swipeScreen(int touchX, int touchY, int swipeX, int
			 * swipeY) { TouchAction touchAction = new TouchAction(driver);
			 * 
			 * 
			 * 
			 * PointOption touch = new PointOption(); touch.withCoordinates(touchX, touchY);
			 * 
			 * 
			 * 
			 * PointOption swipe = new PointOption(); swipe.withCoordinates(swipeX, swipeY);
			 * 
			 * 
			 * 
			 * touchAction.press(touch).waitAction().moveTo(swipe).release().perform(); //
			 * touchAction.press(touch).moveTo(swipe).release().perform();
			 * 
			 * }
			 * 
			 * JavascriptExecutor js = (JavascriptExecutor) driver; //
			 * js.executeScript("window.scrollBy(0,350)", ""); //
			 * js.executeScript("window.scrollBy(0,350)", "");
			 */
}

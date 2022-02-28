package step_definitions;

import static org.testng.Assert.assertEquals;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.Keys;
import PageObjects.Calendar;
import PageObjects.Cancel;
import PageObjects.Hole;
import PageObjects.Home;
import PageObjects.Players_Page;
import PageObjects.Playonthecourse;
import PageObjects.SGscreen;
import PageObjects.Searchlocation_Page;
import PageObjects.SignIn;
import PageObjects.Signup;
import PageObjects.alerts;
import PageObjects.favourites;
import PageObjects.locationdisable;
import Utility.Base;
//import Utility.disablelocation;
import io.appium.java_client.android.AndroidDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Home_Screen {
	
	static AndroidDriver driver;
	public  static Logger log=LogManager.getLogger(Base.class.getName());
	
	 Home home;
	 Searchlocation_Page search;
	 Calendar calendar;
	 Players_Page player;
	 Hole hole;
	 Cancel cancel;
	 alerts alert;
	 favourites favourite;
	 Properties prop;
		Signup register;
		SignIn login;
	
	 public  Home_Screen() throws IOException{
		 this.driver=Base.getDriver();
		 //Base.executeABD("adb shell settings put secure location_providers_allowed +gps");
		 home=new Home(driver);
		 search=new  Searchlocation_Page(driver);
		 calendar=new Calendar(driver);
		 player=new Players_Page(driver);
		 hole=new Hole(driver);
		 cancel=new Cancel(driver);
		 alert= new alerts(driver);
		 favourite=new favourites(driver);
		 prop=new Properties();
		 register=new Signup(driver);
		 login=new SignIn(driver);
//		 signup.driver=Base.getDriver();	
//			signin.driver=Base.getDriver();
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				  "\\src\\test\\java\\Utility\\global.properties");
			System.out.println(System.getProperty("user.dir")+
					  "\\src\\test\\java\\Utility\\global.properties"); //syso
			
		 //sd		// FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
		prop.load(fis);
		
		 
		   
			}
	 
	 
	
	//@TC_home_03
		@Given("open the application in mobile")
		public void open_the_application_in_mobile() throws InterruptedException
		{
			    		
		
				log.info("home screen opened");
				
				
		}

		@Then("Find your tee time page is displayed")
		public void find_your_tee_time_page_is_displayed() throws InterruptedException
		{
			    // Write code here that turns the phrase above into concrete actions
			log.info("find your tee time page is opened");
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Find your tee time']"))); //'Where are you golfing?'//Find your tee time
			Thread.sleep(1500);	
			String s= home.findyour_teetime.getText();
			
			System.out.println("Test2 print:"+s);
				 Assert.assertEquals("Find your tee time",s ); //Where are you golfing?//Find your tee time
				 
				
		}

		@Then("^\"([^\"]*)\" is displayed$")
	    public void something_is_displayed(String strArg1) throws Throwable {
	        Assert.assertTrue(home.location.getText().contains(strArg1));
	    }
		//@TC_home_04
		@Then("I tap on location field")
		public void i_tap_on_location_field() throws InterruptedException
		{
				log.info( "*** clicking on location field***" );
				home.location.click();
				Thread.sleep(2000);
		}
			
		 @Then("^\"([^\"]*)\" page is displayed$")
		    public void something_page_is_displayed(String strArg1) throws Throwable {
		       Assert.assertTrue(search.Search_location.getText().contains(strArg1));
		    }
		//@TC_home_05
		@Then("I tap on Date field")
		public void i_tap_on_Date_field()
		{
		   
		log.info(" *** Clicking on date fied ***");
			
			home.date.click();
		}

		 @Then("^Calendar screen with \"([^\"]*)\" title is displayed$")
		    public void calendar_screen_with_something_title_is_displayed(String strArg1) throws Throwable {
		       Assert.assertTrue(calendar.Select_a_date.getText().contains(strArg1));
		    }
		
		//@TC_home_06
		@Then("I tap on Players field")
		public void i_tap_on_Players_field() 
		{
			log.info(" *** Clicking on players fied ***");
				home.players.click();
    
		}


	    @Then("^players dropdwon  displayed with \"([^\"]*)\" title$")
	    public void players_dropdwon_displayed_with_something_title(String strArg1) throws Throwable {
	       Assert.assertTrue(player.Player_Page.getText().contains(strArg1));
	    }

		//@TC_home_07
		@Then("I tap on Holes")
		public void i_tap_on_Holes() 
		{
		log.info(" *** Clicking on holes ***");
			home.holes.click();
		}

		@Then("^\"([^\"]*)\" as title is displaying in holes dropdown$")
	    public void something_as_title_is_displaying_in_holes_dropdown(String strArg1) throws Throwable {
	       Assert.assertTrue(hole.holes.getText().contains(strArg1));
	    }
		// @TC_home_08, // @TC_home_09, //@TC_home_10, @TC_home_11
		@Then("I hit on Cancel button")
			public void i_hit_on_Cancel_button() 
		{
			log.info(" *** Clicking on cancel button ***");
			cancel.Cancel.click();
			
		}
			
		@Then("Home page is displayed")
			public void home_page_is_displayed()
		{
			log.info("*** home page is displayed ***");
			String home_page=home.findyour_teetime.getText();
			Assert.assertEquals("Find your tee time", home_page);
			
		}
		
		//TC_24
		

	    @When("^I tap on heart icon in bottom of page$")
	    public void i_tap_on_heart_icon_in_bottom_of_page() throws Throwable {
	    	log.info("*** clicking on favourites screen ***");
	    	home.favourites.click();
	    }

	    @Then("^Favourites screen displayed$")
	    public void favourites_screen_displayed() throws Throwable {
	    	
	    	log.info("***favourites screen is displayed ***");
	    	String favourites_text=favourite.favourites_title.getText();
	    	Assert.assertEquals("My Favorites",favourites_text );
	    }
	    
	    //TC_25
	    @When("^I tap on bell icon in bottom of page$")
	    public void i_tap_on_bell_icon_in_bottom_of_page() throws Throwable {
	    	
	    log.info("***Alert screen ***");
	    	home.alerts.click();
	    }

	    @Then("^Alert screen displayed$")
	    public void alert_screen_displayed() throws Throwable {
	    	
	    	String alert_header= alert.Alert_title.getText();
	    	Assert.assertEquals("Alerts", alert_header);
	    	log.info("***"+alert_header+"***");
	    	
	    }
		
		//TC_26
		 @When("^I tap on golfcart icon in bottom of the page$")
		    public void i_tap_on_golfcart_icon_in_bottom_of_the_page() throws Throwable {
		    
		       home.playonthecourse.click();
		       log.info("*** Play on the course icon is clicked ***");
		    }

		  

		    @Then("^Play on the course screen displayed$")
		    public void play_on_the_course_screen_displayed() throws Throwable {
		        Playonthecourse p=new Playonthecourse(driver);
		        Assert.assertEquals("Find Your Course", p.Find_your_course.getText());
		       log.info("*** Play on the course screen is dispalyed***");
		    }
		    
		    //TC_27
		    @When("^I tap on hamburger icon$")
		    public void i_tap_on_hamburger_icon() throws Throwable {
		    
		    	home.My_SG.click();
		    	log.info("*** My SG screen icon is clicked***");
		    }

//		    @Then("^MySG screen is displayed with \"([^\"]*)\" as first option$")
//		    public void mysg_screen_is_displayed_with_something_as_first_option(String strArg1) throws Throwable {
//		      Assert.assertTrue(register.Register_account.getText().contains(strArg1));
//		    }
//
		    @Then("SG Account page is displayed")
		    public void sg_Account_page_is_displayed() {
		     log.info( register.Register_account.getText());
		    }

		   

}

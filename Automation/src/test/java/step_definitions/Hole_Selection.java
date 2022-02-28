package step_definitions;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import PageObjects.Hole;
import PageObjects.Home;
import Utility.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Hole_Selection {
	
	static AndroidDriver<MobileElement> driver;
	Properties prop;
	Hole h;
	public  Hole_Selection() throws IOException{
	Hole_Selection.driver=Base.getDriver();
	prop=new Properties();
    h= new Hole(driver);
    FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
			prop.load(fis);
	}

	 @When("^I select hole from  (.+) dropdown$")
	    public void i_select_hole_from_dropdown(String holeoption) throws Throwable {
     
        

    
       switch(prop.getProperty(holeoption)) {
       case "Any":
    	   h.Any.click();
    	   break;
    	   
       case "Eighteen holes":
    	   h.eighteen_holes.click();
    	  // System.out.println(h.eighteen_holes.getText());
    	   break;
    	   
       case "Nine holes":
    	   h.Nine_holes.click();
    	  // System.out.println(h.Nine_holes.getText());
    	   break;
    	   
    	 default:
    		 break;
    		   
       }
       
    }
	 @Then("^selected (.+) displayed on Home screen  $")
	    public void selected_displayed_on_home_screen(String holeoption) throws Throwable {

		Assert.assertTrue(h.hole_value.getText().startsWith(prop.getProperty(holeoption)));
	    }

	 

    	
    }

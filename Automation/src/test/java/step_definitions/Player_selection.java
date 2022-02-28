package step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import PageObjects.Home;
import PageObjects.Players_Page;
import Utility.Base;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
//@TC_13	
public class Player_selection {
	
static AndroidDriver driver;
Properties prop;
Players_Page p;
	public  Player_selection() throws IOException{
	Player_selection.driver=Base.getDriver();
	prop=new Properties();
	 p=new Players_Page(driver);
	 FileInputStream fis=new FileInputStream("C:\\Users\\aswini\\Desktop\\android_automation-sprint4\\src\\test\\java\\Utility\\global.properties");
			prop.load(fis);
	}
			@And("^I select the (.+)$")
		    public void i_select_the(String player) throws Throwable {
			
				switch(prop.getProperty(player)){
				case "Any player count" :
					p.Any_player.click();
					
				case "One player":
					p.one_player.click();
					
					break;
				case "Two players":
					p.Two_player.click();
					
					break;
				case "Three players":
					System.out.println(p.Three_player.getText());
					p.Three_player.click();					
					break;
				case "Four players":
					p.four_player.click();
					System.out.println(p.four_player.getText());
					break;
				case "Five players":
					p.five_player.click();
					//System.out.println(p.five_player.getText());
					break;
					
				case "Six players":
					p.six_player.click();
					//System.out.println(p.six_player.getText());
					break;
				default: 
					break;
						
				}
		    }
			@Then("^selected (.+) displayed on Home screen$")
		    public void selected_displayed_on_home_screen(String player) throws Throwable {
			
					String text=p.text_value.getText();
				Assert.assertFalse(prop.getProperty(player).startsWith(text));
				
				
		    }
		
			
		


}

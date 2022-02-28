package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Players_Page {
	
	public Players_Page(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//xpath for Calendar title
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Player count']")
			 public WebElement Player_Page ;
			
			@AndroidFindBy(xpath="//android.widget.LinearLayout")
			public WebElement players_list;
			
			//xpath for AnyPlayer Count
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Any player count']")
			public WebElement Any_player;
			
			//xpath for select one player
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']")
			public WebElement one_player;
			
			//xpath for select 2 players
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']")
			public WebElement Two_player;
			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']")
			public WebElement Three_player;
			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']")
			public WebElement four_player;
			
			@AndroidFindBy(xpath="//android.widget.TextView[@text='Five players']")
			public WebElement five_player;

			@AndroidFindBy(xpath="//android.widget.TextView[@text='Six players']")
			public WebElement six_player;
			
			@AndroidFindBy(xpath="//android.view.ViewGroup[@index='3']/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'tv_value')]")
	    	public WebElement text_value;
			
			
			
			
//			

}

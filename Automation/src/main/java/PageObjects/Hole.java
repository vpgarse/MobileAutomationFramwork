package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

//TC_14
public class Hole {
	
	public Hole(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	//xpath for hole title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Holes']")
	 public WebElement holes;
	
	//xpath for 18holes
	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='2']")
	 public WebElement eighteen_holes;
	
	//xpath for 18holes
//	@AndroidFindBy(xpath="//android.widget.TextView[@text='Eighteen holes']")
//	 public WebElement eighteen_holes;

	@AndroidFindBy(xpath="//android.view.ViewGroup[@index='1']")
	 public WebElement Nine_holes;
	
	//xpath for 18holes
//		@AndroidFindBy(xpath="//android.widget.TextView[@text='Nine holes']")
//		 public WebElement Nine_holes;
		
		//xpath for Any
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Any']")
		 public WebElement Any;
		
		
		@AndroidFindBy(xpath="//android.view.ViewGroup[@index='4']/android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'tv_value')]")
		public WebElement hole_value; 
		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Nine']")
		public WebElement nine_selected;
		 
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Eighteen']")
		public WebElement Eighteen_selected;
		
}

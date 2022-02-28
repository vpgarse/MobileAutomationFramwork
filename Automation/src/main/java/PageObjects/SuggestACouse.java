package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SuggestACouse {
	
	public SuggestACouse(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//xpath for title of suggest a course title header
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Suggest A Course']")
	public WebElement Title_Suggest_A_Course_page;
	
	//xpath for Name 
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'suggest_a_course_name')]")
	public WebElement name;
	
	//xpath for City
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'suggest_a_course_city')]")
	public WebElement City;
	
	//xpath for State
	
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'suggest_a_course_state')]")
	public WebElement State;
	
	//xapth for country
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'suggest_a_course_country')]")
	public WebElement country;
		
	//xpath for submit a course
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Submit Course']")
	public WebElement Submitcourse;
	
	
	//xpath for coursesubmission message
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Your Course Has Been Submitted!']")
	public WebElement course_submission;

}

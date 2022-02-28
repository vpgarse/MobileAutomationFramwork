package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import java.util.List;
public class Playonthecourse {
	
	
	public Playonthecourse(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
//	
	
	//xpath for title of play on the course
		@AndroidFindBy(xpath="//android.widget.FrameLayout[contains(@resource-id,'collapsing_toolbar')]") 
		public WebElement Title_Play_on_the_course;
		
		//xpath for Findyour course
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Find Your Course']")
		public WebElement Find_your_course;
		
		
		//xpath for search screen  on play on the course
		@AndroidFindBy(xpath="//android.widget.EditText[@text='Any course name']")
		public WebElement search_course_Onthecourse;
		
		//xpath for searchscreen suggestion box
		@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'item_search_icon')]")
		public WebElement course_suggestion_Onthecourse;
		
		
		//xpath for recent tab
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Recent']")
				public WebElement Recent_tab;
		
		//xpath for suggested tab
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Suggested']")
		public WebElement Suggested;
		
		
		//xpath for Course GPS screen
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Course GPS']")
		public WebElement Course_GPS_Screen;
		
		//xpath Previous results 		(I haven't used)
//		@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView[contains(@resource-id,'searchResultRecycler')]")
//		public WebElement list_courses;
//		
		
		//xpath for Suggest a course button		
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Suggest A Course!']")
		public WebElement Suggest_A_Course;
		
		

}
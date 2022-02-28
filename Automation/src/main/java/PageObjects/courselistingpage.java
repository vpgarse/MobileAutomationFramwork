package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class courselistingpage {
	
	public courselistingpage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@index='1']") 
	public WebElement title_of_course;
	
	//xpath for course favourite icon	
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_favorite')]")
	public WebElement favourite_courselistingpage;
	
	//xpath for alert icon
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_alert')]")
	public WebElement alert_courselistingpage;
	
	
	//xpath for courseinfo
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_info')]")
	public WebElement course_info;
	
	//xpath for  Tee time slot start time
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_time')]")
	public WebElement teetime_slot;
	
	//xpath for green fee
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_price')]")
	public WebElement greenfee_course;
	
	//xpath for holes
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_holes')]")
	public WebElement hole;
	
	//xpath for Players
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_players')]")
	public WebElement players;
	
	//xpath for provider sites
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_sites')]")
	public WebElement sites;
	
	
	//xpath for special rate
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_special_rate_chip')]")
	public WebElement special_rates;
	
	//xpath for teetimeslot arrow
	@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'iv_tee_time_slot_arrow')]")
	public WebElement teetime_slot_arrow;
	
	//xpath for nextbutton on calendar	
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_next')]")
	public WebElement teetimelisting_next;
		
		
	//xpath for previous button on calendar
	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'btn_date_picker_previous')]")
	public WebElement teetimelisting_previous;
	
	
	
	public void Navigatetotheavailablecalendar(AndroidDriver driver) {
		try{
	if(driver.findElement(By.xpath("//android.widget.TextView[@text='No Results.']")) != null)
			{
				driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'btn_date_picker_next')]")).click();
				Navigatetotheavailablecalendar(driver);
				
			}
		}
	catch(Exception e) {		
		
		
	}
		
	}
		public void teetime(AndroidDriver driver) {
			
		
//			 boolean bFlag = true;
//			  while(bFlag){
			List<MobileElement> teetimes =driver.findElements(By.xpath("android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView"));
		//System.out.println(teetimes);
			
		    for (int i = 0; i <teetimes.size(); i++) {
		    	System.out.println(teetimes.get(i));
	
		          if(teetimes.get(i).findElement(By.xpath("//androidx.cardview.widget.CardView/android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_time')]")).getText().equals("12:40 P")) {
		           
		            	teetimes.get(i).findElement(By.xpath("//androidx.cardview.widget.CardView/android.widget.TextView[contains(@resource-id,'tv_tee_time_slot_time')]")).click();     
		                	//bFlag=false;
		            	teetime(driver);
		               
		         //   }
		            
		    }
		  
	  }
			
		   
//			catch(Exception e) {		
//				
//				System.out.println("No tee time found");
//			}
		
		}
}

package Utility;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class disablelocation {
	
	public static void enableAndDisableLocation(AppiumDriver<MobileElement> driver) {
        ((AndroidDriver<MobileElement>) driver).openNotifications();
        ((AndroidDriver<MobileElement>) driver).toggleLocationServices();
        driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'switch_text')]"));
    }
//static AndroidDriver driver;
//@BeforeTest
//public static void setUp() throws Exception{
//DesiredCapabilities cap= new DesiredCapabilities();
//
//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings" );
//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings$LocationSettingsActivity");
//
//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
//driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//}
//
//@Test
//public static void settingsTest() throws Exception{
//System.out.println(driver.currentActivity());
//driver.findElement(By.name("Location")).click();
//driver.setTrackScrollEvents(true);
//driver.findElement(By.className("android.widget.Switch")).click();
//Thread.sleep(5000);
//}
}
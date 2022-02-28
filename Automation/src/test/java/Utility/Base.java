package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base  {
	  public  static AppiumDriverLocalService service;
	static AndroidDriver<MobileElement> driver;
 Properties prop=new Properties();
	public  static Logger log=LogManager.getLogger(Base.class.getName());

	
	 
		public static AppiumDriverLocalService startServer()
		{
			
	boolean flag=checkIfServerIsRunnning(4724); //4723
		if(!flag)
		{
			
		
			service=AppiumDriverLocalService.buildDefaultService();
			service.start(); //Satya: '--session-override true' need to add to over come 'previous session wasn't shutdown properly'
			
		}
		return service;
			
		}
		
		
		
	public static boolean checkIfServerIsRunnning(int port) {
			
			boolean isServerRunning = false;
			ServerSocket serverSocket;
			try {
				serverSocket = new ServerSocket(port);
				
				serverSocket.close();
			} catch (IOException e) {
				//If control comes here, then it means that the port is in use
				isServerRunning = true;
			} finally {
				serverSocket = null;
			}
			return isServerRunning;
		}
	
	
	
	public static void executeABD(String command) throws IOException
	{
		// command="adb shell settings put secure location_providers_allowed -gps";
	Runtime.getRuntime().exec(command);
	System.out.println("Executed adb command.");
	
	
	}
		
	
	@Before("@staging") 
	public static WebDriver  appiumSetup() throws InterruptedException, IOException {
		
		
	//	executeABD("adb shell settings put secure location_providers_allowed -gps");
		startServer();
		
		  Properties prop=new Properties(); FileInputStream fis=new
		  FileInputStream(System.getProperty("user.dir")+
		  "\\src\\test\\java\\Utility\\global.properties"); prop.load(fis); //Ctrl+Shift+/ //sd
		 
		//property_validation();
		
	DesiredCapabilities cap=new DesiredCapabilities();	
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("device"));   //R9ZR302T7ZH
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"vvSatya's Galaxy M11");
	//String device=System.getProperty("devicename");  vvSatya's Galaxy M11
	//cap.setCapability(MobileCapabilityType.NO_RESET, true);
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("device"));
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,device);
	cap.setCapability(MobileCapabilityType.VERSION, "10"); //9
	cap.setCapability("platformName", "Android");
	cap.setCapability("autoGrantPermissions", true); 	
	//cap.setCapability("appPackage", prop.get("package1"));
	//cap.setCapability("appActivity", prop.get("activity1"));
	cap.setCapability("appPackage", "com.supremegolf.app.stage");
	cap.setCapability("appActivity", "com.supremegolf.app.presentation.screens.splash.SplashActivity");
	//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.supremegolf.app.stage" );	
	//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.supremegolf.app.presentation.screens.splash.SplashActivity");
	
	
	//driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap); //local Simulator??Satya
	  driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),cap); //local Simulator??Satya
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	log.info("*** Test case execution start***");


	// Thread.sleep(1500);
	// driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	return driver;
	
}
	


	@After
	public void tearDown() {
		
	driver.quit();
	 log.info("*** Test case execution end***");
		
	}
	public static AndroidDriver getDriver() {
		
		return driver;
	}
	
	}
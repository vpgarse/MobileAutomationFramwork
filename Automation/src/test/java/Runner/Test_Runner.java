package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
 //features = "src/test/resources/features/",  //searchbutton.feature
		features = "src/test/resources/features/googlesigin.feature",
 glue= {"step_definitions", "Utility"},
tags= "@TC_FB1", plugin= {"pretty","html:target/report.html","json:target/cucumber.json","junit:target/cucumber-reports/Cucumber.xml"})
public class Test_Runner extends AbstractTestNGCucumberTests {
	
	
	
	//tags= "@staging" @TC_SIGN5 
	//@TC_signup01

}

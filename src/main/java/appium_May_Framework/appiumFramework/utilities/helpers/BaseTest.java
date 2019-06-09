package appium_May_Framework.appiumFramework.utilities.helpers;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import appium_May_Framework.appiumFramework.utilities.utils.AppiumDriverManager;

public class BaseTest {
	
	@BeforeSuite
	public void setup() {
		//initilization methods will be here -- db integeration, locators init, etc
	}
	
	@BeforeTest
	public void testSetup() {
		//driver initilize
		AppiumDriverManager.getDriver("Android");
	}
	
	@BeforeMethod
	public void methodSetup() {
		//test case groups, logs test case name	
		
	}
	
	
	@AfterTest
	public void testFlush() {
		//driver stop 
		
	}
	
	@AfterSuite
	public void suiteFlush() {
		//db integeration flush
	}
	
	
	
	
	

}

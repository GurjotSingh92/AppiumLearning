package appium_May_Framework.appiumFramework.utilities.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppiumDriverManager {
	
	public static AppiumDriver<MobileElement> driver; //similar to WebDriver driver;
	static String USER_DIR=System.getProperty("user.dir");
	
	public static WebDriver getDriver(String OSName) {
		try {
			if (driver == null) {
				switch(OSName) {
				case "Android":
					driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
						Capabilities.ANDROID.getCapabilities());
					break;
				case "iOS":
					break;
				}
			}
			return driver;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}

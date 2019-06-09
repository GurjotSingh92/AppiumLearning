package appium_May_Framework.appiumFramework.utilities.utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public enum Capabilities {
	
	ANDROID{
		public DesiredCapabilities getCapabilities() {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appPackage", "net.one97.paytm");
			capabilities.setCapability("appActivity", "net.one97.paytm.AJRJarvisSplash");
			capabilities.setCapability("dontStopAppOnReset", "true");
			// capabilities.setCapability(MobileCapabilityType.APP,
			// System.getProperty("user.dir")+"/Base_App_Files/android/"+app_and);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "CAA_Test_Device");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			// following ("true") is optional to auto allow all permissions and disable
			// pop-ups
			capabilities.setCapability("autoGrantPermissions", "true");
			return capabilities;
		}
		
	}, 
	
	IOS {
		public DesiredCapabilities getCapabilities() {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("appPackage", "");
			capabilities.setCapability("appActivity", "");
			capabilities.setCapability("dontStopAppOnReset", "true");
			// capabilities.setCapability(MobileCapabilityType.APP,
			// System.getProperty("user.dir")+"/Base_App_Files/android/"+app_and);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			capabilities.setCapability(MobileCapabilityType.UDID, "");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "CAA_Test_Device");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30000);
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			// following ("true") is optional to auto allow all permissions and disable
			// pop-ups
			capabilities.setCapability("autoGrantPermissions", "true");
			return capabilities;
			
		}
		
	};
	public abstract DesiredCapabilities getCapabilities();
}

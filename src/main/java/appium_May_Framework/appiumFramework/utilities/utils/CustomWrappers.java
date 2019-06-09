package appium_May_Framework.appiumFramework.utilities.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CustomWrappers {
	
	private static WebDriver driver = AppiumDriverManager.getDriver("Android");
	
	
	/***
	 * 
	 * @param by - can be xpath,css or any locator strategy
	 * @param t - time 
	 */
	public static void explicitWait(By by, int t) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, t);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	/***
	 * 
	 * @param by
	 * @param t
	 */
	public static void customClick(By by, int t) {
		explicitWait(by,t);   
		driver.findElement(by).click();
	}
	
	/***
	 * 
	 * @param by
	 * @param t
	 * @param key
	 */
	public static void enter_Text(By by, int t, String key) {
		explicitWait(by,t);   
		driver.findElement(by).sendKeys(key);
	}
	
	
	/*
	 * getListOfElementsOnScreen, getListOfElementsTillEnd (dont have expected page), Scroll in appium (down,upwards,left, right),
	 */

}

package Project.UnitTest;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;

public class UnitTesting {

	public static void main(String[] args) {
		System.out.println("Creating the Driver Object");
		long startMilliseconds = System.currentTimeMillis();
		AndroidDriver<WebElement>driver=null;

		try {
			DesiredCapabilities capabilities=UnitTesting.getAndroidcaps();
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			System.out.println("created successfull");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			driver = null;
		}

		long elapsedSeconds = (System.currentTimeMillis() - startMilliseconds) / 1000;
		System.out.println("Driver Object created in " + elapsedSeconds + " seconds");
		if(driver!=null) {
			
		}
		

	}
	
	public static DesiredCapabilities Androidcaps=null;

	public static DesiredCapabilities getAndroidcaps() {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("newCommandTimeout", 600);
	        capabilities.setCapability("launchTimeout", 90000);
	        capabilities.setCapability("udid", "10BCB100Z20011Z");
	        capabilities.setCapability("automationName", "UiAutomator2");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("appPackage", "com.salesforce.chatter");
	        capabilities.setCapability("appActivity", "com.salesforce.chatter.Chatter");
	        capabilities.setCapability("app", "C:\\Users\\admin\\Desktop\\apk\\com.salesforce.chatter_2023-03-13.apk");
	        Androidcaps=capabilities;
		return Androidcaps;
	}


}

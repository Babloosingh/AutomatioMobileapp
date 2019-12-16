package AmazonetestApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class AmazontestAppium {
	public AndroidDriver<MobileElement> driver;

	@Test
	public void f() {
	}

	@Parameters({ "deviceName_", "UDID_", "platformVersion_", "URL_" })

	@BeforeMethod
	public void desiredcapability(String deviceName_, String UDID_, String platformVersion_, String URL_) {			 
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName_);
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", platformVersion_);
		caps.setCapability("udid", UDID_);
		// caps.setCapability("appPackage", "com.testm.app");
		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		// caps.setCapability("New Time_Spend","100");
		caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");

		try {
			driver = new AndroidDriver<MobileElement>(new URL(URL_), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Test
	public void Test2() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/action_bar_burger_icon").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//android.widget.TextView[@text='Prime']").click();
		Thread.sleep(6000);
		driver.findElementById("no-thanks").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//android.widget.TextView[@text='Mobiles']").click();
		Thread.sleep(6000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/rs_search_src_text").sendKeys("Andriod mobile");
		Thread.sleep(1000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/action_bar_burger_icon").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//android.widget.TextView[@text = 'Home' ]").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//android.widget.TextView[@text = 'Fashion]").click();
		Thread.sleep(6000);
   }

	@Test
	public void Test1() throws InterruptedException {

		Thread.sleep(6000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		Thread.sleep(6000);		
		driver.findElementById("in.amazon.mShop.android.shopping:id/action_bar_burger_icon").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//android.widget.TextView[@text='Amazon Pay']").click();		   
		Thread.sleep(6000);
	}



	@AfterTest
	public void End() throws Exception {
		driver.closeApp();
		driver.launchApp();

	}

}
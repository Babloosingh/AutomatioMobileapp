package AmazonetestApp;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class  nativeappamazone {
	public static AndroidDriver<MobileElement> driver;  
	 
	   @BeforeMethod
	   public void beforeClass() {
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("deviceName", "MOTO C");
		    caps.setCapability("platformName", "Android");
		    caps.setCapability("platformVersion", "7.0");
		    caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		    caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		    try {
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
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
		driver.findElementByXPath("//android.widget.TextView[@text = 'Fashion']").click();
		Thread.sleep(6000);
   }
	
	
	@Test
	public void Test1() throws InterruptedException {

		Thread.sleep(6000);
		driver.findElementById("in.amazon.mShop.android.shopping:id/skip_sign_in_button").click();
		Thread.sleep(6000);	
		driver.findElementById("in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label").click();
		Thread.sleep(6000);
		
	        AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.view.View"));
	        MobileElement listGroup = list
	                .findElement(MobileBy
	                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
	                                + "new UiSelector().text(\" Beauty, Health\"));"));
	        assertNotNull(listGroup.getLocation());
	        listGroup.click();
	        Thread.sleep(6000);
			driver.findElementByXPath("//android.view.View[@text = 'Beauty, Health']").click();
			
		
		

	
	
	}



}
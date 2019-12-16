package com.AutomationTesting.AutomationTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Barbeque {
	public static AndroidDriver<MobileElement> driver;  
	 
	   @BeforeClass
	   public void beforeClass() {
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("deviceName", "MOTO C");
		    caps.setCapability("platformName", "Android");
		    caps.setCapability("platformVersion", "7.0");
		    //caps.setCapability("appPackage", "com.testm.app");
		    caps.setCapability("appPackage", "com.jamhub.barbeque");
		    //caps.setCapability("New Time_Spend","100");
		    caps.setCapability("appActivity", "com.jamhub.barbeque.barbeque.SplashScreen");
		    //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		    try {
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
	   
	   @Test	   
	   public void splashome() {
		   //driver.findElementById("com.jamhub.barbeque:id/bt_login").click();
		   //driver.findElementById("com.jamhub.barbeque:id/bt_fb").sendKeys("9986840240");
		   driver.findElementById("com.jamhub.barbeque:id/ll_book").click();
		   driver.findElementById("com.jamhub.barbeque:id/view_date_indicator").click();
		   driver.findElementById("").click();
		   
		   
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}

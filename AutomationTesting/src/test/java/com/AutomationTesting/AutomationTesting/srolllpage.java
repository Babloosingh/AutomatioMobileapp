package com.AutomationTesting.AutomationTesting;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class srolllpage {
	public static AndroidDriver<MobileElement> driver; 
	   @Test
	   public void beforeClass() {
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("deviceName", "MOTO C");
		    caps.setCapability("platformName", "Android");
		    caps.setCapability("platformVersion", "7.0");
		    caps.setCapability("appPackage", "com.wt.apkinfo");
		    //caps.setCapability("New Time_Spend","100");
		    caps.setCapability("appActivity", "com.nextbillion.groww.MainActivity");
		    //driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		    try {
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
	   }

}

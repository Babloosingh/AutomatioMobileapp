package com.project.PositiveLoginTest;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PositiveLoginTest {
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

}

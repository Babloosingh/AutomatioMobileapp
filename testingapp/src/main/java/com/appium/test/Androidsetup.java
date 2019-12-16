package com.appium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Androidsetup {
	protected AndroidDriver<MobileElement> driver;
	 public void setUp() throws InterruptedException, MalformedURLException {
	DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceName", "MOTO C");
    caps.setCapability("platformName", "Android");
    caps.setCapability("platformVersion", "7.0");
    caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
    caps.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
//    caps.setCapability("app", "/home/qapitol/Downloads/amazon.apk");
//    caps.setCapability("noReset", "true");
//    caps.setCapability("useNewWDA", "true");
    
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);

   
}

}

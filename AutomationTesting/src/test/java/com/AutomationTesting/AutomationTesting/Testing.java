package com.AutomationTesting.AutomationTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Testing {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	        
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("deviceName", "MOTO C");
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("platformVersion", "7.0");
	    caps.setCapability("appPackage", "com.testm.app");
	    //caps.setCapability("New Time_Spend","100");
	    caps.setCapability("appActivity", "com.testm.app.main.SplashActivity");
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	
	     
	     Thread.sleep(6000);
	     driver.findElementById("com.testm.app:id/welcome_layout_next").click();
	     driver.findElementById("com.testm.app:id/welcome_layout_next").click();
	     driver.findElementById("com.testm.app:id/welcome_layout_next").click();
	     driver.findElementById("com.testm.app:id/welcome_layout_next").click();
	     driver.findElementById("android:id/button1").click();
	     driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	     driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	     driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	     driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	     driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	     driver.findElementById("com.testm.app:id/nextButton").click();
	     driver.findElementById("com.testm.app:id/gotItBtn").click();
	     Thread.sleep(3000);
	     
	     driver.findElementById("android.widget.ProgressBar").click();
	     //driver.findElementById("com.testm.app:id/ivBackgroundn").click();
	     
	     
	     
	    }

	
	
		    }
		

	



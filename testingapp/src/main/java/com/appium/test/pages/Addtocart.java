package com.appium.test.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Addtocart extends Basepage{
    
    public Addtocart(WebDriver driver) {
        super(driver);
    }
    
    public Addtocart addToCart() throws InterruptedException {
        
     Thread.sleep(2000);         
       
        /*
         * MobileElement listitem2 =(MobileElement)driver.findElement(
         * MobileBy.AndroidUIAutomator( "new UiScrollable(new UiSelector())" +
         * ".scrollIntoView(new UiSelector().resourceId(\"add-to-cart-button\"));"));
         */
     MobileElement listitem2 =(MobileElement)driver.findElement(
               MobileBy.AndroidUIAutomator(
                      "new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector()."
                     + "resourceId(\"add-to-cart-button\"));"));
       listitem2.click();
       Thread.sleep(10000);
       return new Addtocart(driver);
    }
}
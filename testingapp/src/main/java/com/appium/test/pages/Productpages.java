package com.appium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Productpages extends Basepage{
    
    By searchBox_textfield = By.className("android.widget.EditText");
    
    public Productpages(WebDriver driver) {
        super(driver);
    }
    
    public Productpages searchProduct() {
       driver.findElement(searchBox_textfield).sendKeys("Printers"+"\n");
       
       MobileElement listitem =(MobileElement)driver.findElement(
               MobileBy.AndroidUIAutomator(
                      "new UiScrollable(new UiSelector()).scrollIntoView("+"new UiSelector()."
                     + "text(\"HP DeskJet 2131 All-in-One Inkjet Colour Printer\"));"));
       
       listitem.click();
       return new Productpages(driver);
    }
}

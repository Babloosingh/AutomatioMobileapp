package com.appium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Languagepages  extends Basepage{
    
    By english_radio = By.className("android.widget.RadioButton");
    By save_button = By.linkText("Save Changes");
    
    By close_button = By.id("icp-btn-close");
    
    By popOver = By.id("a-popover-root");
    
    public Languagepages(WebDriver driver) {
        super(driver);
    }
    
    public Languagepages chooseLanguage() {
        waitForVisibilityOf(popOver);
           driver.findElement(english_radio).click();
           driver.findElement(save_button).click();
//           driver.findElement(close_button).click();
         return new Languagepages(driver);
    }
}


package com.appium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpages extends Basepage{
    
    By signInButton = By.id("in.amazon.mShop.android.shopping:id/sign_in_button");
    By email_textField = By.id("ap_email_login");
    By pass_textField = By.id("ap_password");
    By submit_button = By.id("signInSubmit");
    By continue_button = By.id("continue");
    
    public Loginpages(WebDriver driver) {
        super(driver);
    }
    
    public Loginpages vaildLogin() {
         waitForClickabilityOf(signInButton);
         driver.findElement(signInButton).click();
         waitForVisibilityOf(email_textField);
         driver.findElement(email_textField).sendKeys("mrbabloo123@gmail.com");
         driver.findElement(continue_button).click();
         waitForVisibilityOf(pass_textField);
         driver.findElement(pass_textField).click();
         driver.findElement(pass_textField).sendKeys("pwd12345");
         driver.findElement(submit_button).click();
         return new Loginpages(driver);
    }
}

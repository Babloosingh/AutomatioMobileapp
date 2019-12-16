package Tcom.project.page;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class loginpage extends base{
    
    By Login_button = By.xpath("//android.view.View[@content-desc=\\\"continue button_chooseLanguage\\");
    MobileElement FarEye_logo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[1]/android.widget.ImageView\"));
   // By FarEye_logo = By.className("android.widget.ImageView");
    int timeInMs = 8000;
    By Confirm_okbutton = By.id("android:id/button1");


	
	
    public loginpage(AndroidDriver driver) {
        super(driver);
    }
    
    AndroidTouchAction touch = new AndroidTouchAction ((PerformsTouchActions) driver);
    touch.longPress(LongPressOptions.longPressOptions()
              .withElement (ElementOption.element (fareyepress))).perform ();


         //driver.findElement(FarEye_logo).click();
         waitForClickabilityOf(Confirm_okbutton);
         driver.findElement(Confirm_okbutton).click();
         TouchAction Action = new TouchAction((PerformsTouchActions) driver);
         
//         waitForVisibilityOf(email_textField);
//         driver.findElement(email_textField).sendKeys("mrbabloo123@gmail.com");
//         waitForVisibilityOf(pass_textField);
//         driver.findElement(pass_textField).click();
//         driver.findElement(pass_textField).sendKeys("pwd12345");
//         driver.findElement(submit_button).click();
         return new loginpage(driver);
    }
}
	

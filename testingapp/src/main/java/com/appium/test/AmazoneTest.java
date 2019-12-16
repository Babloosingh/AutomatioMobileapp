package com.appium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.appium.test.pages.Addtocart;
import com.appium.test.pages.Languagepages;
import com.appium.test.pages.Loginpages;
import com.appium.test.pages.Productpages;

public class AmazoneTest extends Androidsetup{
	 @BeforeClass
	    public void set() throws Exception {
	        setUp();
	    }
	    
	    @AfterClass
	    public void tearDown() throws Exception {
	        Thread.sleep(10000);
	        driver.quit();
	    }
	    
	    @Test(priority=1,description = "This test case will login into app")
	    public void login() throws InterruptedException {
	         new Loginpages(driver).vaildLogin();
	    }
	    
	    @Test(priority=2,description = "This test case will choose the language")
	    public void language() throws InterruptedException {
	         new Languagepages(driver).chooseLanguage();
	    }
	    
	    @Test(priority=3,description = "This test case will search the product")
	    public void product() throws InterruptedException {
	         new Productpages(driver).searchProduct();
	    }
	    
	    @Test(priority=4,description = "This test case will add item to cart")
	    public void addToCart() throws InterruptedException {
	         new Addtocart(driver).addToCart();
	    }

}

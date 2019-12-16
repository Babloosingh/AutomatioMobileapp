package Tcom.project.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Tcom.project.page.loginpage;

public class teststep  extends AndriodSetup{
	 @BeforeClass
	    public void set() throws Exception {
	        setup();
	    }
	    
	    @AfterClass
	    public void tearDown() throws Exception {
	        Thread.sleep(10000);
	        driver.quit();
	    }
	    
	    @Test(priority=1,description = "This test case will login into app")
	    public void login() throws InterruptedException {
	         new loginpage(driver).vaildLogin();
	    }
}

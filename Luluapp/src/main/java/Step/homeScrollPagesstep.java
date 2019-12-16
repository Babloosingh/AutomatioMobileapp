package Step;

import AndroidSetup.AndroidSetup;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import po.scrlollhomepagespo;

public class homeScrollPagesstep extends AndroidSetup {
	@Step("click in Home Text field")
	public static void ClickonhomeButton() {
		click("id",scrlollhomepagespo.CLICK_HOMESEARCH_TEXTFIELD);
	}

	@Step("click on Cancel Back Button")
	public static void clickoncancelButton() {
		click("xpath",scrlollhomepagespo.CANCEL_BUTTON);
		  MobileElement listitem =(MobileElement)driver.findElement(
	               MobileBy.AndroidUIAutomator(
	                      "new UiScrollable(new UiSelector())."
	                      + "scrollIntoView("+"new UiSelector()."
	                              + "text(\"ALL CATEGORIES\"));"));
	       
	       listitem.click();
	       
	       try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Step("click on Electronc shop now ")
	public static void ClickOnElectronics() {
		click("xpath",scrlollhomepagespo.ELECTRONICS_SHOPNOW);
		
	}
	
	
	@Step("click on home Living ")
	public static void ClickOnHomeLiviong() {
		click("xpath",scrlollhomepagespo.HOME_LIVING);
	}
	
	@Step("click on home Living ")
	public static void ClickOnLuggageDropDownicon() {
		click("xpath",scrlollhomepagespo.LUGGAGE_DRODOWNICONICON);
	}
	
	
	@Step("click on Laptop Bages ")
	public static void ClickOnLaptop() {
		click("xpath",scrlollhomepagespo.LAPTOP_BAGS);
		  MobileElement listitem =(MobileElement)driver.findElement(
	               MobileBy.AndroidUIAutomator(
	                      "new UiScrollable(new UiSelector())."
	                      + "scrollIntoView("+"new UiSelector()."
	                              + "text(\"PUMA Academy Backpack Black Floral 07573323\"));"));
	       
	       listitem.click();
	       
	       try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       

		
		
	}
	
	

	
	@Step("click on Add Price ")
	public static void ClickOnAddPrice() {
		click("id",scrlollhomepagespo.ADD_VALU);
		}
	
	@Step("click on home button")
	public static void ClickOnHomeButton() {
		click("id", scrlollhomepagespo.GOTOHOME_BUTTOM);
	}
	

	
	
	
	
}

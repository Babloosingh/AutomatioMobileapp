package Step;

import AndroidSetup.AndroidSetup;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import po.StoreLocatorCheckPO;
import po.checkMyOrderpo;

public class storeLocatorStep extends AndroidSetup {
	
	@Step("Click on home text field")
	public static void ClickOnHomeTextField() {
		click("xpath",StoreLocatorCheckPO.ClLICK_ONTEXTFIELDHOMEPAGE);
	}
	
	@Step("Click On Cancle Button ")
	public static void ClickOnCancleButton() {
		click("id",StoreLocatorCheckPO.CLICKONCANCEL_BUTTON);
	}
	
	@Step("Click On Home  Menu Button ")
	public static void ClickOnHomeMenuButton() {
		click("AccessibilityId",StoreLocatorCheckPO.CLICKONHOMEMENU_BUTTON);
	}

	@Step("CLICK CHECk STORELOCATOR ")
	public static void ClickOnStoreLocator() {
		click("id",StoreLocatorCheckPO.CLICKCHECK_STORELOCATOR);
	}
	
	@Step("SELCET COUNTRY ")
	public static void ClickOnSelectCountry() {
		click("id",StoreLocatorCheckPO.SELCET_COUNTRY);
	}
	@Step("CLICK_COUNTRY_KSA ")
	public static void ClickOnSelectCountryKSA() {
		click("xpath",StoreLocatorCheckPO.CLICK_COUNTRY_KSA);
	}
	@Step("SELCET CITY ")
	public static void ClickOnCity() {
		click("id",StoreLocatorCheckPO.SELCET_CITY);
		
	}
	@Step("CLICK_CITY_JEDDSH ")
	public static void ClickOnCityJEDDSH() {
		click("xpath",StoreLocatorCheckPO.CLICK_CITY_JEDDSH);
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	       MobileElement listitem =(MobileElement)driver.findElement(
//	               MobileBy.AndroidUIAutomator(
//	                      "new UiScrollable(new UiSelector())."
//	                      + "scrollIntoView("+"new UiSelector()."
//	                              + "text(\"Lulu Hypermarket,Al Khobar\"));"));
	       //Lulu Xpress, Galleria Mall, Fanateer, Al Jubail
	       //ALL CATEGORIES
	       
	       //listitem.click();
//	 MobileElement listitem =(MobileElement)driver.findElement(
//             MobileBy.AndroidUIAutomator(
//                    "new UiScrollable(new UiSelector())."
//                    + "scrollIntoView("+"new UiSelector()."
//                            + "text(\"\"));"));
//	 listitem.click();
//	 try {
//		Thread.sleep(6000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	 
	}
	
	@Step("CLICK on adresh ")
	public static void ClickOnAddersh() {
		click("xpath",StoreLocatorCheckPO.CLICKON_FIRSTADDRESS);
	}
	
	
	@Step("CLICK BACK BUTTON")
	public static void ClicBackButton() {
		click("xpath",StoreLocatorCheckPO.CLICK_BACK_BUTTON);
		
	}
	
	@Step("CLICK BACK BUTTON")
	public static void ClicCancelButton() {
		click("id",StoreLocatorCheckPO.CLICK_CANCEL_BUTTON);
		
	}
	
	@Step(" Click On Home Button")
	public static void ClickOnHomeButton() {
		click("id",checkMyOrderpo.CLICKHOME_BUTTON);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//public static final String CLICKCHECK_STORELOCATOR ="com.lulu.commerce:id/btnStoreLocator";
	//public static final String SELCET_COUNTRY ="com.lulu.commerce:id/btnCountryClick";
	//public static final String CLICK_COUNTRY_KSA ="//*[@class=\"android.widget.TextView\"][@text=\"KSA\"]";
	//public static final String SELCET_CITY ="com.lulu.commerce:id/btnCityClick";
	//public static final String CLICK_CITY_JEDDSH ="//*[@class=\"android.widget.TextView\"][@text=\"Jeddah\"]";
	// SCRLOOBY TEXT= Lulu Xpress, Galleria Mall, Fanateer, Al Jubail
	//public static final String  CLICK_BACK_BUTTON="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView";
	//public static final String  CLICK_CANCEL_BUTTON="com.lulu.commerce:id/btnBack";
	//public static final String CLICKHOME_BUTTON ="com.lulu.commerce:id/btnHome";
}

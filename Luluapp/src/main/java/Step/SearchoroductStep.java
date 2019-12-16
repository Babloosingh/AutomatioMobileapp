package Step;
import AndroidSetup.AndroidSetup;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import po.searchProductPo;

public class SearchoroductStep extends AndroidSetup {
	
	@Step("HomeSearch Texfield")
	public static void ClickOnHomeSearchTextfield() {
		click("id", searchProductPo.HOMESEARCH_TEXTFIELD);
		
	}
	
	//@Step("Tap on Text field")
	public static void ClickOnintextField() {

		enterText("id", searchProductPo.TAPON_SEARCH,"iphone");

	}


	
	@Step("Tap on All Result")
	public static void ClickOnResult() {
		click("xpath", searchProductPo.TAPON_ALL_RESULT_IPHONE);
	       MobileElement listitem =(MobileElement)driver.findElement(
	               MobileBy.AndroidUIAutomator(
	                      "new UiScrollable(new UiSelector())."
	                      + "scrollIntoView("+"new UiSelector()."
	                              + "text(\"Apple iPhone 11 Pro Max 64GB Gold\"));"));
	       
	       listitem.click();
	}
	
	@Step("Scrllo Item And Select")
	public static void ClicScrollandADDItem() {	

	}
}


	
	
	



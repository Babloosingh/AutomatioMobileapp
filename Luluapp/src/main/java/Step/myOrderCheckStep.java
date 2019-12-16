package Step;

import AndroidSetup.AndroidSetup;
import io.qameta.allure.Step;
import po.checkMyOrderpo;

public class myOrderCheckStep extends AndroidSetup {
	
	@Step("Click on home text field")
	public static void ClickOnHomeTextField() {
		click("xpath",checkMyOrderpo.ClLICK_ONTEXTFIELDHOMEPAGE);
	}
	
	@Step("Click On Cancle Button ")
	public static void ClickOnCancleButton() {
		click("id",checkMyOrderpo.CLICKONCANCEL_BUTTON);
	}
	
	@Step("Click On Home  Menu Button ")
	public static void ClickOnHomeMenuButton() {
		click("AccessibilityId",checkMyOrderpo.CLICKONHOMEMENU_BUTTON);
	}
	
	
	@Step("Click On Check MyOrder")
	public static void ClickOnCheckMyOrder() {
		click("id",checkMyOrderpo.CLICKCHECK_MYORDER);
	}
	
	@Step(" Click  OnMy  Order Cancel Button")
	public static void ClickOnMyOrderCancelButton() {
		click("id",checkMyOrderpo.CLICK0NMYORDER_CANCELBUTTON);
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
}

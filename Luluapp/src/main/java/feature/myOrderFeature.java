package feature;

import Step.myOrderCheckStep;
import io.qameta.allure.Step;


public class myOrderFeature extends myOrderCheckStep {
	
	@Step("My Oder Check")
	public void checkMyOrderis() {
		ClickOnHomeTextField();
		ClickOnCancleButton();
		ClickOnHomeMenuButton();
		ClickOnCheckMyOrder();
		ClickOnMyOrderCancelButton();
		ClickOnHomeButton();
		
		
	}
	

}

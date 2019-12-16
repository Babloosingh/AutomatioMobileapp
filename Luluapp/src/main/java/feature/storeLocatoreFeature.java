package feature;

import Step.storeLocatorStep;
import io.qameta.allure.Step;

public class storeLocatoreFeature extends storeLocatorStep{
	@Step ("Go to Store Locatore")
	public void GotStoreLocator() {
		ClickOnHomeTextField();
		ClickOnCancleButton();
		ClickOnHomeMenuButton();
		ClickOnStoreLocator();
		ClickOnSelectCountry();
		ClickOnSelectCountryKSA();
		ClickOnCity();
		ClickOnCityJEDDSH();
		ClickOnAddersh();
		ClicBackButton();
		ClicCancelButton();
		ClickOnHomeButton();
	}
	

}

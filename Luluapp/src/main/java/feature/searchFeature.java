package feature;

import Step.SearchoroductStep;
import io.qameta.allure.Step;

public class searchFeature extends SearchoroductStep {
	@Step ("Go to Add Cart")
	public void GotAddcatrt() {
		ClickOnHomeSearchTextfield();
		ClickOnintextField();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClicScrollandADDItem();
		ClickOnResult();
		
		

    }
}

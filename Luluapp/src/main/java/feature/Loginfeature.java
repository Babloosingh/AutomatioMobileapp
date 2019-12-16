package feature;

import Step.LoginStep;
import io.qameta.allure.Step;

public class Loginfeature extends LoginStep{
	@Step ("open login pages")
	public void GotoLoginPage(){
		ClickonMenuButton();
		ClickOnRegisterButton();
		EnterEmailID();
		ClickOnProceedButton();
		EnterPassword();
		ClickOnLoginButton();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		ClickOnUserPAsswordchage();
		ClickOnManagagePassword();
		EnterCuurentPassword();
		EntePassword();
		ConfirmNewPassword();
		UpdatePasword();
		ClickOnBackButton();
		ClickOnCancle();
	}
		

		
	}





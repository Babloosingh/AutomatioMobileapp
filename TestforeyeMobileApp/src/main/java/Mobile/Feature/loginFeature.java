package Mobile.Feature;

import Mobile.step.loginstep;
import io.qameta.allure.Step;

public class loginFeature extends loginstep {
@Step ("open login pages")
public void gotologinpage() {
	clickonLoginButton();
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickLongPresLogoIcon();
	clicklonConfirmReste();
	ClickONScannerButton();
	ClickOnStaging();
	EnterUserName();
	EnterPassword();
	ClickonLoginButton();
	
} 

//@Step ("LogPress butoon")
//public void LongPresButton() {
//	ClicklongpressButton();
//	
//}
}



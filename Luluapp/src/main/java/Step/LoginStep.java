package Step;

import AndroidSetup.AndroidSetup;
import io.qameta.allure.Step;
import po.LoginPo;

public class LoginStep  extends AndroidSetup {
	
	@Step("Menu Button")
	public static void ClickonMenuButton() {
		click("xpath",LoginPo.MENU_BUTTOM);
	}

	@Step("Register")
	public static void ClickOnRegisterButton() {
		click("xpath",LoginPo.LOGIN_REGISTER);
		
	}
	
	
	@Step("Email ID Enter")
	public static void EnterEmailID() {
		enterText("xpath",LoginPo.EMAILID_ENTER,"qapitoltestappium@gmail.com");
        driver.hideKeyboard();
	}
	
	@Step("Proceed Button")
	public static void ClickOnProceedButton (){
		click("xpath", LoginPo.PROCEED_BUTTON);
		
	}
	
	@Step("Password Enter")
	public static void EnterPassword () {
	enterText("xpath",LoginPo.PASSWORD_ENTER,"qapitol2019");	
		
	}
	
	@Step("Login Button Click")	
   public static void ClickOnLoginButton() {
		click("xpath",LoginPo.LOGIN_BUTTON );
	}
	
	
	// change password 
	
	@Step("USER PASSWORCHANGE")	
	   public static void ClickOnUserPAsswordchage() {
			click("xpath",LoginPo.USERCHANGEHOME_PASSWORDd );
			
		}
	@Step("Manage Paaswrd")	
	   public static void ClickOnManagagePassword() {
			click("id",LoginPo.MANAGE_PASSWORD );
			
		}
	
	@Step("Current Password")	
	   public static void EnterCuurentPassword() {
		enterText("xpath",LoginPo.CURRENT_PASSWORD,"qapitol2019");
			
		}
	
	@Step("Password")	
	   public static void EntePassword() {
		enterText("xpath",LoginPo.PASSWORD,"qapitol2019");
			
		}
	
	@Step("Confirm Password")	
	   public static void ConfirmNewPassword() {
		enterText("xpath",LoginPo.CONFIRM_NEW_PASSWORD,"qapitol2019");
		driver.hideKeyboard();
		
			
		}
	
	@Step("Confirm Password")	
	   public static void UpdatePasword() {
		click("xpath",LoginPo.UPDATE_SUBMITE_BUTTON );
			
		}
	
	@Step("USER Back")	
	   public static void ClickOnBackButton() {
			click("xpath",LoginPo.BACK_BUTTON );
			
		}
	
	@Step("USER PASSWORCHANGE")	
	   public static void ClickOnCancle() {
			click("xpath",LoginPo.CANCEL_BUTTON );
			
		}
	
	
		
	}


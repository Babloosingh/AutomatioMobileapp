package feature;
import Step.homeScrollPagesstep;
import io.qameta.allure.Step;

public class allCatogoryInHomePagesfeature extends homeScrollPagesstep{
	@Step ("open login pages")
	public void GotoAllCatogory(){
		ClickonhomeButton();
		clickoncancelButton();
		ClickOnElectronics();
		ClickOnHomeLiviong();
		ClickOnLuggageDropDownicon();
		ClickOnLaptop();
		ClickOnAddPrice();
		ClickOnHomeButton();

}
}
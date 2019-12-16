package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import feature.myOrderFeature;

public class myOrderTest  extends myOrderFeature{
	@Test(description="Go To My Order check is there or not")
	public void GoTOCheckMyOrder() {
		checkMyOrderis();
	}
	

}

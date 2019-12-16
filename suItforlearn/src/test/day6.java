package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day6 {
	@Test(groups="Smoke")
	public void demo5() {
		
		System.out.println("hi day51111111111111");
	}

	@BeforeTest
  public void demo6() {
	System.out.println("hi day66666666");
	}
	
	@Test(groups="Smoke")
	public void demo7() {
		
		System.out.println("I am no in grups");
	}

	@AfterTest
  public void demo8() {
	System.out.println("i am no in last");
	}
}

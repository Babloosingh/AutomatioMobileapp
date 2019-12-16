package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {
	
	
	@BeforeClass
	public void Beforeclass() {
		
		System.out.println("Beforeclass");
	}
	
	@AfterClass
	public void Afterlass() {
		
		System.out.println("Afterlass");
	}
	
	@Test(groups="Smoke")
	public void demo11() {
		
		System.out.println("hi day11");
	}
	@Test
	public void demo12() {
		
		System.out.println("hi day12");//anotation
		assert.assertTrue(false);
	}
	@Test
	public void demo3() {
		
		System.out.println("hi day13");
	}
	
	@AfterMethod
	public void ddddd() {
		
		System.out.println("repead after each test case 122");
	}
	

	@BeforeMethod
	public void beformethod() {
		
		System.out.println(" repead after each test case");
	}

}

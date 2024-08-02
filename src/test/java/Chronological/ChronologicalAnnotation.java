package Chronological;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalAnnotation {
	
		
	@BeforeClass
	public void  BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void testCase()
	{
		System.out.println("test cases");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
		
	}
	@AfterTest
	public void  afterTest()
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void ysoSuite()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeSuite
	public  void BeforeSuite()
	{
		System.out.println("beforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}


}

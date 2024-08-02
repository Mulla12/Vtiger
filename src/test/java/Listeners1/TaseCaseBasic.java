package Listeners1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClassDws;
@Listeners(com.crm.Listeners1.Basic.class)
public class TaseCaseBasic extends BaseClassDws {
	
	@Test
	public void main1()
	{
		String expected_result="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
		Reporter.log("main1",true);
	}
	
	@Test
	public void main2()
	{
		String Expected_result="https://demowebshop.tricentis.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result=driver.getCurrentUrl();
		assertEquals(Expected_result, actual_result);
		Reporter.log("main2",true);

		
	}
	
	

}

package Listeners1;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.BaseClassDws;
import BaseClass.DwsBaseClass;
import BaseClass.DwsBaseListeners;
@Listeners(com.crm.Listeners1.BasicListeners.class)

public class TestCaseDwsBaseListener extends DwsBaseListeners {
	@Test
	public void main() throws IOException{
		String Expected_result="https://demowebshop.tricentis.com/";
		String actual_result
		=driver.getCurrentUrl();
		assertEquals(Expected_result, actual_result);
	}
	
	@Test
	public void main2() throws IOException{
		String expected_result="https://demowebshop.tricentis.com";
		String actual_result=driver.getCurrentUrl();
		assertEquals(expected_result, actual_result);
	}

}

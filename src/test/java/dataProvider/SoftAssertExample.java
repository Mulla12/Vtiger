package dataProvider;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftAssertExample {
	public void main()
	{
	String Expected_result="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	String actual_result=driver.getCurrentUrl();
	assertNotEquals(Expected_result, actual_result);
	
	


}
}

package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClassForLogin {

	public static WebDriver driver;
	
	@BeforeClass
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.partialLinkText("Log out")).click();
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
}
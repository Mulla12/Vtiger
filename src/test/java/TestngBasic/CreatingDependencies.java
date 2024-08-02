package TestngBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreatingDependencies {
	
	@Test(priority = 1,timeOut = 1000)
	public void createAccount()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Reporter.log("Account is Created........",true);
	}
	@Test(priority = 0, dependsOnMethods = "createAccount")
	public void deleteAccount()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Reporter.log("account is deleted successfully.......", true);
		
	}

}

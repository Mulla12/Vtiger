package extendReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import BaseClass.DwsScreenShot;

@Listeners(com.crm.Listeners1.ScreenShotWithFailed.class)

public class TakeScreenShotForFailTest extends DwsScreenShot {
	
	public void loginFunction()
	{
		driver.findElement(By.className("")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	

}

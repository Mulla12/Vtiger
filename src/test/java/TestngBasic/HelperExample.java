package TestngBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperExample {
	
	@Test(priority = 0, invocationCount = 2, threadPoolSize = 2)
	public void zomato() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.quit();	
	}
	@Test(priority = 1,invocationCount = 2, threadPoolSize = 2)
	public void swiggy() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.quit();	
	}
	@Test(priority = 2, invocationCount = 3, threadPoolSize = 3)
	public void  freesh() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.freshmenu.com/");
		Thread.sleep(2000);
		driver.quit();	
	}

}

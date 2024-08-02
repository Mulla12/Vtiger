package TestngBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTestCases {
	@Test(priority = 0, invocationCount = 2, threadPoolSize = 2)
	
	public void bomato() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/");
Thread.sleep(2000)		;
driver.close();
	}
	
	
	@Test(priority = 0, invocationCount = 3, threadPoolSize = 3)
	public void bcb() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
Thread.sleep(2000)		;
driver.close();

	}
	@Test(priority = 0,invocationCount = 2, threadPoolSize = 2)
	
	public void csk() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
Thread.sleep(2000)		;
driver.close();

	}
				
	

}

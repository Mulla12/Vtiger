package Task1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Shoo5 {
	@Test(groups = "smoke")
	public void  FlipKart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/mens-footwear/pr?sid=osp%2Ccil");
		Thread.sleep(2000);
		driver.quit();

	}

}

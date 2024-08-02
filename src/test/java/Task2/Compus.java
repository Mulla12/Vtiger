package Task2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Compus {
	@Test(groups = "regression")
	
		public void royalEnfies() throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.royalenfield.com/in/en/home/");
	Thread.sleep(2000);
	driver.quit();
		}


}

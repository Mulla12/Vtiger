package Task1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class shoo2 {
	
@Test(groups = "smoke")
	public void amazon(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://www.amazon.in/Women-Shoes/b?node=1983578031");
		driver.quit();
		
	}
	

}

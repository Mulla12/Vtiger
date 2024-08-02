package pageObjectModel1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsLogin;

public class LoginFunction {
	@Test
	public void main() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DwsLogin ref=new DwsLogin(driver);
		ref.login_link();
		ref.username("admin01@gmail.com");
		ref.password("admino1");
		ref.login_button();
		
//		ref.login1_link.click();
//		ref.username.sendKeys("admin01@gmail.com");
//		Thread.sleep(2000);
//		ref.password.sendKeys("admin01");
//		Thread.sleep(2000);
//		
//		ref.login_button.click();
		
	}
	
	
	

}

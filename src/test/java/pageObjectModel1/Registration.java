package pageObjectModel1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.RegisterPage;

public class Registration {
	@Test
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	RegisterPage ref=new RegisterPage(driver);
	ref.registerButton();
	ref.registerButton();
	
	
			
			
			

}

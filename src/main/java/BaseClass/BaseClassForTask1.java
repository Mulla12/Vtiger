package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassForTask1{
	
public static WebDriver driver;
	
	public static void preCondition() {
	   
	    	driver = new ChromeDriver();
	   
		driver.manage().window().maximize();
	  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	  
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	public static void dwsLogin() {
		driver.findElement(By.partialLinkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("admin01");
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	
	public static void postCondition() {
		
		driver.findElement(By.partialLinkText("Log out")).click();
		
		driver.close();
	}

}
	
	
	
	
	
		



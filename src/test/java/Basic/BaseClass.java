package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    public static WebDriver driver;
	
	public static void preCondition(String browser) {
	    
	    if(browser.equalsIgnoreCase("chrome")) {
	    	driver = new ChromeDriver();
	    }else if(browser.equalsIgnoreCase("edge")) {
	    	driver = new EdgeDriver();
	    }else if(browser.equalsIgnoreCase("firefox"))
	    {
	    	driver = new FirefoxDriver();
	    }else {
	    	driver = new ChromeDriver();
	    }
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
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
		driver.quit();
	}
	
}
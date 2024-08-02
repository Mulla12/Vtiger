package extendReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoginFunctionCorrectCredentail {
	@Test
	public void  correctCredentail() throws InterruptedException{
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/loginFunction.html");
		spark.config().setDocumentTitle("sampleReport");
		spark.config().setReportName("sumaiyya");
		spark.config().setTheme(Theme.DARK);
		ExtentReports report=new ExtentReports();
		report.setSystemInfo("os", "window-10");
		report.setSystemInfo("Browser", "chrome-100");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("CorrectCredential");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement Community_poll=driver.findElement(By.xpath("//strong[text()='Community poll']"));
		if(Community_poll.isDisplayed())
		{
			test.log(Status.INFO, "Community_poll is displayed");
		}
		else
		{
			test.log(Status.INFO, "Community_poll is not displayed");;
		}
		report.flush();
	}

}

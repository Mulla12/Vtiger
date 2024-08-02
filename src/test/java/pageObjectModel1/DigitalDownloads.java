package pageObjectModel1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsDigitalDownload;

import pom.DwsDigitalDownload;

public class DigitalDownloads {
	@Test
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DwsDigitalDownload ref=new DwsDigitalDownload(driver);
		ref.Digital_download();
		ref.sortby();
		ref.orderBy();
		ref.view();
		ref.order1();
		ref.oder2();
		ref.order3();
	
		
	}
}

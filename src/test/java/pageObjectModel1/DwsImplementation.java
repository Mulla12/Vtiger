package pageObjectModel1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsHomePage;

import pom.DwsHomePage;

public class DwsImplementation {

	@Test
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		DwsHomePage ref=new DwsHomePage(driver);
		ref.register();
		ref.login();
		ref.shopping_cart();
		ref.witchlist();
		ref.search("laptop");
		ref.books();
		ref.computer_books();
		ref.electronic();
		ref.shoes();
		ref.digital_Downlaod();
		ref.jewelry();
		ref.Gift_card();
		ref.Excellent();
		ref.good();
		ref.poor();
		ref.very_bad();
		
		
	}
		
	}

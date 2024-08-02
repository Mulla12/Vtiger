package HomeWork;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.CartTask;
import pom.DigitalDownloadTask;
import pom.HomePageTask;
import utility.BaseClass;

public class Task5 extends BaseClass {
	@Test
	public void highestPrice() throws InterruptedException
	{
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
		
		HomePageTask hPage = new HomePageTask(driver);
		hPage.digitalDownloads();
		
		DigitalDownloadTask dd = new DigitalDownloadTask(driver);
		List<WebElement> pro = dd.products();
		for (WebElement w : pro) {
			w.click();
		}
		
		dd.cart();
		
		CartTask c = new CartTask(driver);
		
		List<WebElement> price = c.prices();
		
		List<Double> priceList = new ArrayList<Double>();
		
		for(WebElement w:price)
		{
			priceList.add(Double.parseDouble(w.getText()));
		}
		
		int index = priceList.indexOf(Collections.max(priceList));
		driver.findElement(By.xpath("(//td[@class='remove-from-cart']/input)["+(++index)+"]")).click();
		
		Thread.sleep(2000);
		
		c.updateCart();
	}
}



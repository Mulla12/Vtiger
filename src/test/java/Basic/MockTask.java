package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

	public class MockTask extends BaseClass{

		public static void main(String[] args) throws InterruptedException {
			BaseClass.preCondition("chrome");

			if ("https://demowebshop.tricentis.com/".equals(driver.getCurrentUrl())) {
				System.out.println("You are in Landing page of demo work shop");
			} else {
				System.out.println("You are not in Landing page of demo work shop");
			}

			BaseClass.dwsLogin();

			driver.findElement(By.partialLinkText("Digital downloads")).click();

			// Sort By
			WebElement sortby = driver.findElement(By.id("products-orderby"));

			Select s = new Select(sortby);
			List<WebElement> options = s.getOptions();

			for (int i = 0; i < options.size(); i++) {
				sortby = driver.findElement(By.id("products-orderby"));
				s = new Select(sortby);
				s.selectByIndex(i);
				Thread.sleep(1000);
			}

			// View
			WebElement view = driver.findElement(By.id("products-pagesize"));

			Select s1 = new Select(view);
			List<WebElement> optionsV = s1.getOptions();

			for (int j = 0; j < optionsV.size(); j++) {
				view = driver.findElement(By.id("products-pagesize"));
				s1 = new Select(view);
				s1.selectByIndex(j);
				Thread.sleep(1000);
			}

			// grid
			WebElement grid = driver.findElement(By.id("products-viewmode"));

			Select s3 = new Select(grid);
			List<WebElement> optionsV3 = s3.getOptions();

			for (int j = 0; j < optionsV3.size(); j++) {
				grid = driver.findElement(By.id("products-viewmode"));
				s3 = new Select(grid);
				s3.selectByIndex(j);
				Thread.sleep(1000);
			}
			BaseClass.postCondition();

		}
	
}	


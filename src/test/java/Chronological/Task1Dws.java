package Chronological;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClassForTask1;

public class Task1Dws extends BaseClassForTask1 {
	

		public static void main(String[] args) throws InterruptedException {
			
			preCondition();
			
			if("https://demowebshop.tricentis.com/".equals(driver.getCurrentUrl()))
			{
				System.out.println("you are in dws page ");
				
				dwsLogin();
				
				String url ="https://demowebshop.tricentis.com/news/rss/1";
				Actions act = new Actions(driver);
				act.keyDown(Keys.PAGE_DOWN).build().perform();
				act.keyDown(Keys.PAGE_DOWN).build().perform();
				
				
			  List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
				for (WebElement ele : links) {
					Thread.sleep(2000);
					ele.click();
					if (url.equalsIgnoreCase(driver.getCurrentUrl())) {
						driver.navigate().back();
					}		
				}
				
				String dwsID = null;
				
			Set<String> set = driver.getWindowHandles();
			for (String id : set) {
				
				driver.switchTo().window(id);
				if((driver.getCurrentUrl()).equals("https://demowebshop.tricentis.com/"))
				{
					dwsID = id;
				}
					
				if("https://www.facebook.com/nopCommerce".equalsIgnoreCase(driver.getCurrentUrl()))
				{
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Set<String> fb = driver.getWindowHandles();
				for (String s : fb) {
					driver.switchTo().window(s);
					if ("https://www.facebook.com/reg/?next=%2FnopCommerce".equals(driver.getCurrentUrl())) {
						driver.findElement(By.name("firstname")).sendKeys("sumaiya");
					    driver.findElement(By.name("lastname")).sendKeys("zoya");
					    driver.findElement(By.name("reg_email__")).sendKeys("9786756560");
					    driver.findElement(By.name("reg_passwd__")).sendKeys("sumaiya@1234");
					    Thread.sleep(2000);
					    
					    WebElement Dd = driver.findElement(By.name("birthday_day"));
						Select ref=new Select(Dd);
						
						ref.selectByVisibleText("9");
						
						
						WebElement month = driver.findElement(By.id("month"));
					     Select ref2=new Select(month);
					     ref2.selectByIndex(4);
					     
					     
					     WebElement year = driver.findElement(By.id("year"));
					     Select ref3=new Select(year);
					     ref3.selectByValue("2002");
					     
					     Thread.sleep(2000);
					     driver.findElement(By.xpath("//input[@value='2']")).click();
						
					}
				}
				
				}
				
				if ("https://x.com/nopCommerce".equalsIgnoreCase(driver.getCurrentUrl())) {
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
					driver.findElement(By.name("name")).sendKeys("sums");
					driver.findElement(By.name("phone_number")).sendKeys("876757648");
					
					WebElement month = driver.findElement(By.xpath("(//div[@aria-label=\"Date of birth\"])[2]/div[1]/select"));
					Select ref = new Select(month);
					ref.selectByValue("9");
					
					WebElement Day = driver.findElement(By.xpath("(//div[@aria-label=\"Date of birth\"])[2]/div[2]/select"));
					Select ref1 = new Select(Day);
					ref1.selectByValue("8");
					
					WebElement Year = driver.findElement(By.xpath("(//div[@aria-label=\"Date of birth\"])[2]/div[3]/select"));
					Select ref2 = new Select(Year);
					ref2.selectByValue("2002");
					}
			}
			
			    driver.switchTo().window(dwsID);
				postCondition();
				
			}else {
				System.out.println("You are not in dws");
			}
			
			
		}
	
	

}

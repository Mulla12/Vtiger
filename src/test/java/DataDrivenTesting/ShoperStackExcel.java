package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoperStackExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
			FileInputStream fis=new FileInputStream("C:\\Users\\sumai\\Downloads\\DwsLogin.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			
			Sheet sheet=wb.getSheet("Sheet1");
			
			String firstName=sheet.getRow(0).getCell(0).toString();
			
			String lastname=sheet.getRow(1).getCell(0).toString();
			
			String  female=sheet.getRow(2).getCell(0).toString();
			
			String phone_number=sheet.getRow(3).getCell(0).toString();
			
			String Email_address=sheet.getRow(4).getCell(0).toString();
			
			String passwors=sheet.getRow(5).getCell(0).toString();
			
			String confirm_password=sheet.getRow(6).getCell(0).toString();
	
			System.out.println(firstName);
			System.out.println(lastname);
			System.out.println(female);
			System.out.println(phone_number);
			System.out.println(Email_address);
			System.out.println(passwors);
			System.out.println(confirm_password);
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/");
		
		//WebElement text_field=driver.findElement(By.xpath(" "));
		
		if("https://www.shoppersstack.com/".equals(driver.getCurrentUrl()))
		{
			
		driver.findElement(By.id("loginBtn")).click();
		}

		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.findElement(By.id("First Name")).sendKeys(firstName);
		driver.findElement(By.id("Last Name")).sendKeys(lastname);
		driver.findElement(By.id("Female")).sendKeys(female);
		driver.findElement(By.id("Phone Number")).sendKeys(phone_number);
		driver.findElement(By.id("Confirm Password")).sendKeys(confirm_password);
		
		driver.findElement(By.id("Terms and Conditions")).click();
		
		driver.findElement(By.id("//button[@id='Register']")).click();
		driver.quit();		
		
	}

}

package dataProvider;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreData {
	@DataProvider(name="data")
	public Object[][] sender() throws EncryptedDocumentException , IOException
	{
//		 FileInputStream fis=new FileInputStream("");
		 
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sheet=wb.getSheet("Login");
		
		int row=sheet.getPhysicalNumberOfRows();
		
		int colom=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[] []obj=new Object[row] [colom];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<colom; j++)
			{
			obj[i][j]=sheet.getRow(i).getCell(j).toString();
		}
		}
		return obj;
	}
}
		
		
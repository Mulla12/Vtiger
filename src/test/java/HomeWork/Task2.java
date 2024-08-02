package HomeWork;

import static org.testng.Assert.assertEquals;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.DwsLoginTask;
import utility.BaseClassForLogin;


public class Task2 extends BaseClassForLogin{

		@DataProvider(name = "Credential")
		public Object[][] sender() throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\sumai\\Downloads\\DWSLoginTask.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh =wb.getSheet("DwsTask");
			int row = sh.getPhysicalNumberOfRows();
			int col = sh.getRow(0).getPhysicalNumberOfCells();
			
			Object[][] obj = new Object[row][col];
			
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
				{
					obj[i][j] = sh.getRow(i).getCell(j).toString();
				}
			}
			
			return obj;
		}
		
		@Test(dataProvider = "Credential")
		public void login(String email,String password)
		{
			assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
			DwsLoginTask login = new DwsLoginTask(driver);
			login.login_link();
			login.username(email);
			login.password(password);
			login.loginBtn();
		}
	}



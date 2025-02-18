package HomeWork;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Basic.BaseClass;
import pom.FaceBookTask;
import pom.HomePageTask;
import pom.Twitter;

@Listeners(com.crm.Listeners1.BasicListenerTask.class)

public class Task3 extends BaseClass{

	ExcelUtility eUtil = new ExcelUtility();
	@Test
	public void signUpSocialMedia() throws EncryptedDocumentException, IOException
	{
		assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
		HomePageTask hPage = new HomePageTask(driver);
		List<WebElement> links= hPage.socialLink();
		for(WebElement w:links)
		{
			if(w.getText().equalsIgnoreCase("Facebook")) {
				w.click();
			}else if (w.getText().equalsIgnoreCase("twitter")) {
				w.click();
			}
		}
		
		int row1 = 0, row2 = 0;
		
		 Set<String> ids = driver.getWindowHandles();
		 for (String s : ids) {
			driver.switchTo().window(s);
			
			if("https://www.facebook.com/nopCommerce".equalsIgnoreCase(driver.getCurrentUrl()))
			{
				FaceBookTask f = new FaceBookTask(driver);
				
				f.createAccount();
				
				Set<String> id = driver.getWindowHandles();
				for (String i : id) {
					
					driver.switchTo().window(i);
					
					if("https://www.facebook.com/reg/?next=%2FnopCommerce".equalsIgnoreCase(driver.getCurrentUrl())) {
						f.firstName(eUtil.getData("DWS_3", row1++, 0));
						f.lastName(eUtil.getData("DWS_3", row1++, 0));
						f.email(eUtil.getData("DWS_3", row1++, 0));
						f.password(eUtil.getData("DWS_3", row1++, 0));
						f.day(String.valueOf((int)Double.parseDouble(eUtil.getData("DWS_3", row1++, 0))));
						f.month(eUtil.getData("DWS_3", row1++, 0));
						f.year(String.valueOf((int)Double.parseDouble(eUtil.getData("DWS_3", row1++, 0))));
						f.gender();
					}
				}
				
			}else if ("https://x.com/nopCommerce".equalsIgnoreCase(driver.getCurrentUrl())) {
				
				Twitter t = new Twitter(driver);
				
				t.createAccount();
				t.name(eUtil.getData("DWS_3", row2++, 1));
				t.phoneNumber(eUtil.getData("DWS_3", row2++, 1));
				t.month(eUtil.getData("DWS_3", row2++, 1));
				t.day(String.valueOf((int)Double.parseDouble(eUtil.getData("DWS_3", row2++, 1))));
				t.year(String.valueOf((int)Double.parseDouble(eUtil.getData("DWS_3", row2++, 1))));
			} 
		}
		 
	}
}



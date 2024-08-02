package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsDigitalDownload {
	public  DwsDigitalDownload(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath="//a[contains(text(),'Digital downloads')])[1]")
	WebElement Digital_download;
	
	private @FindBy(id="products-orderby")
	WebElement orderBy;
	
	private @FindBy(id="products-pagesize")
	WebElement sortby;
	
	private @FindBy(id="products-viewmode")
	WebElement view;
	
	private @FindBy(xpath="(//input[@type='button'])[2]")
	WebElement order1;
	
	private @FindBy(xpath="(//input[@type='button'])[3]")
	WebElement oder2;
	
	private @FindBy(xpath="(//input[@type='button'])[4]")
	WebElement order3;
	
	public void Digital_download()
	{
		Digital_download.click();
	}
	public void orderBy()
	{
		orderBy.click();
	}
	public void sortby()
	{
		sortby.click();
	}
	public void view()
	{
		view.click();
	
	}
	public void order1()
	{
		order1.click();
	}
	public void oder2()
	{
		oder2.click();
		
	}
	public void order3()
	{
		order3.click();
	}
	


}

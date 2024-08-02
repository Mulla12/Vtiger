package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePage {
	public  DwsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(className="ico-register")
	WebElement register;
	
	private @FindBy(className="ico-login")
	WebElement login;
	
	private @FindBy(xpath="(//span[@class='cart-label'])[1]")
	WebElement shopping_cart;
	
	private @FindBy(xpath="(//span[@class='cart-label'])[2]")
	WebElement witchlist;
	
	private @FindBy(id="small-searchterms")
	WebElement search;
	
	private @FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	WebElement books;
	
	private @FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	WebElement computer_books;
	
	
	private @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	WebElement electronic;
	
	private @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	WebElement shoes;
	
	private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	WebElement digital_Downlaod;
	
	private @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	WebElement jewelry;
	
	private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement Gift_card;
	
	private @FindBy(id="pollanswers-1")
	WebElement Excellent;
	
	private @FindBy(id="pollanswers-2")
	WebElement good;
	
	private @FindBy(id="pollanswers-3")
	WebElement poor;
	
	private @FindBy(id="pollanswers-4")
	WebElement very_bad;
	
	public void register()
	{
		register.click();
		
	}
	public void login()
	{
	login.click();
	}
	public void shopping_cart()
	{
		shopping_cart.click();
	}
	public void witchlist()
	{
		witchlist.click();
	}
	public void search(String str)
	{
		search.sendKeys(str);
	}
	public void books()
	{
		books.click();
	}
	public void computer_books()
	{
		computer_books.click();
	}
	public void electronic()
	{
		electronic.click();
	}
	public void shoes()
	{
		shoes.click();
	}
	public void digital_Downlaod()
	{
		digital_Downlaod.click();
	}
	public void jewelry()
	{
		jewelry.click();
	}
	public void Gift_card()
	{
		Gift_card.click();
	}
	public void Excellent()
	{
		Excellent.click();
	}
	public void good()
	{
		good.click();
	}
	public void poor()
	{
		poor.click();
	}
	public void very_bad()
	{
		very_bad.click();
	}
	
	
}

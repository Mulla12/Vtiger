package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GiftCard {
	
	public GiftCard(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath ="//a[contains(text(),'Gift Cards')]")
	WebElement gift_link;
	
	private @FindBy(id="products-orderby")
	WebElement sort_by;
	
	private @FindBy(id="products-pagesize")
	WebElement display;
	
	private @FindBy(id="products-viewmode")
	WebElement view;
	
	private @FindBy(xpath ="//input[@value='Add to cart']")
	List<WebElement> add_to_cart_btn; 
	 public WebElement getGift_link()
	 {
		 gift_link.click();
		return gift_link;
	 }
	 
	 public WebElement getSort_by()
	 {
		Select ref =new Select(sort_by);
		ref.selectByVisibleText("Price: High to Low");
		return sort_by;
	 }
	 
	 public WebElement getDisplay()
	 {
		 Select ref =new Select(display);
		ref.selectByIndex(2);
		return display;
	 }
	 
	 public WebElement getView()
	 {
		 Select ref=new Select(view) ;
		 ref.selectByIndex(1);
		return view;
	 }
	 public List<WebElement> getAdd_to_cart_btn()
	 {
		 return add_to_cart_btn;
	 }
}



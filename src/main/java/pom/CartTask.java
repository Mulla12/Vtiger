package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartTask{


		public CartTask(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		private @FindBy(xpath = "//td[@class='subtotal nobr end']/span[2]")
		List<WebElement> p;
		
		public List<WebElement> prices()
		{
			return p;
		}
		
		private @FindBy(name = "updatecart")
		WebElement uCart;
		
		public void updateCart()
		{
			uCart.click();
		}
	}



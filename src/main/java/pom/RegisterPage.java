package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(className="ico-register")
	WebElement register;
	
	private @FindBy(id="gender-female")
	WebElement gender_female;
	
	private @FindBy(id="FirstName")
	WebElement firstname;
	
	private @FindBy(id="LastName")
	WebElement lastname;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	
	public @FindBy(id="register-button")
	WebElement registerButton;
	
	public void  register()
	{
		register.click();
		
	}
	public void gender()
	{
		gender_female.click();
		
	}
	public void firstname(String user)
	{
		firstname.sendKeys(user);
	}
	public void lastname(String user)
	{
	lastname.sendKeys(user);
	}
	public void email(String user)
	{
		email.sendKeys(user);
	}
	public void password(String user)
	{
	password.sendKeys(user);
	}
	public  void confirmpassword(String user)
	{
		confirmpassword.sendKeys(user);
	}
	public void registerButton()
	{
		registerButton.click();
	}
	


}

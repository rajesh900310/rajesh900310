package fbPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement Password;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement Loginbutton;
	
	public  LoginPage(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage enterLoginPage(String username,String password){
		
		Username.sendKeys(username);
		Password.sendKeys(password);
		Loginbutton.click();
		
		return new HomePage(driver);
		
		
	
	}

}




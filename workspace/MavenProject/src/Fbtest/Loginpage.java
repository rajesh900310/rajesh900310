package Fbtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BasePage {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='pass']")
	WebElement Password;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement Loginbutton;
	
	public Loginpage(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterLoginPage(String username,String password){
		
		Username.sendKeys(username);
		Password.sendKeys(password);
		Loginbutton.click();
		
		
		
		
	
	}

}

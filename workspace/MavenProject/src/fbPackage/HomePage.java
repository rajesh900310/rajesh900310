package fbPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchbutton;
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	
	public void searchTestInHomepage(String mn){
		
		Searchbutton.sendKeys(mn);
		
	}
	

}

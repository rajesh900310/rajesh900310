package fbPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest  {
	
	public BasePage basepage;
	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	
	@BeforeClass 
	
	public void setup(){
		
		basepage = new BasePage();
		driver =basepage.openDriver();
		loginpage= new LoginPage(driver);
		
		
		
		
		
	}
	
	@Test
	
	public void enterLoginPageTest(){
		
	loginpage.enterLoginPage("9003102031", "900310");
	}

}

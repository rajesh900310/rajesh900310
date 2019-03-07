package Fbtest;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	public Loginpage loginpage;
	public BasePage basepage;
	public WebDriver driver;
	public Properties prop;
	public HomePage homepage;

	@BeforeClass
	
	
	public void setUp(){
		
		basepage = new BasePage();
		
		 basepage.OpenDriver();
		loginpage = new Loginpage(driver);
		//prop =basepage.init_properties();
		System.out.println("ramu");
		
		
	}
	
	
	@Test
	
	public void enterLoginPageTest(){
		
		loginpage.enterLoginPage("ramu", "karthik");
		
	}
	
}


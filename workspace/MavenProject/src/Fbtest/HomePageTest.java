package Fbtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest {
	
	public BasePage basepage;
	public Loginpage loginpage;
	public WebDriver driver;
	public HomePage homepage;
	
	
	public void setUp(){
		
		basepage = new BasePage();
		
		loginpage = new Loginpage();
		
		loginpage.enterLoginPage("9003102031", "900310");
	
	}
	
	@Test
	
	public void getHomePageTittleTest(){
		
		homepage.getHomePageTittle();
	}

}

package fbPackage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class HomePageTes {
	
	public HomePage homepage;
	 public BasePage basepage;
	 public LoginPage loginpage;
	 public WebDriver driver;
	
	
	@BeforeClass
	
	public void setUp(){
		
		basepage = new BasePage();
		driver =basepage.openDriver();
		loginpage= new LoginPage(driver);
		loginpage.enterLoginPage("9003102031","900310");
		homepage = new HomePage(driver);
		System.out.println("done");
		 
	
	}

	@Test
	
	public void searchTest(){
		
		homepage.searchTestInHomepage("rajesh");
	}
}

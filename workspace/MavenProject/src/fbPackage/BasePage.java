package fbPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
	WebDriver driver;
	
	
	public WebDriver openDriver(){
		
		ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", "D:\\chrom Driver\\chromedriver.exe");
				 driver = new ChromeDriver(ops);
				
				driver.get("https://www.facebook.com/");
				
				return driver;
		
		
	}

}

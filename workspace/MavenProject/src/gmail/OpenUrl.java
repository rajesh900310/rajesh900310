package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenUrl {

	
		
		@Test
		
		public void Test(){
			
		
		//ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chrom Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9003102031");
		
		 
		  driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("900310");
		  driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		  		
		}  	
}

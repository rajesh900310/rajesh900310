package Fbtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
	
	WebDriver driver; 
	
	Properties prop;
	
	public WebDriver OpenDriver(){
		//ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\chrom Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		return driver;
		
	}
	
	public Properties init_properties() throws IOException{
		
		prop = new Properties();
		
		FileInputStream ip = new FileInputStream("");
		prop.load(ip);
		
		return prop;
	}

}

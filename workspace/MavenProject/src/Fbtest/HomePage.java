package Fbtest;


import org.testng.annotations.Test;

public class HomePage extends BasePage {
	
	
	
	@Test
	
	public void getHomePageTittle(){
		
		String s = driver.getTitle();
		
		System.out.println(s);
		
	}
		
	}
	



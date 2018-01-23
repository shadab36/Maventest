package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {		
	    public WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://sivvi.com/");  
		    String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("SIVVI.COM")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "F:\\Driver of All\\chromedriver.exe");
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
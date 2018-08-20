package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {		
	    public WebDriver driver;	
	    public static final String USERNAME = "AyushDam";
		public static final String ACCESS_KEY = "f5cae068-fd7e-46b2-92c5-3b639ef8a721";
		public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		@Test				
		public void testEasy() {	
			driver.get("http://sivvi.com/");  
		    String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("SIVVI.COM")); 		
		}	
	@BeforeTest
		public void beforeTest()   {	
			//System.setProperty("webdriver.chrome.driver", "F:\\Driver of All\\chromedriver.exe");
		  //  driver = new ChromeDriver();  
		
		
		try {
			DesiredCapabilities caps =DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "64");
			caps.setCapability("name", "My Desktop automation test");
			// here is the sauce driver 
			 driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		}catch(Exception e) {
			
		}
//			//
		}		
		@AfterTest
		public void afterTest() {
			driver.close();			
		}		
}	






// public class NewTest {		
// 	    public WebDriver driver;		
// 		@Test				
// 		public void testEasy() {	
// 			driver.get("http://sivvi.com/");  
// 		    String title = driver.getTitle();				 
// 			Assert.assertTrue(title.contains("SIVVI.COM")); 		
// 		}	
// 		@BeforeTest
// 		public void beforeTest() {	
// 			System.setProperty("webdriver.chrome.driver", "F:\\Driver of All\\chromedriver.exe");
// 		    driver = new ChromeDriver();  
// 		}		
// 		@AfterTest
// 		public void afterTest() {
// 			driver.quit();			
// 		}		
//}	

package example;



import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {		
	    public WebDriver driver;
	   
		public static String browserName;
		public static String platformVersion;
		public static String platform;
		public static String platformName;
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
		public void beforeTest() throws MalformedURLException   {	
//			System.setProperty("webdriver.chrome.driver", "F:\\Driver of All\\chromedriver.exe");
//		   driver = new ChromeDriver();  
//		
		

	DesiredCapabilities capability = new DesiredCapabilities();
	capability.setCapability("platform", platform);
	capability.setBrowserName(browserName);
	capability.setCapability("version", platformVersion);
	capability.setCapability("name", "AutoBill automation tests");
	
			 driver = new RemoteWebDriver(new java.net.URL(URL), capability);
	}		
		@AfterTest
		public void afterTest() {
			driver.close();			
		}		
}	












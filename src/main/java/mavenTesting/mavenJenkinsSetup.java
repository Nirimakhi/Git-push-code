package mavenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mavenJenkinsSetup {
  @Test
  public void GitSetup()throws Exception {
	 
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Devops Selenium\\FireFoxDriver\\geckodriver.exe");
		  //DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		  //capabilities.setCapability("marionette", true);
		  WebDriver driver = new FirefoxDriver();
		  
		 
		 
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			 driver.get("http://www.facebook.com");
			 
	    String title = driver.getTitle();	
	 
	    System.out.println(title);
	 Assert.assertEquals(title, "Facebook – log in or sign up");
	 
	 System.out.println("update the project and commite the code");
  }
}

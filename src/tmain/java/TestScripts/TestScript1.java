package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestScript1 {
  
	WebDriver driver =null;
  @BeforeSuite
  public void beforeSuite() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\CSS\\eclipse-workspace\\CodeChallenge\\TravelBooking\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://www.cheapair.com/");
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.quit();
  }

}

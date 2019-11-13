package TestScripts;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import Pages.FlightDetails;
import Pages.HomePage;
import TestScripts.Testscript_1;

public class Testscript_2 extends Testscript_1{
  @Test
  public void intialize() throws InterruptedException {
	  
	  HomePage page=new HomePage(driver);
	  page.setDepartfromLocation("Chennai");
	  page.setToLocation("Bangalore");
	  page.setDate("11/21/2019","12/10/2019");
	  page.setpassengers(2);
	  page.searchbutton();
	  
	  
ArrayList<String> l=(ArrayList<String>) driver.getWindowHandles();
driver.switchTo().window(l.get(1));

FlightDetails flight=new FlightDetails(driver);
flight.selectFlight();

	  
  }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetails {

	WebDriver driver=null;

	public FlightDetails(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	By Selectflight=By.xpath("((//span[text()='Economy'])[1]/following::span[@class='fltrt-opt-fares-amount'])[1]");
	
	
	
	public void selectFlight() {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectflight));
		driver.findElement(Selectflight).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Selectflight));
		driver.findElement(Selectflight).click();		
	}
}

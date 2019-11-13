package Pages;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	
	WebDriver driver=null;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By from=By.id("from1");
	By to=By.id("to1");
	By DepartDate=By.xpath("//span[text()='Depart']");
	By Adult=By.xpath("(//label[text()='Adult']/following::button)[2]");
	By Adults=By.xpath("(//label[text()='Adults']/following::button)[2]");
	By searchbtn=By.xpath("//button[text()='Search Flights']");
	
	By triptype=By.xpath("(//label[@class='trip-type'])[2]/span[1]");
	
	
	

	public void setToLocation(String Toloc) {
		driver.findElement(to).clear();
		driver.findElement(to).sendKeys(Toloc);
	}

	public void setDepartfromLocation(String fromloc) {
		// TODO Auto-generated method stub
		driver.findElement(from).clear();
		driver.findElement(from).sendKeys(fromloc);

	}
	
	public void setDate(String Date,String TODate) {
		driver.findElement(DepartDate).click();
		String[] s=Date.split("/");
		int m=Integer.parseInt(s[0]);
		m=m-1;
		int d=Integer.parseInt(s[1]);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-month='"+m+"']/a[text()='"+d+"']")));
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-month='"+m+"']/a[text()='"+d+"']")).click();		
		
		String[] s1=TODate.split("/");
		int m1=Integer.parseInt(s1[0]);
		m1=m1-1;
		int d1=Integer.parseInt(s1[1]);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-month='"+m1+"']/a[text()='"+d1+"']")));
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-month='"+m1+"']/a[text()='"+d1+"']")).click();		
		
	}
	
	
	public void setpassengers(int n) {
		if(n>1) {
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Adult));
			driver.findElement(Adult).click();
			for(int i=2;i<n;i++) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(Adults));
				driver.findElement(Adults).click();
					
			}
		}
	}
	
	public void searchbutton() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(searchbtn).click();
	}
}

package basics;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
//		waiting page to select oneway
		wait.until(ExpectedConditions.elementToBeSelected(By.id("ctl00_mainContent_rbtnl_Trip_0")));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Selecting destination city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("AMD");		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("JSA");
		//selecting first date
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")).click();
		
		//waiting for the second date field to be visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_view_date2")));
		//click on the calendar field
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		
//		clicking return month next button 2 times use forloop.
		for(int i=0; i<2;i++) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			 
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
		
		//*[@id="ctl00_mainContent_view_date1"]
		
		
	

		
		
	}

}

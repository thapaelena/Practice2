package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		wait.until(ExpectedConditions.elementToBeSelected(By.id("ctl00_mainContent_rbtnl_Trip_0")));
//		Mouse over
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"))).perform();
		
//		hardcoded wait
		Thread.sleep(5000);
		
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"Covid19info\"]/span[2]"))).perform();
		
		
		
	}

}

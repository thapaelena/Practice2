package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[2]/a/span"))).perform();
		
		Thread.sleep(5000);
		
		act.click(driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[2]/div/div/div/div/ul/li[2]/ul/li[2]/a"))).perform();
		
		
		
	}

}

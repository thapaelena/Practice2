package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();
//		Thread.sleep(5000);
		Actions act= new Actions (driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();
		act.click(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div"))).perform();
// if xpath is long, element can be locate by :find element by class name- driver.findelement(By.claa("fa-sign-in")).click();
		driver.switchTo().frame(driver.findElement(By.name("pat")));					
//		driver.switchTo().parentFrame();
//		Set<String> winids = driver.getWindowHandles();
//		driver.switchTo().window((String) winids.toArray()[0]);
		driver.findElement(By.name("form_fname")).sendKeys("John");
		driver.findElement(By.name("form_lname")).sendKeys("Benette");
		driver.findElement(By.id("form_DOB")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/table/tbody/tr[2]/td[5]/div")).click();
		driver.findElement(By.name("form_sex")).sendKeys("Male");
		driver.findElement(By.name("create")).click();
		driver.switchTo().defaultContent();
//		entering another frame
		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		driver.findElement(By.xpath("/html/body/center/input")).click();
		driver.switchTo().defaultContent();
		
//		alert
		
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.switchTo().frame(driver.findElement(By.id("modalframe")));
		System.out.println(driver.findElement(By.xpath("/html/body/div/p")).getText());
		driver.switchTo().defaultContent();
//		closing happy birth message
		driver.findElement(By.className("closeDlgIframe")).click();
//		/mouseover to Billy Smith
		act.moveToElement(driver.findElement(By.id("username"))).perform();
		Thread.sleep(5000);
//		logout--- driver.findElement(By.xpath("//*[@id=\"username\"]/div/ul/li[4]"))).click(); OR
		act.click(driver.findElement(By.xpath("//*[@id=\"username\"]/div/ul/li[4]"))).perform();
		
		driver.quit();
		
		
		
		


				

	}

}

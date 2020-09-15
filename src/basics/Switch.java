package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	private static Object String;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
		String parent= driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul/li[2]/a")).click();
		Set<String> winids = driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[1]);
		driver.findElement(By.id("identifierId")).sendKeys("thapaelina1"+Keys.ENTER);
		driver.close();
		//		driver.switchto()window(String) winids.toArray()[0]);
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("For Work")).click();
		winids=driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[1]);
		driver.findElement(By.linkText("Admin console")).click();
		driver.close();
		winids=driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[1]);
		driver.findElement(By.id("identifierId")).sendKeys("thapaelina1"+Keys.ENTER);

	
	
	}

	

}

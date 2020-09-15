package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magentologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
//		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("thapa.elina@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("Monkey234");
		driver.findElement(By.id("send2")).click();
		String msg=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
		System.out.println(msg);
		if(msg.equals("Invalid login or password."))
		{
			System.out.println("Test Pass");
		}
			driver.quit();

	}

}


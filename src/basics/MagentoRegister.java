package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MagentoRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"register\"]/span")).click();
		driver.findElement(By.id("firstname")).sendKeys("Elina");
		driver.findElement(By.id("lastname")).sendKeys("Thapa");
		driver.findElement(By.name("email")).sendKeys("thapa.elina@hotmail.com");
		Select cp=new Select(driver.findElement(By.id("company_type")));
		cp.selectByIndex(3);
//		cp.selectByValue("deployment");
//		cp.selectByVisibleText("Provides deployment, customization and integration services to merchants");
		Select role=new Select(driver.findElement(By.id("individual_role")));
		role.selectByIndex(2);
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("password")).sendKeys("Monkeythapa234!");
		driver.findElement(By.name("password_confirmation")).sendKeys("Monkeythapa234!");
		
//		if(!driver.findElement(arg0))
		driver.findElement(By.id("agree_terms")).click();
	

		
	}

}

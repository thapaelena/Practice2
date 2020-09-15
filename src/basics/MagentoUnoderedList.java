package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoUnoderedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait (driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		WebElement Unorderedlist = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation\"]/ul/li[1]/ul"));
		System.out.println(Unorderedlist.getText());
		List<WebElement> listitems = Unorderedlist.findElements(By.tagName("li"));
		for(int y=0; y< listitems.size(); y++) {
			System.out.println("List Item " + (y+1) +" " + listitems.get(y).getText() );
		}
		
		
	
		
		
		driver.quit();
		
		
	}

}

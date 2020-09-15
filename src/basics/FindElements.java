package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");	
//		to print table body
		WebElement tablebody = driver.findElement(By.id("example")).findElement(By.tagName("tbody"));
//		System.out.println(tablebody.getText());

		List<WebElement> rows=  tablebody.findElements(By.tagName("tr"));
		for(int i=0;i< rows.size(); i++) {
//		rows.get(i) gives specific row
		rows.get(i).findElements(By.tagName("td")).get(0).click();
		System.out.println("Name in the Row "+(i+1)+":" +rows.get(i).findElements(By.tagName("td")).get(1).getText());
		
		}
		
		System.out.println("4th row's Position"+driver.findElement(By.id("example")).findElement(By.tagName("tbody")).findElements(By.tagName("tr")).get(3).findElements(By.tagName("td")).get(2).getText());
//		To find by xpath----System.out.println("4th row's Position"+driver.findElement(By.xpath("//*[@id="example"]/tbody/tr[4]/td[3]"));
		
		System.out.println("Cara Steven's Salary is " + driver.findElement(By.id("example")).findElement(By.tagName("tbody")).findElements(By.tagName("tr")).get(8).findElements(By.tagName("td")).get(5).getText());
		
		WebElement UnorderedList = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li[4]/ul/li[13]/ul"));
	
				System.out.println(UnorderedList.getText());
				
		List<WebElement> listitems= UnorderedList.findElements(By.tagName("li"));
		for(int i=0;i< listitems.size(); i++) {
			System.out.println("List item "+ (i+1) + " " + listitems.get(i).getText());
			 
		}
		
//		driver.quit();

	}

}

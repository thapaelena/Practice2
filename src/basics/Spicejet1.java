package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet1 {

public static void main(String[] args) {
// TODO Auto-generated method stub

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://spiceJet.com");

//behavior of the website driven, waiting for first trip to be selected
WebDriverWait wait = new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.elementToBeSelected(By.id("ctl00_mainContent_rbtnl_Trip_0")));


driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("BKK");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("DXB");
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[1]/td[6]/a")).click();

//waiting for the next date field to be visible
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_view_date2")));
//click on the calendar button
driver.findElement(By.id("ctl00_mainContent_view_date2")).click();

//for clicking on the return month two time
for(int i=0;i<2;i++) {
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
}

//clicking on the date
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[4]/a")).click();



}

}
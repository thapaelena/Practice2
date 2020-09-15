package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //deal with window size and position management
//		WebDriver driver = new ChromeDriver(); to support any browser
		driver.get("http://google.com"); //load w webpage
		System.out.println(driver.getCurrentUrl()); //capture the current available url 
		System.out.println(driver.getTitle()); //capture current title of the webpage
		System.out.println(driver.getWindowHandles()); //capture window id of current active window/tab
		driver.navigate().back(); 
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
//		driver.close(); will only at front but doesn't close at the back end from task manager

//		driver.manage() manage size, cookies of browser
//		System.out.println(driver.getLocalStorage());
//		System.out.println(driver.location());
		
		
	}

}

package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jason\\Qa2021_Selenium\\1stSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //object variable(driver)
		
		// maximize
		driver.manage().window().maximize();
		// get web site
		driver.get("https://www.google.com/");
		// identify web element and perform action
		driver.findElement(By.name("q")).sendKeys("Selenium");
		// driver.findElement(By.name("btnK")).click();
		// wait
		Thread.sleep(3000);
		// driver will close
		driver.close();
		
	}

}

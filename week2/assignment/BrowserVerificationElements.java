package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserVerificationElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		WebElement elepassword = driver.findElement(By.name("PASSWORD"));
		Thread.sleep(2000);
		elepassword.sendKeys("crmsfa");
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("The title is : " + title);

		String url = driver.getCurrentUrl();
		System.out.println("The Current URL is : " + url);

		String pageSource = driver.getPageSource();
		System.out.println("The Page Source is : " + pageSource);
		
		String attribute = driver.findElement(By.name("USERNAME")).getAttribute("value");
		System.out.println("The value is : " + attribute);
		
	}

}

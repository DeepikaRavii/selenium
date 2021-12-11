package week4.classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// handle notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
	    // Navigate to second window
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		// Print List of Windows Title
		System.out.println(driver.getTitle());
        driver.switchTo().window(winList.get(1));
        System.out.println(driver.getTitle());
        //print cust email id
		String email = driver.findElement(By.xpath("//a[text()=' flights@irctc.co.in']")).getText();
		// navigate to window 1
		System.out.println("Customer Care Email ID : "+email);
		// close window 1
		driver.switchTo().window(winList.get(0));
		driver.close();
			
	}

}

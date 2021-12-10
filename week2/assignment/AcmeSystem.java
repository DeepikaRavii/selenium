package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeSystem {

	public static void main(String[] args) {
		// Setup Driver
		WebDriverManager.chromedriver().setup();
		
		// Open Browser
		ChromeDriver driver = new ChromeDriver();
		
		// To Maximize window
		driver.manage().window().maximize();
		
		// To Load an Application
		driver.get("https://acme-test.uipath.com/login");
		
		//Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//Enter Password as "leaf@12"
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("leaf@12");
		
		//Click login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//Get the title of the page and print
		String title = driver.getTitle();
		System.out.println("The title is : "+title);
		
		//Click on Log Out
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		// To Close the Application
		driver.close();
		
		
	}

}

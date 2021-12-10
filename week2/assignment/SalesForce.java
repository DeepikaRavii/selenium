package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		//Set up Driver
		WebDriverManager.chromedriver().setup();
		
		// Open Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the Window
		driver.manage().window().maximize();
		
		//Load Application
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Anu");
		driver.findElement(By.name("UserLastName")).sendKeys("k");
		driver.findElement(By.name("UserEmail")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9832574122");
		
		// Drop Down
		
		WebElement eleTitle = driver.findElement(By.name("UserTitle"));
		Select dropDown = new Select(eleTitle);
		dropDown.selectByValue("IT_Manager_AP");
		
		WebElement eleEmpNo = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown1 = new Select(eleEmpNo);
		dropDown1.selectByValue("75");
		
		WebElement eleCountry = driver.findElement(By.name("CompanyCountry"));
		Select dropDown2 = new Select(eleCountry);
		dropDown2.selectByValue("IL");
		
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
	
	}

}

package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Deepika");
		driver.findElement(By.id("lastNameField")).sendKeys("Ravi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Deepika");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ravi");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Welcome to TestLeaf");
		driver.findElement(By.name("primaryEmail")).sendKeys("deepika@gmail.com");
		
		WebElement eleState = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropDown = new Select(eleState);
		dropDown.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Welcome to TestLeaf");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("The Title is : "+title);
		driver.manage().window().minimize();

	}

}

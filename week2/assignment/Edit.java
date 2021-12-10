package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("deepikarengasamy@gmail.com");
		System.out.println(driver.findElement(By.name("username")).getText());	
		
	}

}

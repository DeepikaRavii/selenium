package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Deepika");
		driver.findElement(By.name("lastname")).sendKeys("Ravi");
		driver.findElement(By.name("reg_email__")).sendKeys("9502162235");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc");
		
		WebElement eleDate = driver.findElement(By.name("birthday_day"));
		Select dropDown = new Select(eleDate);
		dropDown.selectByValue("21");
		WebElement eleMonth = driver.findElement(By.name("birthday_month"));
		Select dropDown1 = new Select(eleMonth);
		dropDown1.selectByValue("5");
		WebElement eleYear = driver.findElement(By.name("birthday_year"));
		Select dropDown2 = new Select(eleYear);
		dropDown2.selectByValue("1990");
		//driver.findElement(By.name("sex")).click();
		
		boolean selRadioButton = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		if(!selRadioButton) {
			driver.findElement(By.xpath("//label[text()='Female']")).click();
		}
		
		// To select Male
		//driver.findElement(By.xpath("//input[@name='sex']/following::input")).click();
	
	}

}

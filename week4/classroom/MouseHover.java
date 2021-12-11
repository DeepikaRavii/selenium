package week4.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    // In some sites direct locator do not work, in this cases we need to use xpath
		//WebElement eleHover = driver.findElement(By.linkText("Men"));
		
		WebElement Hoverele = driver.findElement(By.xpath("//a[text()='Men']"));
		// MouseHover
		Actions builder = new Actions(driver);
		builder.moveToElement(Hoverele).perform();
	}

}

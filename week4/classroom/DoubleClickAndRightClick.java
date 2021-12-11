package week4.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAndRightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Highlight User name by double clicking
		WebElement eledoubleClick = driver.findElement(By.xpath("//label[@for='username']"));
		//double click action
		Actions builder = new Actions(driver);
	    builder.doubleClick(eledoubleClick).perform();
	    
	    //Right click the login button
	    WebElement eleRightClick = driver.findElement(By.className("inputLogin"));
	    builder.contextClick(eleRightClick).perform();
	    		
	}

}

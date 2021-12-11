package week4.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
		WebElement dst = driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][5]"));
		Point location = dst.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		//Using Mouse
        //builder.dragAndDropBy(src, x, y).perform();
		builder.clickAndHold(src).moveByOffset(x, y).release().perform();
	}

}

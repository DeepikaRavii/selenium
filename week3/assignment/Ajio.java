package week3.assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter the bags in search box
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		// Under "Gender" Click "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String text = driver.findElement(By.className("length")).getText();
		System.out.println(text);

		// Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> brandName = driver.findElements(By.className("brand"));
		System.out.println("Size : " + brandName.size());
		for (WebElement webElement : brandName) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
        
		// Get the list of brand of the products displayed in the page and print the
		// list without duplicate.

		Set<String> setBrand = new LinkedHashSet<String>();
		for (WebElement webElement : brandName) {
			String text1 = webElement.getText();
			setBrand.add(text1);
		}

		for (String string : setBrand) {
			System.out.println(string);
		}
		
		// Get the list of names of the bags and print it
		List<WebElement> bagName = driver.findElements(By.className("name"));
		System.out.println("Size : " + bagName.size());
		for (WebElement webElement : bagName) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		

	}

}

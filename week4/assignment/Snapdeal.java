package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Handle Notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// Go to https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		// Go to Mens Fashion
		WebElement eleMen = driver.findElement(By.linkText("Men's Fashion"));
		builder.moveToElement(eleMen).perform();
		// Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		// Get the count of the sports shoes
		String sportsShoeCount = driver.findElement(By.xpath("//div[text()='Sports Shoes']/following-sibling::div"))
				.getText();
        System.out.println("Count of Sports Shoe : "+sportsShoeCount);
        // Click Training shoes
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        // Sort by Low to High
        driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
        driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
        Thread.sleep(1000);
        //Check if the items displayed are sorted correctly
        String price1 = driver.findElement(By.xpath("(//span[contains(@id,'display-price')])[1]")).getAttribute("display-price");
        String price2 = driver.findElement(By.xpath("(//span[contains(@id,'display-price')])[2]")).getAttribute("display-price");
        System.out.println(price1 + " "+ price2);
        int p1 = Integer.parseInt(price1);
        int p2 = Integer.parseInt(price2);
        if (p1- p2 <= 0) {
			System.out.println("Filter Low to High is Applied");
		} else {
			System.out.println("Filter Low to High is not Applied");
		}
        // Select the price range (900-1200)
        WebElement fromVal = driver.findElement(By.name("fromVal"));
        fromVal.clear();
        fromVal.sendKeys("900");
        WebElement toVal = driver.findElement(By.name("toVal"));
        toVal.clear();
        toVal.sendKeys("1200");
        driver.findElement(By.xpath("//div[contains(text(),'GO']")).click();
        // Filter with color Navy 
        driver.findElement(By.xpath("//a[text()=' Navy']")).click();
        // verify the all applied filters 
        
        
	}

}

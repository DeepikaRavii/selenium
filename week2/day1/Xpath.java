package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String tagname = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']")).getText();
		System.out.println("The Title : " + tagname);
		WebElement eleusername = driver.findElement(By.xpath("//input[@id='username']"));
		eleusername.sendKeys("Demosalesmanager");

		WebElement elepassword = driver.findElement(By.xpath("//input[@id='password']"));
		elepassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		String text = driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

	}

}

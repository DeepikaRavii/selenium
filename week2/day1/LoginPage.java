package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");

		Thread.sleep(2000);

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		WebElement elepassword = driver.findElement(By.name("PASSWORD"));
		Thread.sleep(2000);
		elepassword.sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);

	}

}

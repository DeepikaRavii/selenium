package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("deepika@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String eleName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();
		System.out.println("LeadName:" + eleName);
		// another method
		// WebElement eleLeadId = driver.findElement(By.xpath("//td[@class='x-grid3-col
		// x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']"));
		// System.out.println("Lead Id:" +eleLeadId.getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String title = driver.getTitle();
		System.out.println("The Title : "+title);
		if (title.contains("Duplicate Lead")) {
			System.out.println("The title Contain Duplicate Lead");
		}else {
			System.out.println("The title does not Contain Duplicate Lead");
		}
		
		driver.findElement(By.className("smallSubmit")).click();
		String eleName1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(eleName1);
		if (eleName.contains(eleName1)) {
			System.out.println("Both are Same value");
		} else {
			System.out.println("Both are  not Same value");
		}
		
	}

}

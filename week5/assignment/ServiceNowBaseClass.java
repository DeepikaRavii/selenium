package week5.assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowBaseClass {
	public ChromeDriver driver;
	public static String IncidentNum;

	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public void preCondition(String url, String uName, String pWord ) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Sign in
		WebElement frame = driver.findElement(By.xpath("//div[@class='navpage-main-left ng-isolate-scope']/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("user_name")).sendKeys(uName);
		driver.findElement(By.id("user_password")).sendKeys(pWord);
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();

		// Search “incident “ Filter Navigator
		driver.findElement(By.id("filter")).sendKeys("incident");
		// Click “All”
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();

	}

	@AfterMethod
	public void postCondition() {
		
		driver.close();
	}
	

}

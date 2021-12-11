package week4.classroom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Simple Alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		//confirmation Alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.dismiss();
		System.out.println("confirmation message:" +alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
		
		//prompt Alert
		/*driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.accept();*/
		

	}

}

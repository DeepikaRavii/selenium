package week4.classroom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAndFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='iframewrapper']/iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Handle Alert
	    Alert alert = driver.switchTo().alert();
	    alert.accept();

	    System.out.println(alert.getText());
	  
	    alert.dismiss();
	   /* if (text.contains("OK")) {
			System.out.println("Pressed ok");
		} else {
			System.out.println("Pressed cancel");
		}*/
	}

}

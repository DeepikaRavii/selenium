package week4.classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framee {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
		 // move to frame1
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		
		// to takes control to main window
		driver.switchTo().defaultContent();
		
		//nested frame
		WebElement mainframe2 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		// move to frame2
		driver.switchTo().frame(mainframe2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		/*
		//to find how many frame
		WebElement frame3 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[3]"));
		driver.switchTo().frame(frame3);
		String text = driver.findElement(By.tagName("body")).getText();
	   	System.out.println(text);*/
	   	
	   	// takes control on step ahead out of frame
	   	driver.switchTo().parentFrame();
	   	
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		System.out.println(frameCount.size());
		
		
	
	}

}

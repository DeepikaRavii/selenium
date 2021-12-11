package week5.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssignIncident extends ServiceNowBaseClass{

	@Test
	public void runAssign() {
		WebElement frame = driver.findElement(By.xpath("//div[@class='navpage-main-left ng-isolate-scope']/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(IncidentNum, Keys.ENTER);
		driver.findElement(By.xpath("(//tbody[@class='list2_body']/tr/td)[3]")).click();
		
		//Assign the incident to  Software group
		driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']")).click();
		
		// select the new window
				Set<String> winSet = driver.getWindowHandles();
				List<String> winList = new ArrayList<String>(winSet);
				driver.switchTo().window(winList.get(1));
				driver.findElement(By.xpath("//a[text()='Application Development']")).click();
				driver.switchTo().window(winList.get(0));
				driver.switchTo().frame(frame);
				driver.findElement(By.xpath("(//div[@class='sn-stream-textarea-container'])[3]/textarea")).sendKeys("Assigned");
				driver.findElement(By.xpath("//button[text()='Update']")).click();
				String text = driver.findElement(By.xpath("(//tbody[@class='list2_body']/tr/td)[10]")).getText();
				
				if(text.contains("Application"))  {
					System.out.println("Updated");
				} else {
					System.out.println("Not Updated");
				}
			

	}
}

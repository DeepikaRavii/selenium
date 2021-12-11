package week5.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncident extends ServiceNowBaseClass {

	@Test
	public void runDelete() throws InterruptedException {
		WebElement frame = driver.findElement(By.xpath("//div[@class='navpage-main-left ng-isolate-scope']/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(IncidentNum, Keys.ENTER);
		driver.findElement(By.xpath("(//tbody[@class='list2_body']/tr/td)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//tr[@class='list2_no_records']/td")).getText();
		System.out.println(text);
		if (text.contains("No")) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}
		

	}
}

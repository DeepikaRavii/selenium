package week5.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UpdateIncident extends ServiceNowBaseClass{

	@Test
	public void runUpdate()  {
		//Search for the existing incident and click on the incident
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='navpage-main-left ng-isolate-scope']/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(IncidentNum, Keys.ENTER);
		driver.findElement(By.xpath("(//tbody[@class='list2_body']/tr/td)[3]")).click();
		
		//Update the incidents with Urgency as High and State as In Progress
			
		WebElement eleUrgency = driver.findElement(By.id("incident.urgency"));
		Select dropDown = new Select(eleUrgency);
		dropDown.selectByVisibleText("1 - High");
		
		WebElement eleState = driver.findElement(By.id("incident.state"));
		Select dropDown1 = new Select(eleState);
		dropDown1.selectByVisibleText("In Progress");
		driver.findElement(By.id("activity-stream-work_notes-textarea")).sendKeys("status as ben changed");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
		String text = driver.findElement(By.xpath("//a[@class='linked']/parent::td/following-sibling::td[2]")).getText();
		
		if(text.contains("Progress"))  {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	
	}
	/*@DataProvider
	public String getData() {
		CreateIncident ci = new CreateIncident();
		String IncidentNo = ci.sendData();
		return IncidentNo;
		
	}*/
		
	}
	




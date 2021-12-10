package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				 ChromeDriver driver=new ChromeDriver();
				 driver.get("http://leaftaps.com/opentaps");
				 
				 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			
				 WebElement elepassword = driver.findElement(By.name("PASSWORD"));
			
				 elepassword.sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
			
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
				
		//Dropdown for Source
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(eleSource);
		dropDown.selectByVisibleText("Direct Mail");
		
		//Dropdown for Marketing Campaign
		
		 driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");
		 
		 //Dropdown for Industry
		 WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select dropDown1 = new Select(eleIndustry);
		 dropDown1.selectByIndex(7);
		 
		//Dropdown for Ownership
		 WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dropDown2 = new Select(eleOwnership);
		 dropDown2.selectByValue("OWN_PARTNERSHIP");
		 
		 
		    
	}

}

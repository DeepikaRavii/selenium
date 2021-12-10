package week2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafCreateLeadForm {

	public static void main(String[] args) throws InterruptedException {
		// Setup Driver
		WebDriverManager.chromedriver().setup();

		// Open Browser
		ChromeDriver driver = new ChromeDriver();

		// To Maximize window
		driver.manage().window().maximize();

		// To Load an Application
		driver.get("http://leaftaps.com/opentaps");

		// To hold the process for sometime
		Thread.sleep(2000);

		// Locate Element -User name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Getting PAssword -To Save in Local variable
		WebElement elepassword = driver.findElement(By.name("PASSWORD"));

		// To pass through the value
		elepassword.sendKeys("crmsfa");

		// Click method (Login button and so on)
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// To fill the form - textbox
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/21/1990");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("8L");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0123456");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("563489");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to Testleaf");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Hello");

		// Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0457");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8824889758");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("236471");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepika@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");

		// Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("North st");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Thirumangalam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Madurai");
		// driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("625706");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0452");

		// Drop down for Source

		// Locate the Select Tag
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Create Object for select
		Select dropDown = new Select(eleSource);

		// Select the Value using VisibileText
		dropDown.selectByVisibleText("Direct Mail");

		// Drop down for Marketing Campaign
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");

		// Drop down for Industry
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown1 = new Select(eleIndustry);
		dropDown1.selectByIndex(7);

		// Drop down for Ownership
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2 = new Select(eleOwnership);
		dropDown2.selectByValue("OWN_PARTNERSHIP");

		// Drop down for Preferred Currency
		WebElement eleCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropDown3 = new Select(eleCurrency);
		dropDown3.selectByIndex(7);
		// Select dropDown3 = new Select(eleCurrency);
		// dropDown3.selectByIndex(7);

		// Count of currencies in the list
		WebElement eleDropDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select count = new Select(eleDropDown);
		List<WebElement> options = count.getOptions();

		System.out.println("No of Currencies available in List : " + options.size());

		// Drop down for Country
		WebElement eleCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropDown4 = new Select(eleCountry);
		dropDown4.selectByValue("IND");

		// Drop down for State/Province
		// WebElement eleState =
		// driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		// Select dropDown5 = new Select(eleState);
		// dropDown5.selectByValue("IN-TN");

		Thread.sleep(2000);

		// Create Lead Click Button
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of the resulting Page
		String title = driver.getTitle();
		System.out.println("The title is : " + title);

		// Verify the Title of the resulting Page

		if (driver.getTitle().contains("Lead")) {
			System.out.println("The Title has a word Lead");

		} else {
			System.out.println("The Title has not found a word Lead");
		}

		// Get the FirstName and Print
		String attribute = driver.findElement(By.name("firstName")).getAttribute("value");
		System.out.println("The value is : " + attribute);

		// To Minimize window (only available in Selenium 4)
		driver.manage().window().minimize();

	}

}

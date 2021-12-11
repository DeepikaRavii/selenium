package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@Test(dataProvider="sendData")
	public void runCreateLead(String cmpName, String uName, String lName, String phNum) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(uName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNum);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();
		return re.readData("CreateLead");

	}
}

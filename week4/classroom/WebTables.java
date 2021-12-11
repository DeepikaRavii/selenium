package week4.classroom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Find the Table
		WebElement webTable = driver.findElement(By.id("table_id"));
		
		//Get all the Rows
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		
		//Get the no of rows in the table
		System.out.println("The number of Rows in the Table : "+tableRows.size());
		
		//Get the number of the Columns
		WebElement firstRow = tableRows.get(1);
		List<WebElement> tableCol = firstRow.findElements(By.tagName("td"));
		
		//Get the no of columns in the table
		System.out.println("The number of Columns in the Table : "+tableCol.size());
		
		//Print all the content of the table
		for (WebElement eachRowElement : tableRows) {
			System.out.println(eachRowElement.getText());
		}
		
		//print the content of second column alone
		for (int i = 1; i < tableRows.size(); i++) {
			WebElement row = tableRows.get(i);
			List<WebElement> col = row.findElements(By.tagName("td"));
			String colText = col.get(1).getText();
			System.out.println(colText);
		}
	
	}

}

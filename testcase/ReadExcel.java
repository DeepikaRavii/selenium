package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readData(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		short cellCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String [rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] = text;
			}
		}

		wb.close();
		return data;
	}

}

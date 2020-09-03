package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
public static void captureScreenshot(WebDriver driver,String screenshotName) throws IOException {
		
		Path dest = Paths.get("./screenshots",screenshotName+".png");
		FileOutputStream out = new FileOutputStream(dest.toString());
		out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
		out.close();
		
		try {
			Files.createDirectories(dest.getParent());
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot" + e);;
		}
		
	}



public static Object[][] getDataFromExcel(String filePath, String sheetName) throws IOException {
	File file = new File(filePath);
	FileInputStream fis = new FileInputStream(file);

	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	Sheet sheet = workbook.getSheet("Sheet1");
	int rows = sheet.getLastRowNum();
	int columns = sheet.getRow(0).getLastCellNum();
	Object data[][] = new Object[rows][columns];

	for (int i = 0; i < rows; i++) {
		for (int k = 0; k < columns; k++) {

			data[i][k] = sheet.getRow(i).getCell(k);
			data[i][k] = String.valueOf(data[i][k]);

		}
	}
	return data;

}

}

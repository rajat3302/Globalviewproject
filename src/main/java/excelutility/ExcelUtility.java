package excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.qameta.allure.internal.shadowed.jackson.databind.exc.InvalidFormatException;

public class ExcelUtility 


{
	public static Object[][] readExcel(String filePath, String sheetName) throws IOException, InvalidFormatException {
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowCount - 1][colCount]; // Minus 1 to skip header row

        for (int i = 1; i < rowCount; i++) { // Start from 1 to skip header
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    data[i - 1][j] = cell.toString();
                }
            }
        }

        fis.close();
        return data;
    }
}


package org.datadriven.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTypeChkMultipleValue {

	public static void main(String[] args) throws IOException {
		// To Import the File
		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\Datas.xlsx");

		// For File Input Stream first download the Dependency file
		// poi-ooxml jar file 3.8-beta 4 (Stable Version)

		// FileInputStream - To get the data from excel to use this method
		FileInputStream st = new FileInputStream(f);

		// workbook - using this method to get the workbook data from excel
		Workbook w = new XSSFWorkbook(st);

		// Sheet - using this method to get the sheet of workbook tab
		Sheet sheet = w.getSheet("Datas");
		// Row
		Row row = sheet.getRow(2);
		// cell
		Cell cell = row.getCell(0);
		System.out.println(cell);

		System.out.println("************All Values******************");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row r = sheet.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int Type = c.getCellType();
				System.out.println(Type);

				// Type -> 1 Represent as String
				// Type -> 0 Represent as Date and Numbers

				if (Type == 1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				} else {
					if (DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();

						SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-YYYY");
						String value = sf.format(date);
						System.out.println(value);
					} else {

						double db = c.getNumericCellValue();
						long ln = (long) db;
						String value = String.valueOf(ln);
						System.out.println(value);

					}

				}

			}
		}
	}
}

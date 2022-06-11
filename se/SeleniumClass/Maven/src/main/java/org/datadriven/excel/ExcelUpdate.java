package org.datadriven.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\Datas.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Facebook");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		String test = c.getStringCellValue();
		if (test.equals("selenium")) {
			c.setCellValue("Java");
		}

		System.out.println(c);

		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Done");
	}
}

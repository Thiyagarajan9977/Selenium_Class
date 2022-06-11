package org.datadriven.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\new.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Facebook");
		Row r = s.createRow(2);
		Cell c = r.createCell(1);
		c.setCellValue("Java");
		System.out.println(c);
		
		// FileOutput Stream - To Create the new Excel Sheet
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Done");		
	}
}

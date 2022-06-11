package org.datadriven.tasks1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2 {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\StudentTask.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet cs = w.getSheet("Student");
		Row r = cs.createRow(12);
		Cell c1 = r.createCell(0);
		c1.setCellValue("Selenium");
		System.out.println(c1);
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Value Entered");

	}

}

package org.datadriven.tasks1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {

	public static void main(String[] args) throws IOException {

		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\StudentTask.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet cs = w.getSheet("Student");
		Row r = cs.getRow(0);
		int c = r.getPhysicalNumberOfCells();		
		int t = cs.getPhysicalNumberOfRows();
						
		System.out.println("Total Number of Rows.... :" +t);
		System.out.println("Total Number of Columns.... :" +c);

	}

}

package org.datadriven.tasks1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.test.baseclass.BaseClass;

public class Q5 extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\demoqa.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet cs = w.getSheet("Register");
		Row r = cs.getRow(1);
		Cell c = r.getCell(0);		
	
	}
}

package org.datadriven.tasks1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.test.baseclass.BaseClass;

public class Q4 extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\demoqa.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fs);
		Sheet cs = w.getSheet("Register");
		Row r = cs.getRow(1);
		Cell c = r.getCell(0);
		
		Row r1 = cs.getRow(2);
		Cell c1 = r1.getCell(0);
		
		Row r2 = cs.getRow(3);
		Cell c2 = r2.getCell(0);
		
		Row r3 = cs.getRow(4);
		Cell c3 = r3.getCell(0);
		
		launchbrowser();
		launchurl("https://demoqa.com/register/");
		WebElement fn = findElement("id", "firstname");				
		fn.sendKeys(c.getStringCellValue());
		
		WebElement fn1 = findElement("id", "lastname");				
		fn1.sendKeys(c1.getStringCellValue());		
		
		WebElement fn2 = findElement("id", "userName");				
		fn2.sendKeys(c2.getStringCellValue());
		
		WebElement fn3 = findElement("id", "password");				
		fn3.sendKeys(c3.getStringCellValue());
		
	}
}

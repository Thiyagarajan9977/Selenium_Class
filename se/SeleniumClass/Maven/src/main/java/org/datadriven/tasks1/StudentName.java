package org.datadriven.tasks1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentName {
	
	public static void main(String[] args) throws IOException {
		
		File f =  new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\Student.xlsx");
		FileInputStream st = new FileInputStream(f);
		Workbook w =  new XSSFWorkbook(st);
		Sheet cs = w.getSheet("Facebook");
	
			for (int i = 0; i < 1; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 10 Students name continuously....");
			for (int j = 0; j < 11; j++) {
				Row r1 = cs.createRow(j);
				Cell c1 = r1.createCell(i);
				c1.setCellValue(sc.nextLine());				
			}		
		}
			
			for (int k = 1; k < 2; k++) {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter the Courses name....");
				for (int j = 0; j < 11; j++) {				
					Row r2 = cs.createRow(j);
					Cell c2 = r2.createCell(k);
					c2.setCellValue(sc1.nextLine());				
				}			
			}
							
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Created details of 10 students name and courses");			
	}
}

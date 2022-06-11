	package org.datadriven.tasks2;
	
	import java.io.File;
	import java.io.*;
	import java.io.IOException;
	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.test.baseclass.BaseClass;
	
	public class HotelAppDataDriven extends BaseClass {
		
		public static void main(String[] args) throws IOException, InterruptedException {	
					
			launchbrowser();
			launchurl("http://www.adactin.com/HotelApp/");
			HotelAppBaseClass h = new HotelAppBaseClass();
			sendkeys(h.getUserid(), getExceldata("HotelBook", "Hotel", 0, 1));
			sendkeys(h.getPassword(), getExceldata("HotelBook", "Hotel", 1, 1));
			btnclick(h.getLogin());
			selectBy(h.getLocation(), "value", getExceldata("HotelBook", "Hotel", 3, 1));
			selectBy(h.getHotel(), "value", getExceldata("HotelBook", "Hotel", 4, 1));		
			selectBy(h.getRoomType(), "value", getExceldata("HotelBook", "Hotel", 5, 1));
			selectBy(h.getNoofRooms(), "value", getExceldata("HotelBook", "Hotel", 6, 1));
			sendkeys(h.getCheckinDate(), getExceldata("HotelBook", "Hotel", 7,1));
			sendkeys(h.getCheckOutDate(), getExceldata("HotelBook", "Hotel", 8,1));
			selectBy(h.getAdultsperroom(), "value", getExceldata("HotelBook", "Hotel", 9, 1));
			selectBy(h.getChildsperroom(), "value", getExceldata("HotelBook", "Hotel", 10, 1));
			btnclick(h.getsearch());
			btnclick(h.getOptions());
			btnclick(h.getContinue());
			sendkeys(h.getFirstName(), getExceldata("HotelBook", "Hotel", 12, 1));
			sendkeys(h.getLastName(), getExceldata("HotelBook", "Hotel", 13, 1));
			sendkeys(h.getAddress(), getExceldata("HotelBook", "Hotel", 14, 1));
			sendkeys(h.getCCno(), getExceldata("HotelBook", "Hotel", 15, 1));
			selectBy(h.getCardType(), "value", getExceldata("HotelBook", "Hotel", 16, 1));
			selectBy(h.getExpiryDate(), "value", getExceldata("HotelBook", "Hotel", 17, 1));
			selectBy(h.getExpiryYear(), "value", getExceldata("HotelBook", "Hotel", 18, 1));
			sendkeys(h.getCVV(), getExceldata("HotelBook", "Hotel", 19, 1));
			btnclick(h.getBooknow());
			Thread.sleep(5000);
			
			HotelAppOrderID ho = new HotelAppOrderID();
			String attribute = getAttribute(ho.getorder());		
			System.out.println("The order ID is.... :"+attribute);
			
			//excelupdate("HotelBook", "Hotel", 21, 0, "Order no");	
			//excelupdate("HotelBook", "Hotel", 21, 1, attribute);
				
				File f = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\Maven\\src\\main\\resources\\HotelBook.xlsx");
				FileInputStream fi = new FileInputStream(f);
				Workbook w = new XSSFWorkbook(fi);
				Sheet s = w.getSheet("Order");
				Row r = s.getRow(5);
				Cell c = r.createCell(2);	
				c.setCellValue(attribute);			
				FileOutputStream fo = new FileOutputStream(f);
				w.write(fo);
			}	
	
		}

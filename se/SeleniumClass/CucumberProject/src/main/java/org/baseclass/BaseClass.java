package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	// WEBDRIVER
	public static WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();			
			driver = new FirefoxDriver();
			break;
		case "internet explorer":
			
			WebDriverManager.iedriver().setup();			
			driver = new InternetExplorerDriver();			
			break;
			
			default:
				System.err.println("Invalid Browser Name");
				break;
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		return driver;
	}

	// URL Launch

	public static void launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	// get current url

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// Web element
	public static WebElement findElement(String by, String path) {
		WebElement e = null;
		switch (by) {
		case "id":
			e = driver.findElement(By.id(path));
			break;
		case "name":
			e = driver.findElement(By.name(path));
			break;
		case "tagname":
			e = driver.findElement(By.tagName(path));
			break;
		case "xpath":
			e = driver.findElement(By.xpath(path));
			break;
		}
		return e;
	}
	
	public static List<WebElement> FindElementsxpath(String path) {		 
		 List<WebElement> e = driver.findElements(By.xpath(path));
		 return e;
	}
	
	// WebElements		
	
	public static List<WebElement> FindElements(String by, String path) {
			
			List<WebElement> e = null;
			switch (by) {
			case "id":
				e = driver.findElements(By.id(path));
				break;
			case "name":
				e = driver.findElements(By.name(path));
				break;
			case "tagname":
				e = driver.findElements(By.tagName(path));
				break;
			case "xpath":
				e = driver.findElements(By.xpath(path));
				break;
			}	
			
			return e;
	}	
	
	
	// send keys
	public static WebElement sendkeys(WebElement e, String value) {
		e.sendKeys(value);
		return e;
	}

	// Click
	public static void btnclick(WebElement e) {
		e.click();
	}

	// Clear
	public static void clear(WebElement e) {
		e.clear();
	}

	// Get Text

	public static String gettext(WebElement e) {
		return e.getText();
	}

	// Get Attribute
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}

	// Quit
	public static void browserquit() {
		driver.quit();
	}

	// Actions
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void clickAction(WebElement e) {
		Actions a = new Actions(driver);
		a.click(e).perform();
	}

	public static void SelectByIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void dragAndDrop(WebElement e, WebElement f) {
		Actions a = new Actions(driver);
		a.dragAndDrop(e, f).perform();
	}

	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void clickAndHold(WebElement e) {
		Actions a = new Actions(driver);
		a.clickAndHold(e).perform();
	}

	public static void release(WebElement e) {
		Actions a = new Actions(driver);
		a.release(e).perform();
	}

	// JAVASCRIPT EXECUTOR
	public static void scrollUp(WebElement e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void scrollDown(WebElement e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	
	public static void scrollDowns (List<WebElement> e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", e);
	}

	public static void setAttribute(WebElement e, String value) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].setAttribute('value','" + value + "')", e);
	}

	public static void getAttribute(String r, WebElement e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		Object text = jk.executeScript("return arguments[0].getAttribute('value')", e);
		System.out.println(text);
	}

	public static void clickByJavaScript(WebElement e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("arguments[0].click()", e);
	}

	public static void jsSendkeys(WebElement element, String input) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + input + "')", element);
	}

	// Screenshot

	public static void screenShort(String imagename) {
		// Typecasting

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);

		File des = new File("./Screenshots\\" + imagename +" "+TimeUnit.MINUTES+ ".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Alert
	public static void accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void sendKeysByAlert(String s) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(s);
	}

	public static String gettTextByAlert() {
		Alert a = driver.switchTo().alert();
		return a.getText();
	}

	// Select
	public static void selectBy(WebElement e, String type, String value) {
		Select s = new Select(e);
		switch (type.toLowerCase()) {
		case "value":
			s.selectByValue(value);
			break;
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "text":
			s.selectByVisibleText(value);
			break;
		}
	}

	public static void getOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		for (WebElement eachOptions : options) {
			System.out.println(eachOptions.getText());
		}
	}

	public static void getFirstSelected(WebElement e) {
		Select s = new Select(e);
		WebElement f1 = s.getFirstSelectedOption();
		System.out.println(f1.getText());
	}

	public static void getAllSelectedOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement options : allSelectedOptions) {
			System.out.println(options.getText());
		}
	}

	public static void deSelectBy(WebElement e, String type, String value) {
		Select s = new Select(e);
		switch (type.toLowerCase()) {
		case "value":
			s.deselectByValue(value);
			break;
		case "index":
			s.deselectByIndex(Integer.parseInt(value));
			break;
		case "text":
			s.deselectByVisibleText(value);
			break;
		}
	}

	public static void deSelectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	public static void multiple(WebElement e) {
		Select s = new Select(e);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// Frames
	public static void switchToFrameBy(String type) {
		switch (type.toLowerCase()) {
		case "index":
			driver.switchTo().frame(Integer.parseInt(type));
			break;
		case "id":
			driver.switchTo().frame(type);
			break;
		case "name":
			driver.switchTo().frame(type);
		}
	}

	public static void switchToFrameByWebElement(WebElement e) {
		driver.switchTo().frame(e);
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void switchWindow() {
		String parentID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();

		for (String eachID : allID) {
			if (!parentID.equals(eachID)) {
				driver.switchTo().window(eachID);
			}
		}

	}

	public static void switchWindow2() {
		String parID = driver.getWindowHandle();
		System.out.println(parID);

		// All ID
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);

		for (String eachID : allID) {
			if (!parID.equals(eachID)) {
				driver.switchTo().window(parID);
			}
		}
	}

	// Select date

	public static void selectDate(String date) {
		driver.findElement(By.xpath("//div[text()='" + date + "']"));
	}

	// WebTable
	public static void enterIntoTable(int i) {
		List<WebElement> table = driver.findElements(By.tagName("table"));
		table.get(i);
	}

	public static String getExceldata(String bookName, String sheetname, int rowno, int cellno) throws IOException {

		File f = new File("./src\\main\\resources\\" + bookName + ".xlsx");

		FileInputStream st = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(st);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell c = row.getCell(cellno);
		int cellType = c.getCellType();

		String value = null;

		if (cellType == 1) {
			value = c.getStringCellValue();

		} else {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-YYYY");
				value = sf.format(date);
			} else {
				double db = c.getNumericCellValue();
				long ln = (long) db;
				value = String.valueOf(ln);
			}
		}

		return value;
	}

	public static void excelupdate(String bookName, String sheetName, int RowNumber, int cellNumber, String value)
			throws IOException {
		System.out.println("Working");
		File f = new File("./src\\main\\resources\\" + bookName + ".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(RowNumber);
		Cell cc = r.createCell(cellNumber);
		cc.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
	}

	public static void setExcelValue(String sheetName, int RowNumber, int cellNumber, String value) throws IOException {
		File f = new File("./src\\test\\resources\\Book1.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet(sheetName);
		Row r = s.createRow(RowNumber);
		Cell c = r.createCell(cellNumber);
		c.setCellValue(value);
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);

	}

}

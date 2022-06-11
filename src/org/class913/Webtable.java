package org.class913;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\ews\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> tables = driver.findElements(By.tagName("table"));
		int size = tables.size();
		System.out.println("The size of the table..." + size);

		WebElement table3 = tables.get(3);
		String at = table3.getAttribute("id");
		System.out.println("The Table Name is.... " + at);

		System.out.println("***********Table Value**********");
		WebElement table = driver.findElement(By.id("customers"));
		String text = table.getText();
		System.out.println(text);

		// Get all the rows

		System.out.println("*********Get all the rows*********");
		List<WebElement> trow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trow.size(); i++) {
			WebElement row = trow.get(i);
			String rtext = row.getText();
			System.out.println(rtext);
		}

		// Get all headings only

		System.out.println("************Get all headings only**********");
		for (int i = 0; i < trow.size(); i++) {
			WebElement row = trow.get(i);
			List<WebElement> tHeads = row.findElements(By.tagName("th"));
			for (int j = 0; j < tHeads.size(); j++) {
				WebElement head = tHeads.get(j);
				System.out.println(head.getText());
			}
		}

		// Get Data's Only
		System.out.println("************Get Data's Only*************");
		for (int i = 0; i < trow.size(); i++) {
			WebElement row = trow.get(i);
			List<WebElement> tDatas = row.findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				WebElement data = tDatas.get(i);
				System.out.println(data.getText());
			}
		}

		// get particular data and entire row

		System.out.println("*******get particular data  and entire row***********");
		for (int i = 0; i < trow.size(); i++) {
			WebElement row = trow.get(i);
			List<WebElement> tDatas = row.findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				WebElement data = tDatas.get(j);
				String dtext = data.getText();
				if (dtext.equals("Canada")) {

					// Get Particular Value

					System.out.println(dtext);

					// get entire row

					System.out.println(row.getText());

				}

			}

		}

		driver.quit();

	}

}

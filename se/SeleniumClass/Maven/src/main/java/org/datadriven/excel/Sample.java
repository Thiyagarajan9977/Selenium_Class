package org.datadriven.excel;


import java.io.IOException;

import org.pom.pages2.loginpage;
import org.test.baseclass.BaseClass;

public class Sample extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchbrowser();
		launchurl("https://www.facebook.com");
		loginpage l = new loginpage();
		sendkeys(l.getTxtusername().get(0), getExceldata("Datas","new", 1, 1) );		
		sendkeys(l.getTxtpassword(), getExceldata("Datas","Data", 10, 4));		
		btnclick(l.getBtnlogin());
		
		String username = getExceldata("Datas","new", 1, 1);
		String password = getExceldata("Datas","Data", 10, 4);
		l.login(username, password);
	}
}

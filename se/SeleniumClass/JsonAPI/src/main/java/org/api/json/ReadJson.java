package org.api.json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {

	public static void main(String[] args) throws IOException, ParseException {
		
		jsonRead();

	}

	public static void jsonRead() throws IOException, ParseException {

		// To read the Json file to declare the FileReader class

		FileReader f = new FileReader(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\JsonAPI\\src\\test\\resources\\JSON\\new.JSON");

		// To create the object for Json Parser class

		JSONParser ja = new JSONParser();

		// convert the Json content to return java object and mention the file name in
		// arguments

		Object ob = ja.parse(f);

		// There is no get method in Java object so type cast Json 

		JSONObject j = (JSONObject)ob;
		Object o1 = j.get("userName");
		System.out.println(o1);
		System.out.println(o1.toString());
		
		System.out.println(j.get("passWord").toString());
		
		
		Object browser = j.get("browser");
		System.out.println(browser.toString());
		
		//JSON Array
		
		JSONArray a = (JSONArray)browser;
		Object ob2 = a.get(1);
		System.out.println(ob2);
		
	}

}

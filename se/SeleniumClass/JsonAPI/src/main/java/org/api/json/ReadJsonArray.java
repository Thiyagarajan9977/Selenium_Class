package org.api.json;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonArray {

	public static void main(String[] args) throws IOException, ParseException {

		jsonRead();

	}

	public static void jsonRead() throws IOException, ParseException {

		// To read the Json file to declare the FileReader class

		FileReader f = new FileReader(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\JsonAPI\\src\\test\\resources\\JSON\\MoreKey.JSON");

		// To create the object for Json Parser class

		JSONParser ja = new JSONParser();

		// convert the Json content to return java object and mention the file name in
		// arguments

		Object ob = ja.parse(f);

		// There is no get method in Java object so type cast Json

		// JSON OBJECT CREATION

		JSONObject j = (JSONObject) ob;
		Object o1 = j.get("employee");
		System.out.println(o1);
		System.out.println(o1.toString());

		// JSON Array

		JSONArray a = (JSONArray) o1;
		Object ob2 = a.get(1);
		System.out.println(ob2);
		
		for (Object x : a) {
			JSONObject j1 = (JSONObject) x;
			System.out.println(j1.get("efirstName"));
			System.out.println(j1.get("elastName"));		
		}

		// JSON Object Creation

		JSONObject j1 = (JSONObject) ob;
		Object o2 = j1.get("manager");
		System.out.println(o2.toString());

		JSONArray a1 = (JSONArray) o2;
		Object ob3 = a1.get(2);
		System.out.println(ob3);
		
		//Manager
		
		for (Object x : a1) {
			JSONObject j2 = (JSONObject) x;
			System.out.println(j2.get("mfirstName"));
			System.out.println(j2.get("mlastName"));		
		}
	}
}

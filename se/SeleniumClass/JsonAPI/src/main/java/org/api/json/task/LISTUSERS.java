package org.api.json.task;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LISTUSERS {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader f = new FileReader(
				"C:\\Users\\Admin\\eclipse-workspace\\SeleniumClass\\JsonAPI\\src\\test\\resources\\JSON\\LIST USERS.JSON");

		JSONParser j = new JSONParser();
		Object p = j.parse(f);
		JSONObject jo = (JSONObject) p;
		
		
		Object obj = jo.get("page");
		System.out.println("page value is.... "+obj);
		
		Object obj1 = jo.get("per_page");
		System.out.println("per page is.... "+obj1);
		
		Object obj2 = jo.get("total");
		System.out.println("total value is.... "+obj2);
		
		Object obj3 = jo.get("total_pages");
		System.out.println("total page is.... "+obj3);
		
		Object obj4 = jo.get("data");
		JSONArray js = (JSONArray) obj4;
		
		for (Object c : js) {			
			JSONObject j1 = (JSONObject)c;
			System.out.println(j1.get("id"));
			System.out.println(j1.get("email"));
			System.out.println(j1.get("first_name"));
			System.out.println(j1.get("last_name"));
			System.out.println(j1.get("avatar"));	
		}

		Object obj5 = jo.get("support");
		JSONArray js1 = (JSONArray) obj5;
		
		for (Object d : js1) {			
			JSONObject j2 = (JSONObject)d;
			System.out.println(j2.get("url"));
			System.out.println(j2.get("text"));			
		}
		
		
	}
}

package org.webservice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WebServiceTesting {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader r = new FileReader(
				"C:\\GreensTechnology\\WebServiceTesting\\src\\test\\resources\\JsonFiles\\Employee.json");
		JSONParser p = new JSONParser();
		Object obj = p.parse(r);
		JSONObject o = (JSONObject) obj;
		Object o2 = o.get("data");
		JSONArray a1 = (JSONArray) o2;
		Object o3 = a1.get(4);
		JSONObject o4 = (JSONObject) o3;
		System.out.println(o4.get("id"));
		System.out.println(o4.get("name"));
		System.out.println(o4.get("first_name"));
		System.out.println(o4.get("last_name"));
		System.out.println(o4.get("avatar"));
		//System.out.println(o.get("total"));

	}
}

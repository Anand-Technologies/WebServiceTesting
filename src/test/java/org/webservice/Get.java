package org.webservice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.junit.Test;

import com.sun.xml.xsom.impl.scd.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Get {

	@Test
	public void checkStatusCode() throws org.json.simple.parser.ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = res.getBody();
		String v = body.asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(v);
		JSONObject j = (JSONObject) o;
		Object o1 = j.get("total");

		//Assert.assertEquals("verify page no :",  Integer.parseInt(o1.toString()));
		System.out.println(o1);

	}

	@Test
	public void checkTotalValue() throws org.json.simple.parser.ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = res.getBody();
		String v = body.asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(v);
		JSONObject o1 = (JSONObject) o;
		Object o2 = o1.get("data");
		JSONArray a1 = (JSONArray) o2;
		Object o3 = a1.get(0);
		JSONObject o4 = (JSONObject) o3;
		System.out.println(o4.get("id"));

		//Assert.assertEquals("verify page no :", Integer.parseInt(o4.toString()));
		
	}

	@Test
	public void checkEmail() throws org.json.simple.parser.ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = res.getBody();
		String v = body.asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(v);
		JSONObject o1 = (JSONObject) o;
		Object o2 = o1.get("data");
		JSONArray a1 = (JSONArray) o2;
		Object o3 = a1.get(1);
		JSONObject o4 = (JSONObject) o3;
		System.out.println(o4.get("email"));

		//Assert.assertEquals("verify page no :", Integer.parseInt(o4.toString()));

	}

	@Test
	public void checkFirstName() throws org.json.simple.parser.ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = res.getBody();
		String v = body.asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(v);
		JSONObject o1 = (JSONObject) o;
		Object o2 = o1.get("data");
		JSONArray a1 = (JSONArray) o2;
		Object o3 = a1.get(2);
		JSONObject o4 = (JSONObject) o3;
		System.out.println(o4.get("first_name"));

		//Assert.assertEquals("verify page no :", Integer.parseInt(o4.toString()));

	}

	@Test
	public void checkLastName() throws org.json.simple.parser.ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = res.getBody();
		String v = body.asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(v);
		JSONObject o1 = (JSONObject) o;
		Object o2 = o1.get("data");
		JSONArray a1 = (JSONArray) o2;
		Object o3 = a1.get(3);
		JSONObject o4 = (JSONObject) o3;
		System.out.println(o4.get("last_name"));

		//Assert.assertEquals("verify page no :", Integer.parseInt(o4.toString()));

	}

	@Test
	public void checkAvatar() throws org.json.simple.parser.ParseException {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		ResponseBody body = res.getBody();
		String v = body.asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(v);
		JSONObject o1 = (JSONObject) o;
		Object o2 = o1.get("data");
		JSONArray a1 = (JSONArray) o2;
		Object o3 = a1.get(4);
		JSONObject o4 = (JSONObject) o3;
		System.out.println(o4.get("avatar"));

		//Assert.assertEquals("verify page no :", Integer.parseInt(o4.toString()));

	}

	
	
}

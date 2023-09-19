package org.Testing.TestSteps;

import java.util.Properties;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.Testing.Payloads.POJOBodyaData;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class HttpMethods {

	static Properties properties;
	public HttpMethods(Properties properties) {
		this.properties=properties;
	}
	public Response GetRequest(String URI) {
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(properties.getProperty(URI));
		return res;
	}
	public Response PostRequestPOJO(Object postData, String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.body(postData)
				.when()
				.post(properties.getProperty(URI));
		return Res;
				
	}
	public Response PostRequestJson(String postData, String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.body(postData)
				.when()
				.post(properties.getProperty(URI));
		return Res;
				
	}
	public Response PutRequestJson(String postData, String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.body(postData)
				.when()
				.put(properties.getProperty(URI));
		return Res;
				
	}
	public Response delete(String URI) {
		Response Res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.put(properties.getProperty(URI));
		return Res;
				
	}

}

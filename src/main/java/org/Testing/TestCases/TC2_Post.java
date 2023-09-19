package org.Testing.TestCases;

import java.util.Properties;

import org.Testing.Payloads.POJOBodyaData;
import org.Testing.TestResponseValidation.ResponseValidation;
import org.Testing.TestSteps.HttpMethods;
import org.Testing.TestUtilities.PropertiesFileLoad;
import org.Testing.TestUtilities.ReadJson;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_Post {


	static String pathProperties = System.getProperty("user.dir");
	@Test
	public void  postTestCase() throws Throwable {
		Properties properties =PropertiesFileLoad.PropFileload(pathProperties+"\\Env.properties");
		HttpMethods http = new HttpMethods(properties);
		POJOBodyaData pjb = new POJOBodyaData("morpheus","leader");
		Response Res = http.PostRequestPOJO(pjb, "URI_get_2");
		ResponseValidation ResObj = new ResponseValidation();
		ResObj.responseValidation(Res);
	}
	@Test
	public void  postTestCaseJSON() throws Throwable {
		Properties properties =PropertiesFileLoad.PropFileload(pathProperties+"\\Env.properties");
		HttpMethods http = new HttpMethods(properties);
		ReadJson Rj = new ReadJson();
		String PostData = Rj.readJson(pathProperties+"\\JSON\\post.json");
		Response Res = http.PostRequestJson(PostData, "URI_get_2");
		ResponseValidation ResObj = new ResponseValidation();
		ResObj.responseValidation(Res);
	}
}

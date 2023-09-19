package org.Testing.TestCases;

import java.util.Properties;

import org.Testing.TestResponseValidation.ResponseValidation;
import org.Testing.TestSteps.HttpMethods;
import org.Testing.TestUtilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_Get {

	static String pathProperties = System.getProperty("user.dir");
	@Test
	public void  getTestCase() throws Throwable {
		Properties properties =PropertiesFileLoad.PropFileload(pathProperties+"\\Env.properties");
		HttpMethods http = new HttpMethods(properties);
		Response Res = http.GetRequest("URI_get_1");
		ResponseValidation ResObj = new ResponseValidation();
		ResObj.responseValidation(Res);
	}
}

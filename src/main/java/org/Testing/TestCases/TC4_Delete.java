package org.Testing.TestCases;

import java.util.Properties;

import org.Testing.TestResponseValidation.ResponseValidation;
import org.Testing.TestSteps.HttpMethods;
import org.Testing.TestUtilities.PropertiesFileLoad;
import org.Testing.TestUtilities.ReadJson;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_Delete {


	static String pathProperties = System.getProperty("user.dir");
	
	@Test
	public void  postTestCaseJSON() throws Throwable {
		Properties properties =PropertiesFileLoad.PropFileload(pathProperties+"\\Env.properties");
		HttpMethods http = new HttpMethods(properties);
		ReadJson Rj = new ReadJson();
		String PostData = Rj.readJson(pathProperties+"\\JSON\\put.json");
		Response Res = http.delete("URI_Delete_1");
		ResponseValidation ResObj = new ResponseValidation();
		ResObj.responseValidation(Res);
	}


}

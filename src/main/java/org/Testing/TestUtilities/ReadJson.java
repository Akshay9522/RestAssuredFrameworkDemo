package org.Testing.TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {

	public String readJson(String path) throws Throwable {
		
		File fl = new File(path);
		FileInputStream fis = new FileInputStream(fl);
		JSONTokener jt = new JSONTokener(fis);
		JSONObject obj = new JSONObject(jt);
		ObjectMapper obj1 =new ObjectMapper();
		String data=obj1.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		return data;
	}
}

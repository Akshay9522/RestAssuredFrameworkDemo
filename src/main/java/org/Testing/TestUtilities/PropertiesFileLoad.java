package org.Testing.TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFileLoad {

	public static Properties PropFileload(String path) throws Throwable {
		File fl = new File(path);
		FileInputStream fis = new FileInputStream(fl);
		Properties properties = new Properties();
		properties.load(fis);		
		return properties;
		
	}
}

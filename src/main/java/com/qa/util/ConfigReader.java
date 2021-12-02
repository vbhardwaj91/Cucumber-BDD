package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static Properties prop;
	
	public static Properties initProp() {
		
		
		prop = new Properties();
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\vaibharadwaj\\eclipse-workspace\\HPE_Portal\\src\\test\\resources\\config\\Config.properties");
			try {
				prop.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      return prop;		
		
		
	}

}

package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Config {
	
	private static Properties config;
	
	private Config() {
		
	}

	static {
		try {                      
			File file = new File("./src/Practice/config.properties");
			FileInputStream input = new FileInputStream(file);
			
			config = new Properties();
			config.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String names) {
		return config.getProperty(names);
	}
}

package day29_properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TimeOfDay {

	public static void main(String[] args) throws IOException {
		
		
//		String timeOfDay = "morning";
		                       
		File file = new File("./src/day29_properties_file/data.properties");
		FileInputStream input = new FileInputStream(file);
		
		Properties config = new Properties();
		config.load(input);
		
		switch(config.getProperty("timeOfDay")) {
			case "morning": 
				System.out.println("Good morning!");
				break;
			case "afternoon": 
				System.out.println("Good afternoon!");
				break;
			case "evening": 
				System.out.println("Good evening!");
				break;
			default:
				System.out.println("Hello");
		} 
	}

}

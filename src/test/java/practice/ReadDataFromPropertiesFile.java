package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {

		//Create a java representation object of physical file
		FileInputStream fis=new FileInputStream("C:\\Users\\QSP\\Documents\\CommondataE32.properties");
		
		//Create object of Properties class
		Properties prop=new Properties();
		
		//Load the data into prop
		prop.load(fis);
		
		String BROWSER = prop.getProperty("Browser");
		String URL = prop.getProperty("URL");
		String USERNAME = prop.getProperty("Username");
		String PASSWORD = prop.getProperty("Password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
		
	}

}

package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesBrowser {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	/*	String browsername="IE";
		System.out.println(browsername);*/
		
		//to read the property files we need to use properties class
		Properties prop=new Properties();
		//prop.load(new FileInputStream("E:\\workspace\\MyFirstProject\\config\\config.properties"));
		prop.load(new FileInputStream("./config/config.properties"));
		System.out.println(prop.getProperty("browsername"));
		  // . --> your workspace + current project //used to do code robust
		
		prop.setProperty("url", "facebook.com"); //it will change the value of url from google.com
		System.out.println(prop.getProperty("url"));
		
		//now, to store the changed value
		FileOutputStream test=new FileOutputStream("./config/config.properties");
		prop.store(test, "changing value");
		
		
	}
}

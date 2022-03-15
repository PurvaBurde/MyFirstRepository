package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties123 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties obj=new Properties();
		
		obj.load(new FileInputStream("./config/config123.properties"));
		System.out.println(obj.getProperty("Name"));
		
		obj.setProperty("Email", "xyz");
		System.out.println(obj.get("Email"));
		
		FileOutputStream obj1=new FileOutputStream("./config/config123.properties");
		obj.store(obj1, "Java is Pagal");
	}

}

package test12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");		
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");
		
//		Enumeration eumeration = prop.propertyNames();
		
//		while(eumeration.hasMoreElements()) {
//			String element = (String) eumeration.nextElement();
//			System.out.println(element + "=" + prop.getProperty(element));
//		}
		
		fileSave(prop);
	
		fileOpen(prop);
		
		
		
		


	}

	
	
	
	public static void fileSave(Properties p) {
		
		try {
			p.storeToXML(new FileOutputStream("data.xml"), null);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileOpen(Properties p) {
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
			
			Enumeration eumeration = p.propertyNames();
			Fruit[] f = new Fruit[p.size()];
			
			for(int i =0; i<p.size();i++) {
				String key = (String) eumeration.nextElement();
				String value = p.getProperty(key);
				String[] values = value.split(",");
				f[i]= new Fruit(values[0],Integer.parseInt(values[1]),Integer.parseInt(values[2]));
				
				System.out.println(key +" = " +f[i].toString());
				
			}
			
			
			
			while(eumeration.hasMoreElements()) {
				String element = (String) eumeration.nextElement();
				System.out.println(element + "=" + p.getProperty(element));
				}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
	
	
	


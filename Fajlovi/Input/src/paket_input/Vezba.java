package paket_input;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Vezba {

	public static void main(String[] args) throws Throwable {
	//1:
		DataInputStream dis = new DataInputStream(System.in);
		
	//2:
		FileOutputStream fos = new FileOutputStream("NoviFajl1.txt");
		
	//3: 
		System.out.println("Unesite text. Za prekid unosa unesite znak $");
		char karakter;
		while((karakter=(char)dis.read())!= '$') {
			fos.write(karakter);
		}
		fos.close();
	}

}

package zajednoIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// Ucitavanje u Fajl
		
		DataInputStream dis = new DataInputStream(System.in);
		
		FileOutputStream fos = new FileOutputStream("Najnoviji.txt");

		System.out.println("Ucitavanje u Fajl");
		char karakter;
		
		while((karakter=(char)dis.read())!='$') {
			fos.write(karakter);
		}
		fos.close();
		
		//Ucitavanje iz fajla
		FileInputStream fis = new FileInputStream("Najnoviji.txt");
		System.out.println("Ucitavanje IZ Fajl-a");
		int vrednost;
		while((vrednost=fis.read())!=-1) {
			System.out.print((char)vrednost);
		}
		fis.close();
		
	}

}

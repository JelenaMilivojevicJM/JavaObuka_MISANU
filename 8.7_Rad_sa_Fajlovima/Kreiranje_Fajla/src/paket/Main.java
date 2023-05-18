package paket;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		// Upisivanje podataka u novi fajl

		// 1:
		DataInputStream dis = new DataInputStream(System.in);

		// 2:
		FileOutputStream fos = new FileOutputStream("NoviFajl");

		// 3:
		System.out.println("Unos iz konzole: ");
		char karakter;
		while ((karakter = (char) dis.read()) != '$') {
			fos.write(karakter);
		}
		fos.close();
	}
}

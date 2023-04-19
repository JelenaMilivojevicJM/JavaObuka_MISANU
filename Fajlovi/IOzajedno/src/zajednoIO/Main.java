package zajednoIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		// Upisivanje podataka u novi fajl

		// 1:
		DataInputStream dis = new DataInputStream(System.in);

		// 2:
		FileOutputStream fos = new FileOutputStream("NoviNovi");

		// 3:
		System.out.println("Unos iz konzole: ");
		char karakter;
		while ((karakter = (char) dis.read()) != '$') {
			fos.write(karakter);
		}
		fos.close();

		// Ucitavanje iz fajla:
		// 1:
		FileInputStream fis = new FileInputStream("NoviNovi");

		// 2:
		System.out.println("Ucitavanje iz fajla: " + fis);
		int vrednost;
		while ((vrednost = fis.read()) != -1) {
			System.out.print((char) vrednost);
		}
		fis.close();
	}

}

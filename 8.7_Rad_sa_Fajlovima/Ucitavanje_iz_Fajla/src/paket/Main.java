package paket;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// Upisivanje podataka u novi fajl

		// 1:
		DataInputStream dis = new DataInputStream(System.in);

		// 2:
		FileOutputStream fos = new FileOutputStream("Novi2");

		// 3:
		System.out.println("Unos iz konzole: ");
		char karakter;
		while ((karakter = (char) dis.read()) != '$') {
			fos.write(karakter);
		}
		fos.close();
		// Ucitavanje iz fajla:
		// 1:
		FileInputStream fis = new FileInputStream("Novi2");

		// 2:
		System.out.println("Ucitavanje iz fajla: ");
		int vrednost;
		while ((vrednost = fis.read()) != -1) {
			System.out.print((char) vrednost);
		}
		fis.close();

	}

}

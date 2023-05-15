package glavniPaket;

import java.io.*;

import paketMotor.IzuzetakMotor;
import paketMotor.Motor;

public class TestMotor {
	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka o motoru
		System.out.println("Unesite marku motora: ");
		String marka = ulaz.readLine();
		System.out.println("Unesite kubikažu motora: ");
		double kubikaza = Double.parseDouble(ulaz.readLine());

		// Kreiranje objekat klase Motor
		Motor a = new Motor();
		try {
			// Postavljanje podataka o motoru
			a.setMarka(marka);
			a.setKubikaza(kubikaza);

			// Štampanje podataka o motoru
			System.out.println("\nUneti podaci o motoru su: ");
			a.ispisi();
		} catch (IzuzetakMotor e) {
			System.out.println("Greška: " + e.getMessage());
		}
	}
}
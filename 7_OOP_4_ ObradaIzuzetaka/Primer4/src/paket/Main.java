package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static int racunajKolicnik(int imenilac, int brojilac) throws ArithmeticException {
		// throws je kljucna rec koja se koristi u zaglavlju metode da naznaci tip
		// izuzetka koje ta metoda moze da baci.

		return brojilac / imenilac;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Unesite brojilac: ");
			int brojilac = sc.nextInt();
			System.out.println("Unesite imenilac: ");
			int imenilac = sc.nextInt();

			int rezultat = racunajKolicnik(imenilac, brojilac);
			System.out.println("Kolicnik =  " + rezultat);

		} catch (ArithmeticException e) {
			System.out.println("Izuzetak: " + e);
		} catch (InputMismatchException e) {
			System.out.println("Nepoklapanje unosa sa tipom promenljive koja prihvata unos");
		}
		sc.close();
	}
}
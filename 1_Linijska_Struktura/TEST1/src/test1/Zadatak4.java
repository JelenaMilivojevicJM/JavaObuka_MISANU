package test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak4 {
	/*
	 * Zadatak 4
	 * 
	 * Neka su zadate tačke A i B svojim koordinatama, XA, YA i XB, YB, respektivno.
	 * Napisati program kojim se izračunava i štampa rastojanje između zadatih
	 * tačaka A i B na osnovu izraza
	 */
	public static void main(String[] args) {
		// Ulaz - ucitati koordinate

		DecimalFormat dfor = new DecimalFormat("#.##");
		Scanner inp = new Scanner(System.in);
		System.out.println("Unesite koordinatu xa");
		double xa = inp.nextDouble();
		System.out.println("Unesite koordinatu ya");
		double ya = inp.nextDouble();
		System.out.println("Unesite koordinatu xb");
		double xb = inp.nextDouble();
		System.out.println("Unesite koordinatu yb");
		double yb = inp.nextDouble();

		// Obrada - racunati
		double d = Math.sqrt((xa * xa) - (xb * xb) + (ya * ya) - (yb * yb));

		// Izlaz
		System.out.println("Rastojanje izmedju tacaka A i B, (d) iznosi: " + dfor.format(d));
		inp.close();
	}

}

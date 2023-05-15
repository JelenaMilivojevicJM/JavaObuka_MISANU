package test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak2 {
	/*
	 * Zadatak 2
	 * 
	 * Napisati program kojim se izračunava vrednost funkcije na slici na osnovu
	 * unetih vrednosti promenljivih x, y i z. Na izlazu štampati vrednost funkcije
	 */
	public static void main(String[] args) {
		// Ulaz - uneti vrednosti za x,z,y
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite x");
		double x = s.nextDouble();
		System.out.println("Unesite y");
		double y = s.nextDouble();
		System.out.println("Unesite z");
		double z = s.nextDouble();

		// Obrada - racunanje funkcije

		double f = (x - 2 * y) * (x + z) / (2 * x + y);

		// Izlaz - prikaz vrednosti funkcije
		System.out.println("Vrednost funkcije f(x,y,z): " + f);
		System.out.println("Svedeno na manji broj decimala funkcija f(x,y,z) je: " + df.format(f));
		s.close();
	}

}

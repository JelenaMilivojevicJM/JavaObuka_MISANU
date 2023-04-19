package predavanje22;

import java.util.Scanner;

public class MatricaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Matrica m1 = new Matrica(5, 5);
		System.out.println(" Matrica ima: " + m1.getVrsta() + " redova");
		System.out.println(" Matrica ima: " + m1.getKolona() + " kolona.");
		System.out.println(m1.postaviEelement(1, 2, 3));
		System.out.println("Vrednost: " + m1.dohvatiEelment(1, 2));

		System.out.println(m1.toString());
		sc.close();
	}
}

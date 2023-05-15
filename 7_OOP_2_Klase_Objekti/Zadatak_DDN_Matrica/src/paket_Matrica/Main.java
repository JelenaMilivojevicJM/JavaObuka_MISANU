package paket_Matrica;

import java.util.Scanner;

/*Matrica realnih brojeva ima zadat broj vrsta i kolona koji mogu da se dohvate. 
Može da se postavi ili da se dohvati element sa zadatim indeksima.*/
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Matrica m1 = new Matrica(5, 5);

		System.out.println(" Matrica ima: " + m1.getVrsta() + " redova");

		System.out.println(" Matrica ima: " + m1.getKolona() + " kolona.");

		System.out.println(m1.postaviEelement(1, 2, 3));

		System.out.println("Vrednost: " + m1.dohvatiEelment(1, 2));

		m1.toString();

		sc.close();
	}
}

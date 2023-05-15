package test1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak3 {
	/*
	 * Zadatak 3
	 * 
	 * Napisati program kojim se na osnovu unete stranice kvadrata a izračunava
	 * površina i obim. Na izlazu štampati površinu i obim kvadrata.
	 */
	public static void main(String[] args) {

		// Ulaz - ucitati duzinu stranice a
		DecimalFormat dff = new DecimalFormat("#.##");
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite duzinu stranice a");
		double a = in.nextDouble();
		
		//Obrada - racunati povrsinu i obim
		
		double povrsina = a*a;
		double obim = 4*a;
		
		//Izlaz - prikaz konacnog rezultata
		System.out.println("Povrsina je P = "+dff.format(povrsina));
		System.out.println("Obim je O= "+dff.format(obim));
		in.close();
	}

}

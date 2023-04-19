package dz1_2zad_paket1_JelenaM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unsite red (duzinu) veriznog razlomka: ");
		int red = sc.nextInt();
		
		//Kreiranje veriznog razlomka sa zadatim redom
		VerizniRazlomak vr = new VerizniRazlomak(red);
		
		//Postavljanje indeksa i vrednosti koeficijenata
		while(red>0) {
		System.out.println("Unsite indeks koeficijenta: ");
		int indeks = sc.nextInt();
		System.out.println("Unsite vrednost koeficijenta: ");
		double vrednost = sc.nextDouble();
		vr.setKoeficijent(indeks, vrednost);	
		red--;
		}
		
		System.out.println("Unsite vrednost za b: ");
		double b = sc.nextDouble();
		
		//Prikaz rezultata:
		System.out.println("Rezultat razlomka: "+vr.racunajRezultat(b));
		
		//Tekstualni opis - nacin 1:
		System.out.println(vr.toString());
		
		//Tekstualni opis - nacin 2:
		vr.stampaj();
		
		
		sc.close();
		
		/*Provera 1: Izlaz:
		 * Unsite red (duzinu) veriznog razlomka: 
4
Unsite indeks koeficijenta: 
0
Unsite vrednost koeficijenta: 
1
Unsite indeks koeficijenta: 
1
Unsite vrednost koeficijenta: 
2
Unsite indeks koeficijenta: 
2
Unsite vrednost koeficijenta: 
3
Unsite indeks koeficijenta: 
3
Unsite vrednost koeficijenta: 
4
Unsite vrednost za b: 
5
Rezultat razlomka: 0.1864801864801865
Verizni razlomak sadrzi koeficijente: 1.0, 2.0, 3.0, 4.0, 
 Koeficijenti veriznog razlomka su : 1.0 2.0 3.0 4.0 
		 */
	}

}

package zadatak2_paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ulaz:
		// Ucitavanje trocifrenog broja
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite trocifreni broj: ");
		int broj = sc.nextInt();
		
		// Obrada:
		//Izdvajanje cifara
		int s = broj / 100;
		int d = (broj / 10)%10;
		int j = broj % 10;
		
		//Racunanje proizvoda cifara
		int proizvod = s * d * j;
		
		//Racunanje kubova cifara
		int kubS = s*s*s;
		int kubD = d*d*d;
		int kubJ = j*j*j;
		
		//Racunanje sume kubova cifara
		int sumaKubova = kubS+kubD+kubJ ;
		
		//Racunanje rezultata ispisa cifara u obrnutom redosledu
		int ispis = (j*100)+(d*10)+(s*1);
		
		//Izlaz:
		//Stampanje vrednosti
		System.out.println("Za uneti broj "+broj+" cifre su: "+s+","+d+","+j+".");
		System.out.println("Proizvod cifara = "+proizvod);
		System.out.println("Kub broja "+ s+" = "+kubS);
		System.out.println("Kub broja "+ d+" = "+kubD);
		System.out.println("Kub broja "+ j+" = "+kubJ);
		System.out.println("Suma kubova cifara = "+sumaKubova);
		System.out.println("Broj koji se dobija ispisom cifara u obrnutom redosledu: "+ispis);
	
		sc.close();
	}

}

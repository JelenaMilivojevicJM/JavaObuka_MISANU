package dz1_1zad_paket2_JelenaM;

import java.util.Scanner;
import dz1_1zad_paket1_JelenaM.*;

public class Main {
	// Glavna izvodjacka klasa i njena glavna izvodjacka metoda
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// Kreiranje objekta prvog vektora i inicijalizacija granica opsega
			System.out.println("Unosenje Opsega Indexa vektora V1");
			System.out.println("Unesite donju granicu indexa v1: ");
			int minV1 = sc.nextInt();
			System.out.println("Unesite gonrju granicu indexa v1: ");
			int maxV1 = sc.nextInt();
			Vektor v1 = new Vektor(minV1, maxV1);
			double komponentaV1[] = new double[10];
			System.out.println("Unesite Komponeknte prvog vektora V1: ");
			for (int i = minV1; i <= maxV1; i++) {
				komponentaV1[i] = sc.nextDouble();
				for (int j = minV1; j <= maxV1; j++) {
					v1.setKomponenta(j++, komponentaV1);
				}
			}

			// Dohvatanje i stampanje komponenta : ");
			System.out.println("Komponente vektora V1: ");
			for (int i = minV1; i <= maxV1; i++) {
				System.out.println(komponentaV1[i] + " ");
			}

			System.out.println("Unosenje Opsega Indexa vektora V2");
			System.out.println("Unesite donju granicu v2: ");
			int minV2 = sc.nextInt();
			System.out.println("Unesite gonrju granicu v2: ");
			int maxV2 = sc.nextInt();

			// Kreiranje objekta prvog vektora i inicijalizacija granica opsega
			Vektor v2 = new Vektor(minV2, maxV2);
			double komponentaV2[] = new double[10];
			System.out.println("Unesite Komponeknte prvog vektora V2: ");
			for (int i = minV2; i <= maxV2; i++) {
				komponentaV2[i] = sc.nextDouble();
				for (int j = minV2; j <= maxV2; j++) {
					v2.setKomponenta(j++, komponentaV2);
				}

			}
			// Dohvatanje i stampanje komponenta : ");
			System.out.println("Komponente vektora V2: ");
			for (int i = minV2; i <= maxV2; i++) {
				System.out.println(komponentaV2[i] + " ");
			}
			// Skalarni Proizvod:
			System.out.println("Skalarni Proizvod unetih vektora: " + Vektor.skalarniProizvod(v1, v2));

		} catch (Izuzetak e) {
			System.out.println(e);
		}
		sc.close();
		/*
		 * Primer provere 1, izlaz: 
		 * Unosenje Opsega Indexa vektora V1
Unesite donju granicu indexa v1: 
1
Unesite gonrju granicu indexa v1: 
4
Unesite Komponeknte prvog vektora V1: 
1
2
3
4
Komponente vektora V1: 
1.0 
2.0 
3.0 
4.0 
Unosenje Opsega Indexa vektora V2
Unesite donju granicu v2: 
2
Unesite gonrju granicu v2: 
5
Unesite Komponeknte prvog vektora V2: 
2
3
4
5
Komponente vektora V2: 
2.0 
3.0 
4.0 
5.0 
Skalarni Proizvod unetih vektora: 40.0

		 * 
		 * Primer provere 2,sa izuzetkiom, izlaz: 
		 * Unosenje Opsega Indexa vektora V1
Unesite donju granicu indexa v1: 
1
Unesite gonrju granicu indexa v1: 
4
Unesite Komponeknte prvog vektora V1: 
1
2
3
4
Komponente vektora V1: 
1.0 
2.0 
3.0 
4.0 
Unosenje Opsega Indexa vektora V2
Unesite donju granicu v2: 
2
Unesite gonrju granicu v2: 
6
Unesite Komponeknte prvog vektora V2: 
2
3
4
5
6
Komponente vektora V2: 
2.0 
3.0 
4.0 
5.0 
6.0 
Izuzetak! Neadekvatne duzine vektora!
		 */
	}

}

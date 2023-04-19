package paket_DZ2_4zad_JelenaMilivojevic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		NizTacki nizTacki = new NizTacki();

		Tacka t = new Tacka();

		nizTacki.dodaj(t);

		System.out.println("Unesite broj tacki: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite masu " + (i + 1) + ". tacke: ");
			double masa = sc.nextDouble();
			System.out.println("Unesite koordinate tacke (x, y, z): ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			Tacka novaTacka = new Tacka(masa, x, y, z);
			nizTacki.dodaj(novaTacka);
		}
		nizTacki.ispisi();
		System.out.println("Unesite koordinate tacke za koju trazite najprivlacniju tacku: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		Tacka trazenaTacka = new Tacka(1.0, x, y, z);
		Tacka najPrivlacnijaTacka = nizTacki.najprivlacnija(trazenaTacka);
		System.out.printf("Najprivlacnija tacka ima koordinate: x=%.2f y=%.2f z=%.2f%n", najPrivlacnijaTacka.getX(),
				najPrivlacnijaTacka.getY(), najPrivlacnijaTacka.getZ());
		sc.close();
		
		/*Primer izlaza:
		 * Unesite broj tacki: 
3
Unesite masu 1. tacke: 
12
Unesite koordinate tacke (x, y, z): 
1
2
3
Unesite masu 2. tacke: 
15
Unesite koordinate tacke (x, y, z): 
2
3
4
Unesite masu 3. tacke: 
17
Unesite koordinate tacke (x, y, z): 
4
5
6
m=1.00 x=0.00 y=0.00 z=0.00
m=12.00 x=1.00 y=2.00 z=3.00
m=15.00 x=2.00 y=3.00 z=4.00
m=17.00 x=4.00 y=5.00 z=6.00
Unesite koordinate tacke za koju trazite najprivlacniju tacku: 
1 3 5
Najprivlacnija tacka ima koordinate: x=2.00 y=3.00 z=4.00*/
	}
}
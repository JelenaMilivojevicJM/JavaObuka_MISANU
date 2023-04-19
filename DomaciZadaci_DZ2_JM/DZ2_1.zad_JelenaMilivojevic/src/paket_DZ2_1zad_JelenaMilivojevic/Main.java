package paket_DZ2_1zad_JelenaMilivojevic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Kupa1:
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite Vrednosti kupe 1 ");
		System.out.println("Unesite r1: ");
		double r1 = sc.nextDouble();
		System.out.println("Unesite r2 : ");
		double r2 = sc.nextDouble();
		System.out.println("Unesite h: ");
		double h = sc.nextDouble();

		ZarubljenaKupa kupa1 = new ZarubljenaKupa(r1, r2, h);
		kupa1.getR1();
		kupa1.getR2();
		kupa1.getH();
		double zapreminaKupe1 = kupa1.getZapremina();
		System.out.println("Zapremina Kupe1 = "+zapreminaKupe1);

		// Kupa2
		System.out.println("Unesite Vrednosti kupe 3 ");
		System.out.println("Unesite r1: ");
		double r11 = sc.nextDouble();
		System.out.println("Unesite r2 : ");
		double r22 = sc.nextDouble();
		System.out.println("Unesite h: ");
		double hh = sc.nextDouble();

		ZarubljenaKupa kupa2 = new ZarubljenaKupa(r11, r22, hh);
		kupa2.getR1();
		kupa2.getR2();
		kupa2.getH();
		double zapreminaKupe2 = kupa2.getZapremina();
		System.out.println("Zapremina Kupe2 = "+zapreminaKupe2);
		
		// Kupa3
		System.out.println("Unesite Vrednosti kupe 3 ");
		System.out.println("Unesite r1: ");
		double r111 = sc.nextDouble();
		System.out.println("Unesite r2 : ");
		double r222 = sc.nextDouble();
		System.out.println("Unesite h: ");
		double hhh = sc.nextDouble();

		ZarubljenaKupa kupa3 = new ZarubljenaKupa(r111, r222, hhh);
		kupa3.getR1();
		kupa3.getR2();
		kupa3.getH();
		double zapreminaKupe3 = kupa3.getZapremina();
		System.out.println("Zapremina Kupe3 = "+zapreminaKupe3);
		
		// Kupa4
		System.out.println("Unesite Vrednosti kupe 4 ");
		System.out.println("Unesite r1: ");
		double r1111 = sc.nextDouble();
		System.out.println("Unesite r2 : ");
		double r2222 = sc.nextDouble();
		System.out.println("Unesite h: ");
		double hhhh = sc.nextDouble();

		ZarubljenaKupa kupa4 = new ZarubljenaKupa(r1111, r2222, hhhh);
		kupa4.getR1();
		kupa4.getR2();
		kupa4.getH();
		double zapreminaKupe4 = kupa4.getZapremina();
		System.out.println("Zapremina Kupe4 = "+zapreminaKupe4);
		
		// Kupa5
		System.out.println("Unesite Vrednosti kupe 5 ");
		System.out.println("Unesite r1: ");
		double r11111 = sc.nextDouble();
		System.out.println("Unesite r2 : ");
		double r22222 = sc.nextDouble();
		System.out.println("Unesite h: ");
		double hhhhh = sc.nextDouble();

		ZarubljenaKupa kupa5 = new ZarubljenaKupa(r11111, r22222, hhhhh);
		kupa5.getR1();
		kupa5.getR2();
		kupa5.getH();
		double zapreminaKupe5 = kupa5.getZapremina();
		System.out.println("Zapremina Kupe5 = "+zapreminaKupe5);
		
		// Popunjavanje niza:
		NizZarubljenihKupa niz = new NizZarubljenihKupa();

		niz.dodajKupu(kupa1);
		niz.dodajKupu(kupa2);
		niz.dodajKupu(kupa3);
		niz.dodajKupu(kupa4);
		niz.dodajKupu(kupa5);

		if (niz.getBrojElemenata() == 0) {
			System.out.println("Niz je prazan!");
		}
	
		System.out.println("Niz zarubljenih kupa: ");
		niz.prikaz();
		
		int minIndex = niz.najmanjaZapremina();
		System.out.println("Kupa sa najmanjom zapreminom ima vrednosti r1 r2 h: " + niz.getKupa(minIndex));
		sc.close();
		
		/* Pregled resenja: 
		 * Izlaz:
		 * Unesite Vrednosti kupe 1 
Unesite r1: 
1.1
Unesite r2 : 
2.1
Unesite h: 
1.3
Zapremina Kupe1 = 10.795559555285728
Unesite Vrednosti kupe 3 
Unesite r1: 
2.1
Unesite r2 : 
3.1
Unesite h: 
3.2
Zapremina Kupe2 = 68.79669032341168
Unesite Vrednosti kupe 3 
Unesite r1: 
1.4
Unesite r2 : 
4.1
Unesite h: 
2.3
Zapremina Kupe3 = 59.03366755360579
Unesite Vrednosti kupe 4 
Unesite r1: 
5.2
Unesite r2 : 
1.1
Unesite h: 
2.3
Zapremina Kupe4 = 81.81859187254138
Unesite Vrednosti kupe 5 
Unesite r1: 
3.4
Unesite r2 : 
3.5
Unesite h: 
1.5
Zapremina Kupe5 = 56.093136829845754
Niz zarubljenih kupa: 
K(1.1, 2.1, 1.3)
K(2.1, 3.1, 3.2)
K(1.4, 4.1, 2.3)
K(5.2, 1.1, 2.3)
K(3.4, 3.5, 1.5)
Kupa sa najmanjom zapreminom ima vrednosti r1 r2 h: K(1.1, 2.1, 1.3)
*/
	}

}

package paket_DZ2_5zad_JelenaMilivojevic;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		TrkackiAuto auto = new TrkackiAuto(1000, "Ferrari");

		// kreiranje nekoliko instanci bicikla i kamiona
		Bicikl b1 = new Bicikl(10.0, "BMX");
		Bicikl b2 = new Bicikl(12.5, "Trek");
		Kamion k1 = new Kamion(3000.0, 5000.0, "Scania");
		Kamion k2 = new Kamion(2500.0, 4000.0, "MAN");

		// kreiranje instance generickog niza za vozila
		GenNiz<Vozilo> vozila = new GenNiz<Vozilo>(4);

		
		try {
			// dodavanje vozila u niz
			vozila.dodajElement(b1);
			vozila.dodajElement(b2);
			vozila.dodajElement(k1);
			vozila.dodajElement(k2);
		} catch (Izuzetak e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ispisivanje vozila u nizu
		for (int i = 0; i < vozila.brojElemenata(); i++) {
			try {
				vozila.dohvatiElement(i).upisiUTok();
			} catch (Izuzetak e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// kreiranje nove voznje
		Voznja voznja = new Voznja();

		// dodavanje etapa voznje
		voznja.zapocniVoznju();
		voznja.dodajEtapu(1, 10.0);
		voznja.dodajEtapu(2, 20.0);
		voznja.dodajEtapu(3, 15.0);

		// dodavanje voznje u listu voznji trkackog auta

		auto.dodajVoznju(voznja);

		// kreiranje nove voznje
		voznja = new Voznja();

		// dodavanje etapa vožnje
		voznja.zapocniVoznju();
		voznja.dodajEtapu(1, 25.0);
		voznja.dodajEtapu(2, 35.0);
		voznja.dodajEtapu(3, 20.0);

		// dodavanje voznje u listu vožnji trkackog auta
		auto.dodajVoznju(voznja);

		// ispisivanje duzine najbrze voznje
		System.out.printf("Dužina najbrže vožnje: %.2f km\n", auto.najbrzaVoznja().dohvatiUkupnuDuzinu());

	}
	/* Dodatni kod za trkacko vozilo:
//	auto.zapocniVoznju();
//	auto.dodajEtapu(30, 150);
//	auto.dodajEtapu(40, 200);
//	auto.dodajEtapu(50, 180);
//	auto.dodajVoznju(auto.najbrzaVoznja());
//	auto.zapocniVoznju();
//	auto.dodajEtapu(20, 120);
//	auto.dodajEtapu(10, 140);
//	auto.dodajEtapu(30, 170);
//	auto.dodajVoznju(auto.najbrzaVoznja());
//
//	ArrayList<Voznja> voznje = auto.dohvatiVoznje();
//	for (int i = 0; i < voznje.size(); i++) {
//		System.out.printf("Duzina voznje %d: %d km\n", i + 1, (int) voznje.get(i).dohvatiUkupnuDuzinu());
//	}
//} */
	
	/*Primer izlaznog resenja za razne tipove vozila: BMX, tezina: 10.00 kg
Trek, tezina: 12.50 kg
Scania, tezina: 3000.00 kg, teret: 0.00 kg
MAN, tezina: 2500.00 kg, teret: 0.00 kg
Dužina najbrže vožnje: 6.00 km */


}
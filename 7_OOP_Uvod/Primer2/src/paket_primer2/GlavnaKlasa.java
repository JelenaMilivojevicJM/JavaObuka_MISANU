package paket_primer2;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// Povezivanje klasa - Kreiranje dva nova objekata(instance):
		Rastojanje rastojanjeObjekat1 = new Rastojanje();
		Rastojanje rastojanjeObjekat2 = new Rastojanje();

		// DODELJIVANJE PODATAKA OBJEKTU:
		// ime_Objekta.ime_PodatkaizKlase = vrednost;

		// DODELJIVANJE PODATAKA OBJEKTU rastojanjeObjekat1:
		// Dodeljivanje vrednosti podatku stopala(podataka koji opisuje objekat) za
		// objekat r1
		rastojanjeObjekat1.stopala = 14;

		// Dodeljivanje vrednosti podatku inci, za objekat r2
		rastojanjeObjekat1.inci = 9.5;
		// Cita se: double vrednost 9.5 dodeljujemo podatku inci objekta r1, koji
		// pripada klasi Rastojanje

		// DODELJIVANJE PODATAKA OBJEKTU rastojanjeObjekat2:
		rastojanjeObjekat2.stopala = 19;
		rastojanjeObjekat2.inci = 5.5;
		// Cita se: vrednost 5.5 dodeljuje se podatku inci, objekta rastojanjeObjekat2,
		// koji je izveden iz klase Rastojanje

		System.out.println("Rastojanje 1: " + rastojanjeObjekat1.stopala + "\'-" + rastojanjeObjekat1.inci + "\"");
		System.out.println("Rastojanje 2: " + rastojanjeObjekat2.stopala + "\'-" + rastojanjeObjekat2.inci + "\"");
	}

	// Kreiranje objekta: ime_Klase ime_Objekta = new ime_Klase();

	// Pozivanje metoda objekta klase: ime_Objekta.ime_Metoda();

	// Dodeljivanje podataka objektu klase: ime_Objekta.ime_Podatka = vrednost;

}

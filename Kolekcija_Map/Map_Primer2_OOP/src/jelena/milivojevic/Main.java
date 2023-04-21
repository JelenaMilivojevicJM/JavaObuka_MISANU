package jelena.milivojevic;

public class Main {

	public static void main(String[] args) {
		// Kreiranje objekata klase Ucenik - 2 učenika
		Ucenik ucenik1 = new Ucenik("Mika", 15);
		Ucenik ucenik2 = new Ucenik("Zika", 16);

		// Dodavanje ocena za svakog učenika
		ucenik1.dodajOcenu("Matematika", 9);
		ucenik1.dodajOcenu("Fizika", 8);
		ucenik1.dodajOcenu("Hemija", 7);
		ucenik1.dodajOcenu("Engleski", 10);

		ucenik2.dodajOcenu("Matematika", 10);
		ucenik2.dodajOcenu("Fizika", 7);
		ucenik2.dodajOcenu("Hemija", 6);
		ucenik2.dodajOcenu("Engleski", 9);

		// Prikazivanje ocena
		System.out.println("Ocene učenika " + ucenik1.getIme() + ":");
		ucenik1.ispisOcene();
		System.out.println("Ocene učenika " + ucenik2.getIme() + ":");
		ucenik2.ispisOcene();
		
		//Brisanje nekih ocena iz kolekcije ocena
		 // Uklanjanje ocene
		ucenik1.izbrisiOcenu("Fizika");
		ucenik2.izbrisiOcenu("Hemija");
        
        // Prikazivanje ocena nakon uklanjanja
        System.out.println("Ocene učenika " + ucenik1.getIme() + " nakon uklanjanja ocene iz Fizike:");
        ucenik1.ispisOcene();
        System.out.println("Ocene učenika " + ucenik2.getIme() + " nakon uklanjanja ocene iz Hemije:");
        ucenik2.ispisOcene();
	}

}

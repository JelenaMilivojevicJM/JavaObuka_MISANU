package paket;

public class MainMatrica {

	public static void main(String[] args) {
		//Kreiranje objekta = matrice i inicijalizacija broja vrsta i kolona
		Matrica m = new Matrica(3,3);
		
		//Hvatanje broja kolona i vrsta
		System.out.println("Broj vrsta: "+m.getVrsta());
		System.out.println("Broj kolona: "+m.getKolona());
		
		//Pozivanje metoda radi prikaza odredjenih elemenata
		m.postaviElement(1, 2, 25);
		System.out.println("Vrednost elementa je: "+m.dohvatiEelement(1, 2));
		
		//Ispis cele matrice
		System.out.println("Matrica: ");
		System.out.println(m.toString());
	}

}

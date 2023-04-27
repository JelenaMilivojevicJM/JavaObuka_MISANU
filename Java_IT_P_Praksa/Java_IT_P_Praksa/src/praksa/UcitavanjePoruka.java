package praksa;

import java.util.List;

public interface UcitavanjePoruka {
	/*
	 * Ovaj Interface sadrži statičku metodu loadMessages koja prima jedan argument
	 * tipa String koji predstavlja ime fajla. Metoda vraća listu stringova koja se
	 * dobija pozivanjem metode loadMessages iz klase FileHelper. Ova metoda se
	 * koristi za učitavanje poruka iz fajla sa imenom koje je prosleđeno kao
	 * argument.
	 */
	static List<String> loadMessages(String fileName) {
		return FileHelper.loadMessages(fileName);
	}
}
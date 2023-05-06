package paketClanovi;

//Uvoza paketa potrebnih za izvršavanje programa
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerDeser {

	// Ova klasa služi sa serijalizaciju i deserijalizaciju objekata kalse Clan

	// SERIJALIZACIJA:
	public void serijalizuj(List<Clan> clanovi, String nazivFajla) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clanovi.ser"));
		oos.writeObject(clanovi);
		System.out.println("Lista clanova uspešno serijalizovana.");
		oos.close();
	}

	// DESERIJALIZACIJA:
	public List<Clan> deserijalizuj(String nazivFajla)
			throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazivFajla));

		List<Clan> clanovi = (List<Clan>) ois.readObject();

		ois.close();
		// Naznačavamo da metoda vraća vrednost kreirane liste
		return clanovi;
	}

}

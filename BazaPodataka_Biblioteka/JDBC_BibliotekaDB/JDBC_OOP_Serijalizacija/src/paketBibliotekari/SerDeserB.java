package paketBibliotekari;

//Uvoza paketa potrebnih za izvršavanje programa
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerDeserB {

	// Ova klasa služi sa serijalizaciju i deserijalizaciju objekata kalse Clan

	// SERIJALIZACIJA:
	public void serijalizuj(List<Bibliotekar> bibliotekari, String nazivFajla) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotekari.ser"));
		oos.writeObject(bibliotekari);
		System.out.println("Lista clanova uspešno serijalizovana.");
		oos.close();
	}

	// DESERIJALIZACIJA:
	public List<Bibliotekar> deserijalizuj(String nazivFajla)
			throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazivFajla));

		List<Bibliotekar> bibliotekari = (List<Bibliotekar>) ois.readObject();

		ois.close();
		// Naznačavamo da metoda vraća vrednost kreirane liste
		return bibliotekari;
	}

}


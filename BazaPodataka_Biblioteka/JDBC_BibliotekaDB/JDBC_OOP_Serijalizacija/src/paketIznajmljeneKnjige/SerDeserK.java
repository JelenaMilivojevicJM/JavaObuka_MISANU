package paketIznajmljeneKnjige;
//Uvoza paketa potrebnih za izvršavanje programa
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerDeserK {
	// Ova klasa služi sa serijalizaciju i deserijalizaciju objekata kalse Knjiga

		// SERIJALIZACIJA:
		public void serijalizuj(List<Knjiga> iznajmljeneKnjige, String nazivFajla) throws FileNotFoundException, IOException {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("iznajmljeneKnjige.ser"));
			oos.writeObject(iznajmljeneKnjige);
			System.out.println("Lista iznajmljenih knjiga uspešno serijalizovana.");
			oos.close();
		}

		// DESERIJALIZACIJA:
		public List<Knjiga> deserijalizuj(String nazivFajla)
				throws FileNotFoundException, IOException, ClassNotFoundException {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazivFajla));

			List<Knjiga> iznajmljeneKnjige = (List<Knjiga>) ois.readObject();

			ois.close();
			// Naznačavamo da metoda vraća vrednost kreirane liste
			return iznajmljeneKnjige;
		}
}

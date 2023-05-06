package paketIznajmljeneKnjige;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import paketClanovi.Clan;
import paketClanovi.SerDeser;
public class Main {
		public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			
			// 1.Adresa na kojoj se nalazi baza
			String url = "jdbc:mysql://localhost:3308/bazabiblioteke";

			// 2.Korisnicko ime servera kome pristupamo
			String username = "root";

			// 3.Pasword servera kome pristpamo
			
			String password = "";

			System.out.println("Konekcija....");

			// Konektovanje sa bazom preko klasa connection i driver managera:

			try (Connection conn = DriverManager.getConnection(url, username, password)) {

				System.out.println("Uspesna konekcija sa bazom!");

				// Upit postavljamo kroz objekat tipa string:
				String sqlselect = "SELECT * FROM knjige WHERE status=\"Iznajmljena\"";

				// Objekat za komunikaciju sa bazom
				Statement stmt = conn.createStatement();

				// Objekat za skupljanje rezultata
				ResultSet result = stmt.executeQuery(sqlselect);

				/// Kreiranje liste clanova
				List<Knjiga> iznajmljeneKnjigeList = new ArrayList<Knjiga>();

				while (result.next()) {
					
					int id = result.getInt(1);
					long isbn = result.getLong(2);
					String naziv = result.getString(3);
					String jezik = result.getString(4);
					String izdavac = result.getString(5);
					String status = result.getString(6);
					int pozajmnoOdeljenjeID = result.getInt(7);

					// Automatsko dodavanje elemenata
					iznajmljeneKnjigeList.add(new Knjiga(id,isbn,naziv,jezik,izdavac,status,pozajmnoOdeljenjeID));
				}
				
				// Kreiranje objekta klase SerDeser kako bismo koristili njene metode:
				SerDeserK sdk = new SerDeserK();

				// Serijalizacija:
				sdk.serijalizuj(iznajmljeneKnjigeList,"iznajmljeneKnjige.ser");
				
				//Deserijalizacija
				System.out.println(sdk.deserijalizuj("iznajmljeneKnjige.ser"));
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}

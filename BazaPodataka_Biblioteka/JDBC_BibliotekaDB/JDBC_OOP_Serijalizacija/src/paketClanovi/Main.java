package paketClanovi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
			String sqlselect = "SELECT * FROM clanovi";

			// Objekat za komunikaciju sa bazom
			Statement stmt = conn.createStatement();

			// Objekat za skupljanje rezultata
			ResultSet result = stmt.executeQuery(sqlselect);

			/// Kreiranje liste clanova
			List<Clan> listaClanova = new ArrayList<Clan>();

			while (result.next()) {
				int clanskaKarta = result.getInt(1);
				String ime = result.getString(2);
				String prezime = result.getString(3);
				String datumRodjenja = result.getString(4);
				String telefon = result.getString(5);
				String grad = result.getString(6);
				String ulica = result.getString(7);
				String ubr = result.getString(8);

				// Automatsko dodavanje elemenata
				listaClanova.add(new Clan(clanskaKarta, ime, prezime, datumRodjenja, telefon, grad, ulica, ubr));
			}
			
			// Kreiranje objekta klase SerDeser kako bismo koristili njene metode:
			SerDeser sd = new SerDeser();

			// Serijalizacija:
			sd.serijalizuj(listaClanova,"clanovi.ser");
			
			//Deserijalizacija
			System.out.println(sd.deserijalizuj("clanovi.ser"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

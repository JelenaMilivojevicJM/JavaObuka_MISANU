package paketBibliotekari;
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

	public static void main(String[] args)  throws FileNotFoundException, IOException, ClassNotFoundException {
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
					String sqlselect = "SELECT * FROM bibliotekari";

					// Objekat za komunikaciju sa bazom
					Statement stmt = conn.createStatement();

					// Objekat za skupljanje rezultata
					ResultSet result = stmt.executeQuery(sqlselect);

					/// Kreiranje liste bibliotekara
					List<Bibliotekar> listaBibliotekara = new ArrayList<Bibliotekar>();

					while (result.next()) {
						int sifraZaposlenog = result.getInt(1);
						String ime = result.getString(2);
						String prezime = result.getString(3);
						String grad = result.getString(4);
						String ulica = result.getString(5);
						String ubr = result.getString(6);
						String telefon = result.getString(7);
						long jmbg = result.getLong(8);
						int bibliotekaID = result.getInt(9);

						// Automatsko dodavanje elemenata
						listaBibliotekara.add(new Bibliotekar(sifraZaposlenog, ime, prezime, grad, ulica, ubr,telefon,jmbg,bibliotekaID));
					}
					
					// Kreiranje objekta klase SerDeser kako bismo koristili njene metode:
					SerDeserB sdB = new SerDeserB();

					// Serijalizacija:
					sdB.serijalizuj(listaBibliotekara,"bibliotekari.ser");
					
					//Deserijalizacija
					System.out.println(sdB.deserijalizuj("bibliotekari.ser"));
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}

}

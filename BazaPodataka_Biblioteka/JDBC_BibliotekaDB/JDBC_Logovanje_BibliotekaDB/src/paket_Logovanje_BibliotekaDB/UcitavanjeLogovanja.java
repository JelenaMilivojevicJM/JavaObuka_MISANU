package paket_Logovanje_BibliotekaDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UcitavanjeLogovanja {

	public static void main(String[] args) {
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
			String sqlselect = "SELECT * FROM logovanja";

			// Objekat za komunikaciju sa bazom
			Statement stmt = conn.createStatement();

			// Objekat za skupljanje rezultata
			ResultSet result = stmt.executeQuery(sqlselect);

			while (result.next()) {
				int logovanjeID = result.getInt(1);
				String datumVremeUlaska = result.getString(2);
				String datumVremeIzlaska = result.getString(3);
				int adminID = result.getInt(4);
				int korisnikID = result.getInt(5);
				int bibliotekaID = result.getInt(6);
				
				StringBuilder builder = new StringBuilder();
				builder.append("----LOGOVANJE---- ");
				builder.append("\nID logovanja: ");
				builder.append(logovanjeID);
				builder.append("\nDatum i Vreme Ulaska: ");
				builder.append(datumVremeUlaska);
				builder.append("\nDatum i Vreme Izlaska: ");
				builder.append(datumVremeIzlaska);
				builder.append("\nID admina: ");
				builder.append(adminID);
				builder.append("\nID korisnika: ");
				builder.append(korisnikID);
				builder.append("\nID biblioteke: ");
				builder.append(bibliotekaID);
				
				System.out.println(builder.toString());

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

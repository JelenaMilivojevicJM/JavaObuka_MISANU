package paket_Logovanje_BibliotekaDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Privilegije {

	public static void main(String[] args) {
		/*Ucitavanje podataka za admine i korisnike. 
		 * Prilikom ucitavanja, u skladu sa ulogom osobe program ispisuje koje privilegije ima. */
		
		
		//Definisanje privilegija
		String posmatrac = "Posmatrac";
		String izmena = "Izmena";
		
		//OBRADA:
		//Ucitavanje podataka i obrada
		
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
			String admini = "SELECT * FROM admini";
			String korisnici = "SELECT * FROM korisnici";
			
			// Objekat za komunikaciju sa bazom
			Statement stmt1 = conn.createStatement();
			Statement stmt2 = conn.createStatement();

			// Objekat za skupljanje rezultata
			ResultSet result1 = stmt1.executeQuery(admini);
			ResultSet result2 = stmt2.executeQuery(korisnici);

			while (result1.next()) {
				int adminID = result1.getInt(1);
				String nickName = result1.getString(2);
				String sifra = result1.getString(3);
				String email = result1.getString(4);
				
				StringBuilder builder1 = new StringBuilder();
				builder1.append("----ULOGA Admin---- ");
				builder1.append("\nID admina: ");
				builder1.append(adminID);
				builder1.append("\nnickName: ");
				builder1.append(nickName);
				builder1.append("\nSifra: ");
				builder1.append(sifra);
				builder1.append("\nEmail: ");
				builder1.append(email);
				builder1.append("\nPrivilegija: ");
				builder1.append(izmena);
				
				System.out.println(builder1.toString());

			}
			
			while (result2.next()) {
				int korisnikID = result2.getInt(1);
				String nickName = result2.getString(2);
				String sifra = result2.getString(3);
				String email = result2.getString(4);
				
				StringBuilder builder2 = new StringBuilder();
				builder2.append("----ULOGA korisnik---- ");
				builder2.append("\nID korisnika: ");
				builder2.append(korisnikID);
				builder2.append("\nnickName: ");
				builder2.append(nickName);
				builder2.append("\nSifra: ");
				builder2.append(sifra);
				builder2.append("\nEmail: ");
				builder2.append(email);
				builder2.append("\nPrivilegija: ");
				builder2.append(posmatrac);
				
				System.out.println(builder2.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

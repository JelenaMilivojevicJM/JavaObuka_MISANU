package paket_Logovanje_BibliotekaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UcitavanjeAdmina {

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
					String sqlselect = "SELECT * FROM admini";

					// Objekat za komunikaciju sa bazom
					Statement stmt = conn.createStatement();

					// Objekat za skupljanje rezultata
					ResultSet result = stmt.executeQuery(sqlselect);

					while (result.next()) {
						int adminID = result.getInt(1);
						String nickName = result.getString(2);
						String sifra = result.getString(3);
						String email = result.getString(4);
						
						StringBuilder builder = new StringBuilder();
						builder.append("----Admin---- ");
						builder.append("\nID admina: ");
						builder.append(adminID);
						builder.append("\nnickName: ");
						builder.append(nickName);
						builder.append("\nSifra: ");
						builder.append(sifra);
						builder.append("\nEmail: ");
						builder.append(email);

						System.out.println(builder.toString());

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

	}

}

package paket;

import java.sql.Connection;//Ovo ovde je interface
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; //Ovo importuj rucno!

public class Select {

	public static void main(String[] args) {
		// Potrebni podaci za povezivanje
		// 1.Adresa na kojoj se nalazi baza
		// 2.Korisnicko ime servera kome pristupamo
		// 3.Pasword servera kome pristpamo

		// Objekti za te info:
		String url = "jdbc:mysql://localhost:3308/tb";
		String username = "root";
		String password = "";

		// Konektovanje sa bazom:
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi!");

			// Upit:
			String sqlselect = "SELECT * FROM korisnici";

			// Statement java.sql klasa
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sqlselect);

			while (result.next()) {
				String ki = result.getString(2);
				String lo = result.getString(3);
				String ime = result.getString(4);
				String email = result.getString(5);

				StringBuilder builder = new StringBuilder();
				builder.append("Korisnicko ime: ");
				builder.append(ki);

				builder.append("\nLozinka: ");
				builder.append(lo);

				builder.append("\nIme: ");
				builder.append(ime);

				builder.append("\nEmail: ");
				builder.append(email);

				System.out.println(builder.toString());
			}

		} catch (SQLException e) {
			System.out.println("Izuzetak!");
			e.printStackTrace();
		}
	}

}

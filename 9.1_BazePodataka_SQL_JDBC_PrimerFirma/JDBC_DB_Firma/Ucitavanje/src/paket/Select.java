package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// Potrebni podaci za povezivanje
		// 1.Adresa na kojoj se nalazi baza
		String url = "jdbc:mysql://localhost:3306/firma";
		// 2.Korisnicko ime servera kome pristupamo
		String username = "root";
		// 3.Pasword servera kome pristpamo
		String password = "";

		// Konektovanje sa bazom:
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi!");

			// Upit:
			String sqlselect = "SELECT * FROM radnici";

			// Statement java.sql klasa
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(sqlselect);

			while (result.next()) {
				int radnik_id = result.getInt(1);
				String ime = result.getString(2);
				String prezime = result.getString(3);
				String datumrodj = result.getString(4);
				String pol = result.getString(5);
				int plata = result.getInt(6);
				int sektor_id = result.getInt(7);

				StringBuilder builder = new StringBuilder();
				builder.append("-----------------------------");
				builder.append("\nRadnik ID: ");
				builder.append(radnik_id);

				builder.append("\nIme: ");
				builder.append(ime);

				builder.append("\nPrezime: ");
				builder.append(prezime);

				builder.append("\nDatum Rodjenja: ");
				builder.append(datumrodj);

				builder.append("\nPol: ");
				builder.append(pol);

				builder.append("\nPlata: ");
				builder.append(plata);

				builder.append("\nSektor ID: ");
				builder.append(sektor_id);
				builder.append("\n-----------------------------");
				System.out.println(builder.toString());
			}

		} catch (SQLException e) {
			System.out.println("Izuzetak!");
			e.printStackTrace();
		}
	}

}

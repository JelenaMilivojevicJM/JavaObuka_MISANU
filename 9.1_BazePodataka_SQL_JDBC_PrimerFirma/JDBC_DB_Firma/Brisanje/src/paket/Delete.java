package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		// Informacije o bazi sa kojom se povezujemo:
		String url = "jdbc:mysql://localhost:3306/firma";
		String username = "root";
		String password = "";

		System.out.println("Konekcija.... ");
		// Konektovanje sa bazom:
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi!");

			// Upit za brisanje
			String sqldelete = "DELETE FROM sektori WHERE sektor_id=?";

			PreparedStatement ps = conn.prepareStatement(sqldelete);

			// Tacna adresa sta brisemo (konkretan ID broj)
			ps.setInt(1, 6);

			int izbrisanPodatak = ps.executeUpdate();

			// Provera statusa promenljive za izmenjen podatak
			if (izbrisanPodatak > 0) {
				System.out.println("Podatak je uspesno obrisan!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

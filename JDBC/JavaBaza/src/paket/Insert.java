package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		// Objekti za te info:
		String url = "jdbc:mysql://localhost:3308/tb";
		String username = "root";
		String password = "";

		System.out.println("Konekcija.... ");
		// Konektovanje sa bazom:
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi!");

			// Upit:
			String sqlinsert = "INSERT INTO `korisnici`(`korisnickoIme`, `loznka`, `ime`, `email`) VALUES (?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sqlinsert);

			pstmt.setString(1, "plavoNebo");
			pstmt.setString(2, "pass12345");
			pstmt.setString(3, "Jelena");
			pstmt.setString(4, "abcJelena@gmail.com");

			// Metoda za izvrsavanje naredbe objekta ps je njegova metoda executeUpdate
			int unetPodatak = pstmt.executeUpdate();

			// Provera statusa promenljive za unet podatak
			if (unetPodatak > 0) {
				System.out.println("Podatak je upisan!");
			}

		} catch (SQLException e) {
			System.out.println("Izuzetak!");
			e.printStackTrace();
		}
	}

}

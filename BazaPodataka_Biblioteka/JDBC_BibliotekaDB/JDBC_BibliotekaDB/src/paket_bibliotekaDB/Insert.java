package paket_bibliotekaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3308/bazabiblioteke";
		String username = "root";
		String password = "";

		System.out.println("Konekcija....");

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi!");

			// INSERT:
			String sqlinsert = "INSERT INTO `knjige`(`isbn`, `naziv`, `jezik`, `izdavac`) VALUES (?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sqlinsert);

			// Setovanje vrednosti
			pstmt.setInt(1, 145222);
			pstmt.setString(2, "Jelena, zena koje nema");
			pstmt.setString(3, "Srpski");
			pstmt.setString(4, "Laguna");

			// Izvrsavanje
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
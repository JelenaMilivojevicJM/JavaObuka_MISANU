package paket_bibliotekaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3308/bazabiblioteke";
		String username = "root";
		String password = "";
		System.out.println("Konekcija....");

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi!");

			String sqlupdate = "UPDATE knjige SET jezik=? WHERE isbn=?";

			PreparedStatement pstmt = conn.prepareStatement(sqlupdate);

			// Setovanje vrednosti
			pstmt.setString(1, "Engleski");

			pstmt.setInt(2, 202020);

			// Izvrsavanje
			int izmena = pstmt.executeUpdate();

			// Provera statusa promenljive za unet podatak
			if (izmena > 0) {
				System.out.println("Podatak je upisan!");
			}

		} catch (SQLException e) {
			System.out.println("Izuzetak!");
			e.printStackTrace();
		}
	}

}

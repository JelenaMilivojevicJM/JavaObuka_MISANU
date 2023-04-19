package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		String adresa = "jdbc:mysql://localhost:3308/spisakbiblioteka";
		String uname = "root";
		String pass = "";

		System.out.println("Konektovanje...");

		try (Connection conn = DriverManager.getConnection(adresa, uname, pass)) {
			System.out.println("Uspesno konektovanje do baze!");

			String izmena = "UPDATE biblioteke set ulica=? WHERE bibliotekaID=?";

			PreparedStatement psmt = conn.prepareStatement(izmena);

			psmt.setString(1, "Visnjicka");
			psmt.setInt(2, 2);

			int uradjeno = psmt.executeUpdate();

			if (uradjeno > 0) {
				System.out.println("Uspesna izmena!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

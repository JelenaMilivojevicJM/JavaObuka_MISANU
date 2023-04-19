package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		String adresa = "jdbc:mysql://localhost:3308/spisakbiblioteka";
		String uname = "root";
		String pass = "";

		System.out.println("Konektovanje...");

		try (Connection conn = DriverManager.getConnection(adresa, uname, pass)) {
			System.out.println("Uspesno konektovanje do baze!");

			String brisanje = "DELETE FROM biblioteke WHERE bibliotekaID=?";

			PreparedStatement psmt = conn.prepareStatement(brisanje);

			psmt.setInt(1, 4);

			int uradjeno = psmt.executeUpdate();

			if (uradjeno > 0) {
				System.out.println("Uspesno obavljeno brisanje!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

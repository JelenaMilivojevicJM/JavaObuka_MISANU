package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		String adresa = "jdbc:mysql://localhost:3308/spisakbiblioteka";
		String uname = "root";
		String pass = "";

		System.out.println("Konektovanje...");

		try (Connection conn = DriverManager.getConnection(adresa, uname, pass)) {
			System.out.println("Uspesno konektovanje do baze!");

			String unos = "INSERT INTO biblioteke(bibliotekaID,ImeBiblioteke,ulica,broj)VALUES(?,?,?,?)";

			PreparedStatement pstm = conn.prepareStatement(unos);

			pstm.setInt(1, 4);
			pstm.setString(2, "Mihajlo Pupin");
			pstm.setString(3, "Pomoravska");
			pstm.setInt(4, 7);

			int insertovano = pstm.executeUpdate();

			if (insertovano > 0) {
				System.out.println("Uspesno dodati podaci!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

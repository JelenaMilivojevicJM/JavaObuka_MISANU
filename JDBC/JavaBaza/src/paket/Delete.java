package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		// Objekti za te info:
		String url = "jdbc:mysql://localhost:3308/tb";
		String username = "root";
		String password = "";

		System.out.println("Konekcija.... ");
		// Konektovanje sa bazom:
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println("Uspesna konekcija ka bazi!");
			
			String sqldelete ="DELETE FROM korisnici WHERE korisnickoIme =?";
			
			//Prosledjivati podatak/slati //podesiti koji je podatak u sulovu koji postavljamo : znati koristimo prepared statement!!
			PreparedStatement ps = conn.prepareStatement(sqldelete);
			
			ps.setString(1,"korisnik1");
			
			int izbrisanPodatak = ps.executeUpdate();
			
			//Provera statusa promenljive za izmenjen podatak
			if(izbrisanPodatak>0) {
				System.out.println("Podatak je uspesno obrisan!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

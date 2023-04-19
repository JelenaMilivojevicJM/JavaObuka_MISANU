package paket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		// Objekti za te info:
				String url = "jdbc:mysql://localhost:3308/tb";
				String username = "root";
				String password = "";

				System.out.println("Konekcija.... ");
				// Konektovanje sa bazom:
				try (Connection conn = DriverManager.getConnection(url, username, password)) {
					System.out.println("Uspesna konekcija ka bazi!");

					String sqlupdate ="UPDATE korisnici SET loznka=?,ime=?,email=? WHERE korisnickoIme=?";
							
					PreparedStatement ps = conn.prepareStatement(sqlupdate);
					
					//Postavljanje vrednosti koje se salju
					//prvi upitnik ima vrednost ? i takp redom.
					ps.setString(1,"123korisnik");
					ps.setString(2,"Neko");
					ps.setString(3,"neko@gmail.com");
					
					
					//Moramo da biramo postojece korisnicko ime jer je tu uslov
					//jer je 4.? u uslovu
					ps.setString(4,"korisnik1");
					
					//Metoda za izvrsavanje naredbe objekta ps je njegova metoda executeUpdate
					int promenjenPodatak = ps.executeUpdate();
					
					//Provera statusa promenljive za izmenjen podatak
					if(promenjenPodatak>0) {
						System.out.println("Usepeno izvrsena izmena!");
					}

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
}
}

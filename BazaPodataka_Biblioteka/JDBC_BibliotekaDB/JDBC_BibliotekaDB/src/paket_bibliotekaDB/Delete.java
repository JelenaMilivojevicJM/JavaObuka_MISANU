package paket_bibliotekaDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3308/bazabiblioteke";
		String username = "root";
		String password = "";
		System.out.println("Konekcija....");

		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			System.out.println("Uspesna konekcija ka bazi!");
			
			//DELETE:
				String sqldelete ="DELETE FROM knjige WHERE knjigaID=?";


				PreparedStatement pstmt = conn.prepareStatement(sqldelete);

				//Setovanje vrednosti
				pstmt.setInt(1,145222);

				//Izvrsavanje
				int brisanje= pstmt.executeUpdate();

				// Provera statusa promenljive za unet podatak
				if (brisanje > 0) {
				System.out.println("Podatak je izbrisan!");
				  }

		} catch (SQLException e) {
			System.out.println("Izuzetak!");
			e.printStackTrace();
		}
	}

}

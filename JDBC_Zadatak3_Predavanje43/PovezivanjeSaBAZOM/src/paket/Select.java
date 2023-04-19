package paket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select {

	public static void main(String[] args) {
		String adresa ="jdbc:mysql://localhost:3308/spisakbiblioteka";
		String uname="root";
		String pass="";
		
		System.out.println("Konektovanje...");
		
		try(Connection conn=DriverManager.getConnection(adresa,uname,pass)){
			System.out.println("Uspesno konektovanje do baze!");
			
			String upit ="SELECT * FROM biblioteke";
			
			Statement stmt = conn.createStatement();
			
			ResultSet result = stmt.executeQuery(upit);
			
			while(result.next()) {
				
				int id = result.getInt(1);
				String ImeBiblioteke = result.getString(2);
				String ulica = result.getString(3);
				int broj = result.getInt(4);
				
				StringBuilder builder = new StringBuilder();
				
				builder.append("UPIT: ");
				builder.append(upit);
				
				builder.append("\nID BIBLIOTEKE: ");
				builder.append(id);
				
				builder.append("\nIME: ");
				builder.append(ImeBiblioteke);
				
				builder.append("\nULICA: ");
				builder.append(ulica);
				
				builder.append("\nBroj: ");
				builder.append(broj);
				
				System.out.println(builder.toString());
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
